package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.deliver.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-30 12:40:37
 */
public class AlipayPcreditHuabeiDeliverQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5815876631233362368L;

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
