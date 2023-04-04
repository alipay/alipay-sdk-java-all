package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.agent.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 03:29:20
 */
public class AlipayIserviceCcmAgentCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8351793656371598648L;

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
