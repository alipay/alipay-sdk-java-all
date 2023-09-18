package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.autoinsprod.user.certify response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 00:31:46
 */
public class AlipayInsAutoAutoinsprodUserCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1286847866142593414L;

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
