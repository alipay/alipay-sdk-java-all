package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.fund.remit.receive.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOverseasFundRemitReceiveCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3493262633427873151L;

	/** 
	 * 支付宝交易id
	 */
	@ApiField("alipay_trans_id")
	private String alipayTransId;

	public void setAlipayTransId(String alipayTransId) {
		this.alipayTransId = alipayTransId;
	}
	public String getAlipayTransId( ) {
		return this.alipayTransId;
	}

}
