package com.tuodao.bp.useraccount.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.tuodao.bp.model.input.demo.DemoDbInput;
import com.tuodao.bp.model.output.member.DemoBizOutput;

/**
 * DEMO 接口
 * @author hechun
 *
 * @created 2017年8月30日
 *
 * @since 1.0.0
 */
public interface IDemoService {
	/**
	 * 获取DEMO LIST
	 * 
	 * @param input
	 *            输入参数
	 * @return
	 */
	List<DemoBizOutput> getDemoList(DemoDbInput input);

	/**
	 * 获得DEMO实例
	 * 
	 * @param input
	 *            输入参数
	 * @return
	 */
	DemoBizOutput getDemoEntity(DemoDbInput input);

	/**
	 * 获取DEMO PAGE LIST 分页
	 * 
	 * @param input
	 *            输入参数
	 * @return
	 */
	PageInfo<DemoBizOutput> getDemoPageList(DemoDbInput input);

	/**
	 * 保存demo
	 * 
	 * @param input
	 *            输入参数
	 * @return
	 */
	int saveDemo(DemoDbInput input);

	/**
	 * 更新demo
	 * 
	 * @param input
	 *            输入参数
	 * @return
	 */
	int updateDemo(DemoDbInput input);
	
	/**
	 * 事物
	 * @param input
	 * @return
	 */
	int testTransactional(DemoDbInput input);
}
