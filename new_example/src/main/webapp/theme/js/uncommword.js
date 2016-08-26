/**
创建人：安超   创建日期：2013年5月16日

在用户录入汉字时，对于一些生僻怪字有时没法输入，
此组件收集生活中经常用到的生僻字，让用户可以根据
汉字的声母进行汉字的选择，完成生僻字的输入

@method insertUncommonWord([config])
@param {PlainObject} config该对象中唯一属性ajaxUrl用于配置请求的地址
@return {JQueryObject} 调用insertUncommonWord()方法的jQuery对象 
**/
(function ($) {
    $.fn.extend({
        "insertUncommonWord": function (config) {
            var _config = {
                ajaxUrl: './manager/unCommonWords.json'
            },
            $input = $(this),
            $inputOffset = $input.offset(),
            letterSpans = [],
            htmlWordsSpans = {}, //保存所有字母:生僻字
            $uncommonIco,
            $unfamiliarDiv,
            $unfamiliarTitle,
            $spellDiv,
            $wordsDiv;

            function inputBindFocus() {
                //input获得焦点时显示“生僻字图标”
                $input.focus(function () {
                    $(this).next().show();
                });
            }
            function loadUncommonTip() {
                //页面加载“生僻字图标”
                $uncommonIco = $('<span class="uncommonTip" title="输入生僻字"></span>');
                $uncommonIco.insertAfter($input).offset({
                    top: $inputOffset.top,
                    left: $inputOffset.left + $input.outerWidth() + 2
                }).hide().click(function () {
                    $(this).next().show();
                });
            }

            function loadUnfamiliarDiv() {
                //页面加载包含字母和生字的层unfamiliarDiv、字母层unfamiliar-spells、生僻字层unfamiliar-words
                $unfamiliarDiv =
                    $('<div class="unfamiliarDiv">'
                    + '<div class="unfamiliar-title">'
                    + '<div class="unfamiliarClose">关闭</div><div class="unfamiliarText">根据字母选择生僻字</div>'
                    + '</div>'
                    + '<div class="unfamiliar-spells"></div>'
                    + '<div class="unfamiliar-words"></div>'
                    + '</div>');
                $unfamiliarDiv.insertAfter($uncommonIco).offset({
                    top: $inputOffset.top + $input.outerHeight() + 1,
                    left: $inputOffset.left+216
                }).hide();
            }

            function findUnfamiliarDivChild() {
                $unfamiliarTitle = $unfamiliarDiv.find('.unfamiliar-title');
                $spellDiv = $unfamiliarDiv.find('.unfamiliar-spells');
                $wordsDiv = $unfamiliarDiv.find('.unfamiliar-words');

                //关闭unfamiliarDiv和uncommonTip
                $unfamiliarTitle.delegate('.unfamiliarClose', 'click', function () {
                    $(this).parents('.unfamiliarDiv').hide().prev().hide();
                });
            }

            function manageData(data) {
                $.each(data, function (key, value) {
                    letterSpans.push('<span>' + key.toUpperCase() + '</span>');

                    if (value.length > 0) {
                        htmlWordsSpans[key] = '<span>' + value.join('</span><span>') + '</span>';
                    }
                });

                //字母层unfamiliar-spells填充字母内容并绑定事件
                $spellDiv.html(letterSpans.join(''));
            }

            function spellDivBindEvent() {

                //字母span绑定事件
                $spellDiv.delegate('span', {
                    click: function () {
                        //$(this).addClass('spanOver').siblings().removeClass('spanOver');
                    	$(this).parent().find("span").css("color","#000000");
                    	$(this).parent().find("span").css("background-color","#b7d2ff");
                    	$(this).css("color","white");
                    	$(this).css("background-color","#0437c8");
                        $wordsDiv.empty();

                        //生僻字层unfamiliar - words填充字母对应的生僻字并绑定事件
                        var htmlspans = htmlWordsSpans[$(this).text().toLowerCase()];

                        if (htmlspans) {
                            $wordsDiv.html(htmlspans).show();
                        } else {
                            $wordsDiv.hide();
                        }
                    }
                });
            }

            function wordsDivBindEvent() {

                //生字span绑定事件
                $wordsDiv.delegate('span', {
                    mouseenter: function () {
                    	$(this).parent().find("span").css("color","#000000");
                    	$(this).parent().find("span").css("background-color","#E2C608");
                    	$(this).css("color","white");
                    	$(this).css("background-color","#0437c8");
                    },
                    click: function () {
                        var txt = $(this).text();
                        $input.val(function (key, oldValue) {
                            return oldValue + txt;
                        });
                    }
                });
            }

            $.extend(_config, config);

            //加载数据
            $.ajax({
                url: _config.ajaxUrl,
                dataType: 'json',
                success: function (data) {

                    //返回数据异常
                    if (data.ec != 0) {
                        alert(data.em);
                        return;
                    }
                    inputBindFocus();
                    loadUncommonTip();                    
                    loadUnfamiliarDiv();
                    findUnfamiliarDivChild();
                    manageData(data['cd']); //在页面中对html进行数据渲染
                    spellDivBindEvent(); //字母对应span的事件绑定
                    wordsDivBindEvent(); //生字对应span的事件绑定
                },
                error: function (data) {
                    alert('生僻字数据请求地址配置错误！');
                }
            });

            return this;
        }
    });
})(jQuery);