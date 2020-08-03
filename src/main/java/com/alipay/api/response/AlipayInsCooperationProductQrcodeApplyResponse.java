package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.cooperation.product.qrcode.apply response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayInsCooperationProductQrcodeApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2435175935835851887L;

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
