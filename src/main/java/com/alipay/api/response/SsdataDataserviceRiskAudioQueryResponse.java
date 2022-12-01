package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.risk.audio.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-29 16:06:05
 */
public class SsdataDataserviceRiskAudioQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3445985482179841864L;

	/** 
	 * 命中的用户自定义的关键词列表及选择的模型命中分数
	 */
	@ApiField("risk_result")
	private String riskResult;

	/** 
	 * 业务唯一识别码
	 */
	@ApiField("unique_id")
	private String uniqueId;

	public void setRiskResult(String riskResult) {
		this.riskResult = riskResult;
	}
	public String getRiskResult( ) {
		return this.riskResult;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getUniqueId( ) {
		return this.uniqueId;
	}

}
