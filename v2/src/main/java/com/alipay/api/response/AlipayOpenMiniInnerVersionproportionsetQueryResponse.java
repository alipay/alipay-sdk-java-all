package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.inner.versionproportionset.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 13:18:47
 */
public class AlipayOpenMiniInnerVersionproportionsetQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1461665971152565292L;

	/** 
	 * 版本
	 */
	@ApiField("mini_appx_version")
	private String miniAppxVersion;

	public void setMiniAppxVersion(String miniAppxVersion) {
		this.miniAppxVersion = miniAppxVersion;
	}
	public String getMiniAppxVersion( ) {
		return this.miniAppxVersion;
	}

}
