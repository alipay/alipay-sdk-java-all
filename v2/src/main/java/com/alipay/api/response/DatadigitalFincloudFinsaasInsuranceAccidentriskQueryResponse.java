package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.insurance.accidentrisk.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 10:06:58
 */
public class DatadigitalFincloudFinsaasInsuranceAccidentriskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8762792333135287285L;

	/** 
	 * 是否查得此用户，查得返回true，否则返回false
	 */
	@ApiField("found")
	private Boolean found;

	/** 
	 * 包括两种返回形式：
● 风险等级：0-N表示风险从低到高排列（N值线下确认）
● 风险分值：0-99.99表示风险从低到高排列
注：未查得不返回结果。
	 */
	@ApiField("risk_result")
	private String riskResult;

	public void setFound(Boolean found) {
		this.found = found;
	}
	public Boolean getFound( ) {
		return this.found;
	}

	public void setRiskResult(String riskResult) {
		this.riskResult = riskResult;
	}
	public String getRiskResult( ) {
		return this.riskResult;
	}

}
