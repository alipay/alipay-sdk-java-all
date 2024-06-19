package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.certification.risk.identify response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:53
 */
public class ZhimaCreditEpCertificationRiskIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5113764938964414838L;

	/** 
	 * 认证风险识别结果集合
	 */
	@ApiListField("risk_identify_result")
	@ApiField("string")
	private List<String> riskIdentifyResult;

	/** 
	 * 空壳企业等级，描述企业空壳程度。
	 */
	@ApiField("shell_company_level")
	private String shellCompanyLevel;

	public void setRiskIdentifyResult(List<String> riskIdentifyResult) {
		this.riskIdentifyResult = riskIdentifyResult;
	}
	public List<String> getRiskIdentifyResult( ) {
		return this.riskIdentifyResult;
	}

	public void setShellCompanyLevel(String shellCompanyLevel) {
		this.shellCompanyLevel = shellCompanyLevel;
	}
	public String getShellCompanyLevel( ) {
		return this.shellCompanyLevel;
	}

}
