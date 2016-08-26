package com.myexample.base.service;

import java.util.List;

/**
 * 业务处理base接口
 *
 * @param <T>
 */
public interface IBaseService<T> {
	/**
	 * 新增
	 * @param param 数据对象
	 */
	public int insert(T object) throws Exception;
	/**
	 * 修改
	 * @param param 数据对象
	 */
	public int update(T object) throws Exception;
	/**
	 * 删除
	 * @param param 主键
	 */
	public int delete(Long param) throws Exception;
	/**
	 * 查询所有数据
	 * @param param 数据对象
	 * @return 数据对象列表
	 */
	public List<T> list(T object);

	/**
	 * 查询所有数据
	 * @param param 数据对象
	 * @return 数据对象列表
	 */
	public List<T> listAll();
	/**
	 * 查询详情
	 * @param param 数据对象
	 * @return 数据对象
	 */
	public T findOne(T object);
	
	/**
	 * 分页查询
	 * @param object 数据对象
	 * @param page 页号
	 * @param rows 每页记录数
	 * @return 分页对象
	 */
	public List<T> listByPage(T object, Integer page, Integer rows);
}
