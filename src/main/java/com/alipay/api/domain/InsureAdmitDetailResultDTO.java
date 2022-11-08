package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电商详细准入结果模型 
 *
 * @author auto create
 * @since 1.0, 2022-08-19 15:36:53
 */
public class InsureAdmitDetailResultDTO extends AlipayObject {

	private static final long serialVersionUID = 3827189948672674897L;

	/**
	 * 批量请求的唯一识别key
	 */
	@ApiField("echo_key")
	private String echoKey;

	/**
	 * 准入失败code，只有risky是false的时候有
	 */
	@ApiField("risk_code")
	private String riskCode;

	/**
	 * 不准入描述
	 */
	@ApiField("risk_desc")
	private String riskDesc;

	/**
	 * true是不准入，false是准入
	 */
	@ApiField("risky")
	private Boolean risky;

	public String getEchoKey() {
		return this.echoKey;
	}
	public void setEchoKey(String echoKey) {
		this.echoKey = echoKey;
	}

	public String getRiskCode() {
		return this.riskCode;
	}
	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	public String getRiskDesc() {
		return this.riskDesc;
	}
	public void setRiskDesc(String riskDesc) {
		this.riskDesc = riskDesc;
	}

	public Boolean getRisky() {
		return this.risky;
	}
	public void setRisky(Boolean risky) {
		this.risky = risky;
	}

}
