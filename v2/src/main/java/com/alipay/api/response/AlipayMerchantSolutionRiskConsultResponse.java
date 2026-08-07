package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RiskWarningInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.solution.risk.consult response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-03 15:12:54
 */
public class AlipayMerchantSolutionRiskConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 3272865819168795592L;

	/** 
	 * 风险提示信息，若存在多个服务商有风险，则返回list，若不存在服务商有风险，则不返回
	 */
	@ApiListField("risk_warning_info")
	@ApiField("risk_warning_info")
	private List<RiskWarningInfo> riskWarningInfo;

	/** 
	 * 标识唯一的解决方案
	 */
	@ApiField("solution_code")
	private String solutionCode;

	public void setRiskWarningInfo(List<RiskWarningInfo> riskWarningInfo) {
		this.riskWarningInfo = riskWarningInfo;
	}
	public List<RiskWarningInfo> getRiskWarningInfo( ) {
		return this.riskWarningInfo;
	}

	public void setSolutionCode(String solutionCode) {
		this.solutionCode = solutionCode;
	}
	public String getSolutionCode( ) {
		return this.solutionCode;
	}

}
