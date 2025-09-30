package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.industrydata.im.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-25 11:27:41
 */
public class AlipayCommerceMedicalIndustrydataImSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6491714798572964549L;

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
