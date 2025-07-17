package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.agreementtemplate.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-17 13:57:30
 */
public class AlipayCommerceMerchantcardAgreementtemplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8751746852734715158L;

	/** 
	 * 购卡需要签署的协议模板，需要注意的是这个返回值使用html标签来处理格式，展示的时候需要按照html来解析展示
	 */
	@ApiField("order_agreement_template_content")
	private String orderAgreementTemplateContent;

	public void setOrderAgreementTemplateContent(String orderAgreementTemplateContent) {
		this.orderAgreementTemplateContent = orderAgreementTemplateContent;
	}
	public String getOrderAgreementTemplateContent( ) {
		return this.orderAgreementTemplateContent;
	}

}
