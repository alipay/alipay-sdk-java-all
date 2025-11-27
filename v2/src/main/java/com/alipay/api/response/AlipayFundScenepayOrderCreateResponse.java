package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.scenepay.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-07 16:57:54
 */
public class AlipayFundScenepayOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5455444924627578746L;

	/** 
	 * 场景支付业务单号
	 */
	@ApiField("biz_no")
	private String bizNo;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

}
