package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.deliver.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-01-05 19:50:15
 */
public class AlipayPcreditHuabeiDeliverQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3841545284799552739L;

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
