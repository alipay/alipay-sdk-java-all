package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.kids.token.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-17 16:30:01
 */
public class AlipayCommerceKidsTokenCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4748323965337441238L;

	/** 
	 * 过期时间
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/** 
	 * token
	 */
	@ApiField("kids_token")
	private String kidsToken;

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}
	public Date getExpireTime( ) {
		return this.expireTime;
	}

	public void setKidsToken(String kidsToken) {
		this.kidsToken = kidsToken;
	}
	public String getKidsToken( ) {
		return this.kidsToken;
	}

}
