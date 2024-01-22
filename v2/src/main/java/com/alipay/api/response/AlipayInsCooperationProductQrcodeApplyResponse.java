package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.cooperation.product.qrcode.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 01:25:52
 */
public class AlipayInsCooperationProductQrcodeApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1346213217672974132L;

	/** 
	 * 快捷投保产品二维码图片链接URL
	 */
	@ApiField("code_url")
	private String codeUrl;

	public void setCodeUrl(String codeUrl) {
		this.codeUrl = codeUrl;
	}
	public String getCodeUrl( ) {
		return this.codeUrl;
	}

}
