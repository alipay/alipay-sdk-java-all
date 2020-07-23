package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.WeikeTaskView;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.daowei.weike.taskview.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayDaoweiWeikeTaskviewQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1554879426651743384L;

	/** 
	 * 微客当前城市的任务视图列表
	 */
	@ApiListField("task_views")
	@ApiField("weike_task_view")
	private List<WeikeTaskView> taskViews;

	public void setTaskViews(List<WeikeTaskView> taskViews) {
		this.taskViews = taskViews;
	}
	public List<WeikeTaskView> getTaskViews( ) {
		return this.taskViews;
	}

}
