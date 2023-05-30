package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.scenepay.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-16 20:21:56
 */
public class AlipayFundScenepayOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8163244474289794232L;

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
