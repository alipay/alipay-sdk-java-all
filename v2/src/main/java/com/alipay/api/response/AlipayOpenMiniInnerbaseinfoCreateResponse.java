package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerbaseinfo.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:33
 */
public class AlipayOpenMiniInnerbaseinfoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8834886547331948156L;

	/** 
	 * 小程序应用ID
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
