package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.approval.config.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-03 19:02:26
 */
public class AlipayCommerceEcApprovalConfigModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5518262534122216619L;

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
