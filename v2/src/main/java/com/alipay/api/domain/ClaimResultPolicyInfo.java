package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 理赔核验保单信息
 *
 * @author auto create
 * @since 1.0, 2026-05-26 19:48:45
 */
public class ClaimResultPolicyInfo extends AlipayObject {

	private static final long serialVersionUID = 8472547558989436243L;

	/**
	 * 产品编码
	 */
	@ApiField("dplan_code")
	private String dplanCode;

	/**
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	public String getDplanCode() {
		return this.dplanCode;
	}
	public void setDplanCode(String dplanCode) {
		this.dplanCode = dplanCode;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

}
