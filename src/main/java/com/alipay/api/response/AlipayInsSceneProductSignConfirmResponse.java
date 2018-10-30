package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.product.sign.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2018-06-08 13:38:58
 */
public class AlipayInsSceneProductSignConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 6169446453942832635L;

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
