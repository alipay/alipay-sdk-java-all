package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.renthouse.renter.zhima.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:09:05
 */
public class AlipayEcoRenthouseRenterZhimaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6787245783631951497L;

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
