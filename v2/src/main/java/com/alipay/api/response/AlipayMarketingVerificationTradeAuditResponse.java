package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.verification.trade.audit response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-02 17:36:12
 */
public class AlipayMarketingVerificationTradeAuditResponse extends AlipayResponse {

	private static final long serialVersionUID = 8136115784554247969L;

	/** 
	 * 审计单id,写操作接口返回
	 */
	@ApiField("operation_id")
	private String operationId;

	/** 
	 * 操作流水号，对应一次提交请求
	 */
	@ApiField("request_id")
	private String requestId;

	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}
	public String getOperationId( ) {
		return this.operationId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

}
