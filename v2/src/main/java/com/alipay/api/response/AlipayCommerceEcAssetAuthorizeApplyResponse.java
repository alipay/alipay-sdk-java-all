package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.asset.authorize.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-13 21:26:42
 */
public class AlipayCommerceEcAssetAuthorizeApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4346843823366494644L;

	/** 
	 * 授权跳转链接
	 */
	@ApiField("authorize_link")
	private String authorizeLink;

	/** 
	 * 当前授权状态
	 */
	@ApiField("status")
	private String status;

	public void setAuthorizeLink(String authorizeLink) {
		this.authorizeLink = authorizeLink;
	}
	public String getAuthorizeLink( ) {
		return this.authorizeLink;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
