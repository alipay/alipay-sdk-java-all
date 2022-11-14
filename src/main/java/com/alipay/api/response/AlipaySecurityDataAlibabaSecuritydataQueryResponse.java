package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.data.alibaba.securitydata.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-21 18:12:05
 */
public class AlipaySecurityDataAlibabaSecuritydataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1379183264935229692L;

	/** 
	 * 风险描述
	 */
	@ApiField("content")
	private String content;

	/** 
	 * 核身校验统计结果,格式为核身校验方式:次数
	 */
	@ApiField("identify_result")
	private String identifyResult;

	/** 
	 * 用户风险标签，赌博，欺诈，盗用等
	 */
	@ApiField("risk_label")
	private String riskLabel;

	/** 
	 * 风险评分
	 */
	@ApiField("risk_score")
	private String riskScore;

	public void setContent(String content) {
		this.content = content;
	}
	public String getContent( ) {
		return this.content;
	}

	public void setIdentifyResult(String identifyResult) {
		this.identifyResult = identifyResult;
	}
	public String getIdentifyResult( ) {
		return this.identifyResult;
	}

	public void setRiskLabel(String riskLabel) {
		this.riskLabel = riskLabel;
	}
	public String getRiskLabel( ) {
		return this.riskLabel;
	}

	public void setRiskScore(String riskScore) {
		this.riskScore = riskScore;
	}
	public String getRiskScore( ) {
		return this.riskScore;
	}

}
