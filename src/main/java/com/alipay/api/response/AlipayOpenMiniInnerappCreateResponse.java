package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerapp.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-20 17:42:58
 */
public class AlipayOpenMiniInnerappCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8453184786985389923L;

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
