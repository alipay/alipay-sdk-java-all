package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.npassporter.verifyconfig.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-31 17:50:54
 */
public class AlipayOfflineProviderNpassporterVerifyconfigCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2246572124498128939L;

	/** 
	 * 核验配置Id
	 */
	@ApiField("verify_config_id")
	private String verifyConfigId;

	public void setVerifyConfigId(String verifyConfigId) {
		this.verifyConfigId = verifyConfigId;
	}
	public String getVerifyConfigId( ) {
		return this.verifyConfigId;
	}

}
