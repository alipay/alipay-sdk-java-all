package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.zmgo.template.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 21:11:38
 */
public class ZhimaMerchantZmgoTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8825423431443913376L;

	/** 
	 * 芝麻GO模板号
	 */
	@ApiField("template_no")
	private String templateNo;

	public void setTemplateNo(String templateNo) {
		this.templateNo = templateNo;
	}
	public String getTemplateNo( ) {
		return this.templateNo;
	}

}
