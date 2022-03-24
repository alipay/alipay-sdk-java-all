package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.product.sign.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:09:08
 */
public class AlipayInsSceneProductSignQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4278534199667293424L;

	/** 
	 * 支付宝代扣协议ID
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}
	public String getAgreementNo( ) {
		return this.agreementNo;
	}

}
