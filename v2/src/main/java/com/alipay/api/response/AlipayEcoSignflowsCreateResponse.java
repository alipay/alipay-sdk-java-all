package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.signflows.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 02:05:32
 */
public class AlipayEcoSignflowsCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4475899589881615677L;

	/** 
	 * 电子合同流程id（需记录到业务系统中，后续相关服务调用都基于此ID）
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
