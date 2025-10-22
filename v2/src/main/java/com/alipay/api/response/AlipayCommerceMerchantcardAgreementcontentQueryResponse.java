package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.agreementcontent.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-17 15:52:30
 */
public class AlipayCommerceMerchantcardAgreementcontentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6295371143636372469L;

	/** 
	 * 用户在购卡的时候签署的协议内容
	 */
	@ApiField("order_agreement_content")
	private String orderAgreementContent;

	public void setOrderAgreementContent(String orderAgreementContent) {
		this.orderAgreementContent = orderAgreementContent;
	}
	public String getOrderAgreementContent( ) {
		return this.orderAgreementContent;
	}

}
