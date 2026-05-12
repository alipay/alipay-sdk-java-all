package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.marketing.task.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-23 15:52:44
 */
public class AlipayCommerceIotMarketingTaskCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4249726898696475512L;

	/** 
	 * 投放计划id
	 */
	@ApiField("plan_id")
	private String planId;

	/** 
	 * 4--已上线
5--已失效(下线)
6--上线失败
	 */
	@ApiField("status_code")
	private Long statusCode;

	public void setPlanId(String planId) {
		this.planId = planId;
	}
	public String getPlanId( ) {
		return this.planId;
	}

	public void setStatusCode(Long statusCode) {
		this.statusCode = statusCode;
	}
	public Long getStatusCode( ) {
		return this.statusCode;
	}

}
