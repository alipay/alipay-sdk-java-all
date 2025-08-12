package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.kids.token.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 18:20:45
 */
public class AlipayCommerceKidsTokenCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6714135898623365581L;

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
