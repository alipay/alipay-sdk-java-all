package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isresourceapi.agent.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-15 14:52:12
 */
public class AlipayIserviceIsresourceapiAgentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5571896223119989859L;

	/** 
	 * 根据号码得出在指定数据内
	 */
	@ApiField("exists")
	private String exists;

	public void setExists(String exists) {
		this.exists = exists;
	}
	public String getExists( ) {
		return this.exists;
	}

}
