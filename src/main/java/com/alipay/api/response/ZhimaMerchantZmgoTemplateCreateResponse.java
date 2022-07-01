package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.zmgo.template.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-30 20:26:49
 */
public class ZhimaMerchantZmgoTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3878235833811446188L;

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
