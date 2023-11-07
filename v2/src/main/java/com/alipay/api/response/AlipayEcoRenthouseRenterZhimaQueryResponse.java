package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.renthouse.renter.zhima.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 05:41:52
 */
public class AlipayEcoRenthouseRenterZhimaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7522898555535315728L;

	/** 
	 * 状态值（等级值、未授权、未知）
	 */
	@ApiField("status_value")
	private String statusValue;

	public void setStatusValue(String statusValue) {
		this.statusValue = statusValue;
	}
	public String getStatusValue( ) {
		return this.statusValue;
	}

}
