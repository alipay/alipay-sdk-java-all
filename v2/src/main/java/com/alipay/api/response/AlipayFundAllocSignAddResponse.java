package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.alloc.sign.add response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:34
 */
public class AlipayFundAllocSignAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 3863564998627235964L;

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
