package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RiskImagePlusQueryResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.traas.riskgo.scalper.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 00:46:44
 */
public class AlipayCloudTraasRiskgoScalperQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6876555674986492157L;

	/** 
	 * risk_result:风险分析结果，类型为列表，包含风险分析结果和描述。分别是 risk_type:industry_scalper_common; risk_value:("noRisk","rank1",...,"rank5",...,); risk_desc:是否有风险/风险等级; rank1到rank5风险等级从低到高。以上仅为示例具体等级分类可能存在个性化配置，可以咨询蚂蚁风控同学。
	 */
	@ApiField("risk_result")
	private RiskImagePlusQueryResult riskResult;

	public void setRiskResult(RiskImagePlusQueryResult riskResult) {
		this.riskResult = riskResult;
	}
	public RiskImagePlusQueryResult getRiskResult( ) {
		return this.riskResult;
	}

}
