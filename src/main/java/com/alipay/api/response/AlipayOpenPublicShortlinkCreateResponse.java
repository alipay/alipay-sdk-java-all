package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.shortlink.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-15 17:50:25
 */
public class AlipayOpenPublicShortlinkCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6839291675334743388L;

	/** 
	 * 生成的带参推广短链接
	 */
	@ApiField("shortlink")
	private String shortlink;

	public void setShortlink(String shortlink) {
		this.shortlink = shortlink;
	}
	public String getShortlink( ) {
		return this.shortlink;
	}

}
