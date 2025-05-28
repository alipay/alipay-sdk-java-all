package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.reconfirm.riskidentify.certify response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:10
 */
public class AlipaySecurityRiskReconfirmRiskidentifyCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1556836527176768792L;

	/** 
	 * 额外信息
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/** 
	 * 是否有风险
该字段为风险检测结果，不敏感，无需脱敏
	 */
	@ApiField("has_risk")
	private Boolean hasRisk;

	/** 
	 * 风险识别id，为一个标识id，不敏感，无需脱敏
	 */
	@ApiField("identify_id")
	private String identifyId;

	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}
	public String getExtendInfo( ) {
		return this.extendInfo;
	}

	public void setHasRisk(Boolean hasRisk) {
		this.hasRisk = hasRisk;
	}
	public Boolean getHasRisk( ) {
		return this.hasRisk;
	}

	public void setIdentifyId(String identifyId) {
		this.identifyId = identifyId;
	}
	public String getIdentifyId( ) {
		return this.identifyId;
	}

}
