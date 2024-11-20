package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.credit.isvwithdraw.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-16 13:37:15
 */
public class AlipayCommerceEcCreditIsvwithdrawQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8624122152491717329L;

	/** 
	 * 银行审核失败原因，情况状态为APPROVE_FAIL时必填
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 银行取款状态，枚举类型
	 */
	@ApiField("status")
	private String status;

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
