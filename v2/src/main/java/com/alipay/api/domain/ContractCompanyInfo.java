package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子合同企业信息集
 *
 * @author auto create
 * @since 1.0, 2022-11-16 14:53:29
 */
public class ContractCompanyInfo extends AlipayObject {

	private static final long serialVersionUID = 4339167954473451177L;

	/**
	 * 企业信用代码或者营业执照注册号
	 */
	@ApiField("company_cert_no")
	private String companyCertNo;

	/**
	 * 企业名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 企业法人身份证号
	 */
	@ApiField("legal_person_cert_no")
	private String legalPersonCertNo;

	/**
	 * 企业法人名称
	 */
	@ApiField("legal_person_name")
	private String legalPersonName;

	/**
	 * 电子合同企业签署区配置，userType=COMPANY
	 */
	@ApiField("sign_area")
	private ContractSignArea signArea;

	public String getCompanyCertNo() {
		return this.companyCertNo;
	}
	public void setCompanyCertNo(String companyCertNo) {
		this.companyCertNo = companyCertNo;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getLegalPersonCertNo() {
		return this.legalPersonCertNo;
	}
	public void setLegalPersonCertNo(String legalPersonCertNo) {
		this.legalPersonCertNo = legalPersonCertNo;
	}

	public String getLegalPersonName() {
		return this.legalPersonName;
	}
	public void setLegalPersonName(String legalPersonName) {
		this.legalPersonName = legalPersonName;
	}

	public ContractSignArea getSignArea() {
		return this.signArea;
	}
	public void setSignArea(ContractSignArea signArea) {
		this.signArea = signArea;
	}

}
