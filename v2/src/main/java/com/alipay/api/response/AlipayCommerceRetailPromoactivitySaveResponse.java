package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.retail.promoactivity.save response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-20 15:27:45
 */
public class AlipayCommerceRetailPromoactivitySaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 3637244243953191669L;

	/** 
	 * 活动类型
	 */
	@ApiField("activity_type")
	private String activityType;

	/** 
	 * 操作类型
	 */
	@ApiField("operate_type")
	private String operateType;

	/** 
	 * 返参列表
	 */
	@ApiField("response_list")
	private String responseList;

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}
	public String getActivityType( ) {
		return this.activityType;
	}

	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}
	public String getOperateType( ) {
		return this.operateType;
	}

	public void setResponseList(String responseList) {
		this.responseList = responseList;
	}
	public String getResponseList( ) {
		return this.responseList;
	}

}
