package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.instservice.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-13 15:45:00
 */
public class AlipayEbppInstserviceOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4713938496297511488L;

	/** 
	 * 机构传入的流水号
	 */
	@ApiField("flow_id")
	private String flowId;

	/** 
	 * 落地结果
	 */
	@ApiField("result")
	private String result;

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}
	public String getFlowId( ) {
		return this.flowId;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
