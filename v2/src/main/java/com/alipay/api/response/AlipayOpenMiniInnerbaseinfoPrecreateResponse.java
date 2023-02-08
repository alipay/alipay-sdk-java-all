package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerbaseinfo.precreate response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-10 23:22:02
 */
public class AlipayOpenMiniInnerbaseinfoPrecreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3688951222927431168L;

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
