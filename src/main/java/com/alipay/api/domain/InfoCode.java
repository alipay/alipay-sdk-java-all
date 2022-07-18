package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 风险解释
 *
 * @author auto create
 * @since 1.0, 2017-12-14 11:01:51
 */
public class InfoCode extends AlipayObject {

	private static final long serialVersionUID = 8677993278335315933L;

	/**
	 * 风险描述
	 */
	@ApiField("risk_description")
	private String riskDescription;

	/**
	 * 风险因素编码
	 */
	@ApiField("risk_factor_code")
	private String riskFactorCode;

	/**
	 * 风险因素名称
	 */
	@ApiField("risk_factor_name")
	private String riskFactorName;

	/**
	 * 风险度量，子特征风险分，范围 0-10，值越大表示风险越高
	 */
	@ApiField("risk_magnitude")
	private String riskMagnitude;

	public String getRiskDescription() {
		return this.riskDescription;
	}
	public void setRiskDescription(String riskDescription) {
		this.riskDescription = riskDescription;
	}

	public String getRiskFactorCode() {
		return this.riskFactorCode;
	}
	public void setRiskFactorCode(String riskFactorCode) {
		this.riskFactorCode = riskFactorCode;
	}

	public String getRiskFactorName() {
		return this.riskFactorName;
	}
	public void setRiskFactorName(String riskFactorName) {
		this.riskFactorName = riskFactorName;
	}

	public String getRiskMagnitude() {
		return this.riskMagnitude;
	}
	public void setRiskMagnitude(String riskMagnitude) {
		this.riskMagnitude = riskMagnitude;
	}

}
