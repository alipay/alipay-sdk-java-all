package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iot.membershipcoupon.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-23 13:25:46
 */
public class AlipayOpenIotMembershipcouponQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5818985894192396882L;

	/** 
	 * 活动ID，用于获取相应的活动信息，来源于商家在B站的配置
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 配置商家发券时使用的商家信息，需要和进入商家中心（B站）时使用的相同
	 */
	@ApiField("auth_pid")
	private String authPid;

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
	}

	public void setAuthPid(String authPid) {
		this.authPid = authPid;
	}
	public String getAuthPid( ) {
		return this.authPid;
	}

}
