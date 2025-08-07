package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.autoinsprod.user.certify response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-30 14:41:41
 */
public class AlipayInsAutoAutoinsprodUserCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4359672361583788328L;

	/** 
	 * 验证结果
	 */
	@ApiField("agent_cert_result")
	private String agentCertResult;

	public void setAgentCertResult(String agentCertResult) {
		this.agentCertResult = agentCertResult;
	}
	public String getAgentCertResult( ) {
		return this.agentCertResult;
	}

}
