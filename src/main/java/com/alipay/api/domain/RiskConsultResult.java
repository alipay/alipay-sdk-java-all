package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 风险咨询结果
 *
 * @author auto create
 * @since 1.0, 2022-08-22 11:18:50
 */
public class RiskConsultResult extends AlipayObject {

	private static final long serialVersionUID = 7326571276611662158L;

	/**
	 * 风险咨询时间
	 */
	@ApiField("consult_time")
	private Date consultTime;

	/**
	 * 风险描述
1.该客户无风险
2.该客户存在潜在风险
3.该客户存在风险
	 */
	@ApiField("risk_desc")
	private String riskDesc;

	/**
	 * 风险等级，有限枚举：
1.AC_NO_RISK（该客户无风险）
2.AC_POTENTIAL_RISK（该客户存在潜在风险）
3.AC_HIGH_RISK（该客户存在风险）
	 */
	@ApiField("risk_level")
	private String riskLevel;

	/**
	 * 风险场景，有限枚举：
1.Operation Risk（业务风险场景）
2.Income Decomposition（收入拆分场景）
	 */
	@ApiField("risk_scene")
	private String riskScene;

	public Date getConsultTime() {
		return this.consultTime;
	}
	public void setConsultTime(Date consultTime) {
		this.consultTime = consultTime;
	}

	public String getRiskDesc() {
		return this.riskDesc;
	}
	public void setRiskDesc(String riskDesc) {
		this.riskDesc = riskDesc;
	}

	public String getRiskLevel() {
		return this.riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}

	public String getRiskScene() {
		return this.riskScene;
	}
	public void setRiskScene(String riskScene) {
		this.riskScene = riskScene;
	}

}
