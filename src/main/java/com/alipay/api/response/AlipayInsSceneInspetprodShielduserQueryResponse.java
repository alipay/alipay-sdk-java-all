package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.inspetprod.shielduser.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-17 18:57:54
 */
public class AlipayInsSceneInspetprodShielduserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4663942538545244954L;

	/** 
	 * 微信昵称
	 */
	@ApiField("shield_wx_title")
	private String shieldWxTitle;

	/** 
	 * 微信头像url
	 */
	@ApiField("shield_wx_url")
	private String shieldWxUrl;

	public void setShieldWxTitle(String shieldWxTitle) {
		this.shieldWxTitle = shieldWxTitle;
	}
	public String getShieldWxTitle( ) {
		return this.shieldWxTitle;
	}

	public void setShieldWxUrl(String shieldWxUrl) {
		this.shieldWxUrl = shieldWxUrl;
	}
	public String getShieldWxUrl( ) {
		return this.shieldWxUrl;
	}

}
