package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.hmcode.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-22 15:38:11
 */
public class AlipayOpenMiniHmcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7436796513291683672L;

	/** 
	 * 异形码图片链接地址
	 */
	@ApiField("hm_code_url")
	private String hmCodeUrl;

	public void setHmCodeUrl(String hmCodeUrl) {
		this.hmCodeUrl = hmCodeUrl;
	}
	public String getHmCodeUrl( ) {
		return this.hmCodeUrl;
	}

}
