package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.cooperation.productlist.qrcode.apply response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayInsCooperationProductlistQrcodeApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5545163482851851914L;

	/** 
	 * 返回的内容二维码图片链接URL，可通过此URL获得二维码链接用于分享
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
