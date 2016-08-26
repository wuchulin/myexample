如何使用Maven插件生成Mybatis代码 
系统中已经集成了生成代码的插件：位置在pom.xml中
<!-- Mybatis generator代码生成插件 配置 -->
<plugin>
	<groupId>org.mybatis.generator</groupId>
	<artifactId>mybatis-generator-maven-plugin</artifactId>
	<version>${plugin.mybatis.generator}</version>
	<configuration>
		<configurationFile>${mybatis.generator.generatorConfig.xml}</configurationFile>
		<overwrite>true</overwrite>
		<verbose>true</verbose>
	</configuration>
</plugin>
			
具体的描述请参见pom.xml

执行的方法：
1、首先在generatorConfig.properties文件中完善并修改相应的配置，数据库驱动的路径、用户名、密码等。
2、修改generatorConfig.xml中的table节点中的tableName值，这里表示了需要生成代码的表
3、RUN AS -> Maven build... ->Goals输入mybatis-generator:generate，运行即可
4、正确与否，自行查看项目Console中的内容