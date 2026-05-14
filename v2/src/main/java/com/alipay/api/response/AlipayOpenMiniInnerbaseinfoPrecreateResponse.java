package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerbaseinfo.precreate response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-25 11:07:43
 */
public class AlipayOpenMiniInnerbaseinfoPrecreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5342852698717773478L;

	/** 
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}
	public String getMiniAppId( ) {
		return this.miniAppId;
	}

}
