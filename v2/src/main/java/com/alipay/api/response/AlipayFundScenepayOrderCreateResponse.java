package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.scenepay.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-03 23:41:42
 */
public class AlipayFundScenepayOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7382649976641959229L;

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
