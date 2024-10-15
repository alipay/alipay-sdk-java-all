package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.vehicleowner.campaign.publish response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:56:01
 */
public class AlipayCommerceTransportVehicleownerCampaignPublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 1112487589738959458L;

	/** 
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 审核状态
	 */
	@ApiField("status")
	private String status;

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
