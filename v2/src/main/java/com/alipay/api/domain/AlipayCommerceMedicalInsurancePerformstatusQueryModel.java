package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询保单履约享权状态
 *
 * @author auto create
 * @since 1.0, 2025-08-14 13:50:22
 */
public class AlipayCommerceMedicalInsurancePerformstatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4154918241453981694L;

	/**
	 * 保司类型，用于区分来源保险公司
	 */
	@ApiField("company_type")
	private String companyType;

	/**
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	public String getCompanyType() {
		return this.companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

}
