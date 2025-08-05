package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.inner.versionproportionset.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:22
 */
public class AlipayOpenMiniInnerVersionproportionsetQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8135633956411388514L;

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
