package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.common.relationcode.receive response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-05 11:26:57
 */
public class AlipayCommerceCommonRelationcodeReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 3638877364242726665L;

	/** 
	 * 团长机构设定的绑定关系页面分享二维码
	 */
	@ApiField("url_code")
	private String urlCode;

	public void setUrlCode(String urlCode) {
		this.urlCode = urlCode;
	}
	public String getUrlCode( ) {
		return this.urlCode;
	}

}
