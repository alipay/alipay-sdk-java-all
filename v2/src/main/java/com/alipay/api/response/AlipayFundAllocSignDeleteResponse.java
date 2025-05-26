package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.alloc.sign.delete response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-07 17:11:21
 */
public class AlipayFundAllocSignDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 1178142319188296197L;

	/** 
	 * 用于关联本次请求
	 */
	@ApiField("flow_id")
	private String flowId;

	/** 
	 * 删除操作链接
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
