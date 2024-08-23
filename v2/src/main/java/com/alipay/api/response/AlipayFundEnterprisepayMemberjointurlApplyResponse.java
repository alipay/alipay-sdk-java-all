package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.enterprisepay.memberjointurl.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:54
 */
public class AlipayFundEnterprisepayMemberjointurlApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3567985375913168918L;

	/** 
	 * 邀请员工二维码链接（包含token信息）
	 */
	@ApiField("apply_url")
	private String applyUrl;

	/** 
	 * 邀请员工二维码链接的token，后续根据token进行校验
	 */
	@ApiField("apply_url_token")
	private String applyUrlToken;

	/** 
	 * 到期时间，小于等于到期时间的都有效
	 */
	@ApiField("expiration_time")
	private String expirationTime;

	public void setApplyUrl(String applyUrl) {
		this.applyUrl = applyUrl;
	}
	public String getApplyUrl( ) {
		return this.applyUrl;
	}

	public void setApplyUrlToken(String applyUrlToken) {
		this.applyUrlToken = applyUrlToken;
	}
	public String getApplyUrlToken( ) {
		return this.applyUrlToken;
	}

	public void setExpirationTime(String expirationTime) {
		this.expirationTime = expirationTime;
	}
	public String getExpirationTime( ) {
		return this.expirationTime;
	}

}
