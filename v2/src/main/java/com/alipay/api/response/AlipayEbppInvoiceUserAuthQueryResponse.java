package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.user.auth.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-22 14:07:01
 */
public class AlipayEbppInvoiceUserAuthQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3234848315551391323L;

	/** 
	 * true：已授权
false：未授权
	 */
	@ApiField("has_authorized")
	private Boolean hasAuthorized;

	/** 
	 * 支付宝用户的userId。
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 用户签约协议链接
	 */
	@ApiField("protocol_url")
	private String protocolUrl;

	/** 
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public void setHasAuthorized(Boolean hasAuthorized) {
		this.hasAuthorized = hasAuthorized;
	}
	public Boolean getHasAuthorized( ) {
		return this.hasAuthorized;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setProtocolUrl(String protocolUrl) {
		this.protocolUrl = protocolUrl;
	}
	public String getProtocolUrl( ) {
		return this.protocolUrl;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
