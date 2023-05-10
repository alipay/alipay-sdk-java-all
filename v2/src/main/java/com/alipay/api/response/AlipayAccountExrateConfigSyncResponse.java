package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.exrate.config.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 02:45:36
 */
public class AlipayAccountExrateConfigSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6376469583763335161L;

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
