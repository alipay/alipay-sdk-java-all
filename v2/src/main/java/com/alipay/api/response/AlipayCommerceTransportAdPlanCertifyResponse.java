package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.ad.plan.certify response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:56:03
 */
public class AlipayCommerceTransportAdPlanCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8638942423566349867L;

	/** 
	 * 返回结果
true: 成功
false: 失败
	 */
	@ApiField("audit_result")
	private Boolean auditResult;

	/** 
	 * BIZ_ERROR中业务错误对应的文案描述
	 */
	@ApiField("message")
	private String message;

	public void setAuditResult(Boolean auditResult) {
		this.auditResult = auditResult;
	}
	public Boolean getAuditResult( ) {
		return this.auditResult;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

}
