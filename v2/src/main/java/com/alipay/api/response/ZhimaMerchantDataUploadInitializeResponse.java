package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.data.upload.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 16:42:54
 */
public class ZhimaMerchantDataUploadInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 6358746543227796698L;

	/** 
	 * 行业模板
	 */
	@ApiField("template_url")
	private String templateUrl;

	public void setTemplateUrl(String templateUrl) {
		this.templateUrl = templateUrl;
	}
	public String getTemplateUrl( ) {
		return this.templateUrl;
	}

}
