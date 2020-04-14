package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerapp.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-03-18 16:34:40
 */
public class AlipayOpenMiniInnerappCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4878793494471681286L;

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
