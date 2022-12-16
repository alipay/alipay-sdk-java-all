package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.zmgo.template.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-06 17:51:39
 */
public class ZhimaMerchantZmgoTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5158371947425475396L;

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
