package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.deliver.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-16 16:28:13
 */
public class AlipayPcreditHuabeiDeliverQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2555183559997719756L;

	/** 
	 * 配置ID
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
