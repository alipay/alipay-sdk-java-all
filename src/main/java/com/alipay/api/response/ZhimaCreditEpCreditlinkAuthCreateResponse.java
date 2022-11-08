package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.creditlink.auth.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-07 17:06:46
 */
public class ZhimaCreditEpCreditlinkAuthCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3776452355373467988L;

	/** 
	 * 授权有效时间
	 */
	@ApiField("expire_time")
	private String expireTime;

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}
	public String getExpireTime( ) {
		return this.expireTime;
	}

}
