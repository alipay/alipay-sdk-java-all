package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.application.outside.apply response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-28 17:17:24
 */
public class AlipayInsSceneApplicationOutsideApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3196899677125623411L;

	/** 
	 * 外部业务号(与入参调用外部业务号一致)
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/** 
	 * 保费(分)
	 */
	@ApiField("premium")
	private Long premium;

	/** 
	 * 风险等级 
1:正常 
2:关注 
3:高风险 
4:极高风险
	 */
	@ApiField("risk_level")
	private String riskLevel;

	/** 
	 * 保额(分)
	 */
	@ApiField("sum_insured")
	private Long sumInsured;

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getPolicyNo( ) {
		return this.policyNo;
	}

	public void setPremium(Long premium) {
		this.premium = premium;
	}
	public Long getPremium( ) {
		return this.premium;
	}

	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}
	public String getRiskLevel( ) {
		return this.riskLevel;
	}

	public void setSumInsured(Long sumInsured) {
		this.sumInsured = sumInsured;
	}
	public Long getSumInsured( ) {
		return this.sumInsured;
	}

}
