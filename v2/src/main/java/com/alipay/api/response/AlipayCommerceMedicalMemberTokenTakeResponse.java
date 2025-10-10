package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.member.token.take response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-26 20:37:40
 */
public class AlipayCommerceMedicalMemberTokenTakeResponse extends AlipayResponse {

	private static final long serialVersionUID = 4656873267229756345L;

	/** 
	 * token码
	 */
	@ApiField("access_token")
	private String accessToken;

	/** 
	 * token到期时间
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/** 
	 * 来源
	 */
	@ApiField("source")
	private String source;

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getAccessToken( ) {
		return this.accessToken;
	}

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}
	public Date getExpireTime( ) {
		return this.expireTime;
	}

	public void setSource(String source) {
		this.source = source;
	}
	public String getSource( ) {
		return this.source;
	}

}
