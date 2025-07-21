package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.miniapp.layer.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:57:17
 */
public class AlipayOpenMiniMiniappLayerCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8162746535883818364L;

	/** 
	 * 创建活动成功时返回的活动id
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
