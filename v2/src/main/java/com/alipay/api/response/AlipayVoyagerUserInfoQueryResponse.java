package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.VoyagerUserInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.voyager.user.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-10 10:47:44
 */
public class AlipayVoyagerUserInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5633577211129778544L;

	/** 
	 * Voyager基础用户信息
	 */
	@ApiField("user_info")
	private VoyagerUserInfo userInfo;

	public void setUserInfo(VoyagerUserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public VoyagerUserInfo getUserInfo( ) {
		return this.userInfo;
	}

}
