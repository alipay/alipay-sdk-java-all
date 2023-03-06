package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.sign.flow.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 18:27:37
 */
public class AlipayEcoSignFlowCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1551448418193495811L;

	/** 
	 * 流程Id
	 */
	@ApiField("flow_id")
	private String flowId;

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}
	public String getFlowId( ) {
		return this.flowId;
	}

}
