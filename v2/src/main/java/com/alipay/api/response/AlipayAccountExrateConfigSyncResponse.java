package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.exrate.config.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-03 23:38:29
 */
public class AlipayAccountExrateConfigSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5187752224478898227L;

	/** 
	 * 同步到主站的配置的bcode信息
	 */
	@ApiField("config_id")
	private String configId;

	public void setConfigId(String configId) {
		this.configId = configId;
	}
	public String getConfigId( ) {
		return this.configId;
	}

}
