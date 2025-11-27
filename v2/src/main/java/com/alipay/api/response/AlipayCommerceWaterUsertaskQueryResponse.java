package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.QueryUserTaskListResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.water.usertask.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 14:27:44
 */
public class AlipayCommerceWaterUsertaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8438469333377158262L;

	/** 
	 * 用户任务详情
	 */
	@ApiField("user_task_list_info")
	private QueryUserTaskListResponse userTaskListInfo;

	public void setUserTaskListInfo(QueryUserTaskListResponse userTaskListInfo) {
		this.userTaskListInfo = userTaskListInfo;
	}
	public QueryUserTaskListResponse getUserTaskListInfo( ) {
		return this.userTaskListInfo;
	}

}
