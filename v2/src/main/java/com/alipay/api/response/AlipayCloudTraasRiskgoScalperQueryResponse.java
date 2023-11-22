package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RiskImagePlusQueryResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.traas.riskgo.scalper.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-21 22:31:45
 */
public class AlipayCloudTraasRiskgoScalperQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6645657563622583387L;

	/** 
	 * risk_result:风险分析结果，类型为列表，包含风险分析结果和描述。分别是 risk_type:[固定值]; risk_value:仅为样例("rank0","rank1",...,"rank5",...); risk_desc:[风险等级]; 每一次返回，根据配置的不同，可以返回同样的风险结果类型，也可以返回不同的风险结果类型。其中rank0代表无匹配的风险结果/查询无结果， 其余等级随着数字增大代表风险越大。 不同场景对应的等级个数不相同，可查看介绍文档
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
