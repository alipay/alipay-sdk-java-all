package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.ebpp.instnotice.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-11 16:27:04
 */
public class AlipayEbppEbppInstnoticeCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5411653186115746389L;

	/** 
	 * 流程标识，用来查询流程的执行状态。
	 */
	@ApiField("activity_id")
	private String activityId;

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
	}

}
