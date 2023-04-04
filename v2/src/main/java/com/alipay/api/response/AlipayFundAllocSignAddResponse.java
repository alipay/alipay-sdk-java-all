package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.alloc.sign.add response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 05:56:42
 */
public class AlipayFundAllocSignAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 4124639479394369622L;

	/** 
	 * 用于关联本次请求
	 */
	@ApiField("flow_id")
	private String flowId;

	/** 
	 * 授权操作链接
	 */
	@ApiField("operation_url")
	private String operationUrl;

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}
	public String getFlowId( ) {
		return this.flowId;
	}

	public void setOperationUrl(String operationUrl) {
		this.operationUrl = operationUrl;
	}
	public String getOperationUrl( ) {
		return this.operationUrl;
	}

}
