package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.inner.versionproportionset.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 05:00:27
 */
public class AlipayOpenMiniInnerVersionproportionsetQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2157831979845438479L;

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
