package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.family.archive.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 00:25:16
 */
public class AlipayUserFamilyArchiveInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 5774352829754968158L;

	/** 
	 * 家人信息档案(选人授权)组件唤起地址
	 */
	@ApiField("archive_plugin_url")
	private String archivePluginUrl;

	public void setArchivePluginUrl(String archivePluginUrl) {
		this.archivePluginUrl = archivePluginUrl;
	}
	public String getArchivePluginUrl( ) {
		return this.archivePluginUrl;
	}

}
