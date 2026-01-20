package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.verification.trade.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-28 15:37:24
 */
public class AlipayMarketingVerificationTradeSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7434538726388511647L;

	/** 
	 * 交易信息id,写操作接口返回
	 */
	@ApiField("operation_id")
	private String operationId;

	/** 
	 * 请求流水号，对应每次同步请求
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
