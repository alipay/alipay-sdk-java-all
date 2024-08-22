package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业模型描述
 *
 * @author auto create
 * @since 1.0, 2021-01-29 16:41:29
 */
public class DefiCustCompanyDTO extends AlipayObject {

	private static final long serialVersionUID = 7353383831381838872L;

	/**
	 * 企业证件号码
	 */
	@ApiField("company_cert_no")
	private String companyCertNo;

	/**
	 * 企业证件类型（2011-统一社会信用编码）
	 */
	@ApiField("company_cert_type")
	private String companyCertType;

	/**
	 * 企业名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 法人证件号码
	 */
	@ApiField("legal_person_cert_no")
	private String legalPersonCertNo;

	/**
	 * 法人证件类型（100-身份证，102-护照）
	 */
	@ApiField("legal_person_cert_type")
	private String legalPersonCertType;

	/**
	 * 法人姓名
	 */
	@ApiField("legal_person_name")
	private String legalPersonName;

	public String getCompanyCertNo() {
		return this.companyCertNo;
	}
	public void setCompanyCertNo(String companyCertNo) {
		this.companyCertNo = companyCertNo;
	}

	public String getCompanyCertType() {
		return this.companyCertType;
	}
	public void setCompanyCertType(String companyCertType) {
		this.companyCertType = companyCertType;
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

	public String getLegalPersonCertType() {
		return this.legalPersonCertType;
	}
	public void setLegalPersonCertType(String legalPersonCertType) {
		this.legalPersonCertType = legalPersonCertType;
	}

	public String getLegalPersonName() {
		return this.legalPersonName;
	}
	public void setLegalPersonName(String legalPersonName) {
		this.legalPersonName = legalPersonName;
	}

}
