package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RiskResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.risk.content.verify response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-05 15:49:58
 */
public class SsdataDataserviceRiskContentVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1288328885953661866L;

	/** 
	 * 对应传入的每一种风险类型的所有风险识别结果
	 */
	@ApiListField("risk_result")
	@ApiField("risk_result")
	private List<RiskResult> riskResult;

	/** 
	 * 分值
	 */
	@ApiField("score")
	private String score;

	/** 
	 * 业务唯一识别码
	 */
	@ApiField("unique_id")
	private String uniqueId;

	public void setRiskResult(List<RiskResult> riskResult) {
		this.riskResult = riskResult;
	}
	public List<RiskResult> getRiskResult( ) {
		return this.riskResult;
	}

	public void setScore(String score) {
		this.score = score;
	}
	public String getScore( ) {
		return this.score;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getUniqueId( ) {
		return this.uniqueId;
	}

}
