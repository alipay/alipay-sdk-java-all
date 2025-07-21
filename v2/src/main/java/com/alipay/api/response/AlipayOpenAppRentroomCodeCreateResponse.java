package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.rentroom.code.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-12 10:32:12
 */
public class AlipayOpenAppRentroomCodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8422334665554581776L;

	/** 
	 * 吱口令
	 */
	@ApiField("share_token")
	private String shareToken;

	public void setShareToken(String shareToken) {
		this.shareToken = shareToken;
	}
	public String getShareToken( ) {
		return this.shareToken;
	}

}
