package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.agent.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:31
 */
public class AlipayIserviceCcmAgentCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5214664923178791445L;

	/** 
	 * CCM客服id
	 */
	@ApiField("id")
	private String id;

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

}
