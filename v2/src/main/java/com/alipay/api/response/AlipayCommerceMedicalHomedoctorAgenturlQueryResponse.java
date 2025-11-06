package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.homedoctor.agenturl.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-27 10:47:40
 */
public class AlipayCommerceMedicalHomedoctorAgenturlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5491843947849657355L;

	/** 
	 * 根据医生信息返回对应智能体跳转链接
	 */
	@ApiField("agent_url")
	private String agentUrl;

	public void setAgentUrl(String agentUrl) {
		this.agentUrl = agentUrl;
	}
	public String getAgentUrl( ) {
		return this.agentUrl;
	}

}
