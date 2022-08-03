package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.insurancerisk.get response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-01 16:16:48
 */
public class DatadigitalFincloudFinsaasInsuranceriskGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2626154684729855193L;

	/** 
	 * 风险内容
	 */
	@ApiField("risk_content")
	private String riskContent;

	public void setRiskContent(String riskContent) {
		this.riskContent = riskContent;
	}
	public String getRiskContent( ) {
		return this.riskContent;
	}

}
