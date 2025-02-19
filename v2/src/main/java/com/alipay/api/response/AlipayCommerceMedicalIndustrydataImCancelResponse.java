package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.industrydata.im.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-06 15:02:23
 */
public class AlipayCommerceMedicalIndustrydataImCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 7621898482395532188L;

	/** 
	 * 支付宝im消息id
	 */
	@ApiField("alipay_msg_id")
	private String alipayMsgId;

	public void setAlipayMsgId(String alipayMsgId) {
		this.alipayMsgId = alipayMsgId;
	}
	public String getAlipayMsgId( ) {
		return this.alipayMsgId;
	}

}
