package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.platform.openid.migrate response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayPlatformOpenidMigrateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6837699916356238755L;

	/** 
	 * 格式：a,b|c,d
老OpenId在前，新OpenId在后；以英文逗号,分隔；多组之间以竖线分隔
	 */
	@ApiField("openidpairs")
	private String openidpairs;

	public void setOpenidpairs(String openidpairs) {
		this.openidpairs = openidpairs;
	}
	public String getOpenidpairs( ) {
		return this.openidpairs;
	}

}
