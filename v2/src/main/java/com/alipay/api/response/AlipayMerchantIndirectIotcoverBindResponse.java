package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.indirect.iotcover.bind response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-16 15:52:38
 */
public class AlipayMerchantIndirectIotcoverBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 1447547644373187251L;

	/** 
	 * 非支付宝交易到账播报语料ID，仅入参中传入speech_content时会返回该值。
	 */
	@ApiField("msg_id")
	private String msgId;

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}
	public String getMsgId( ) {
		return this.msgId;
	}

}
