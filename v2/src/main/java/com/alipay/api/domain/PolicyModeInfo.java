package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保单信息
 *
 * @author auto create
 * @since 1.0, 2026-05-22 13:57:31
 */
public class PolicyModeInfo extends AlipayObject {

	private static final long serialVersionUID = 5845337736296285412L;

	/**
	 * 产品名称
	 */
	@ApiField("dplan_name")
	private String dplanName;

	/**
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	public String getDplanName() {
		return this.dplanName;
	}
	public void setDplanName(String dplanName) {
		this.dplanName = dplanName;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

}
