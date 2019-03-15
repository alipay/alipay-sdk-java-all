package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerversion.preview.upload response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenMiniInnerversionPreviewUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 2232332785757318628L;

	/** 
	 * 构建好的包地址
	 */
	@ApiField("build_package_url")
	private String buildPackageUrl;

	public void setBuildPackageUrl(String buildPackageUrl) {
		this.buildPackageUrl = buildPackageUrl;
	}
	public String getBuildPackageUrl( ) {
		return this.buildPackageUrl;
	}

}
