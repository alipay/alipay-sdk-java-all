package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 风险咨询结果
 *
 * @author auto create
 * @since 1.0, 2023-08-03 17:23:36
 */
public class RiskApplyConsult extends AlipayObject {

	private static final long serialVersionUID = 5854655235219618744L;

	/**
	 * 风险咨询时间
	 */
	@ApiField("consult_time")
	private Date consultTime;

	/**
	 * 风险描述 1.该客户无风险 2.该客户存在潜在风险 3.该客户存在风险 4.未知风险
	 */
	@ApiField("risk_desc")
	private String riskDesc;

	/**
	 * 风险等级，有限枚举： 1.AC_NO_RISK（该客户无风险） 2.AC_POTENTIAL_RISK（该客户存在潜在风险） 3.AC_HIGH_RISK（该客户存在风险）
4.AC_UN_KNOWN（未知风险）
	 */
	@ApiField("risk_level")
	private String riskLevel;

	/**
	 * 风险场景，有限枚举： 
User Account Risk：账户安全咨询 
Enterprise Access Risk：社保风险咨询 
Enterprise Manager Risk：董监高风险咨询
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
