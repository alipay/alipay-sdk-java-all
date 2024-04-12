package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 注册双链通会员
 *
 * @author auto create
 * @since 1.0, 2020-01-06 14:33:47
 */
public class AnttechBlockchainFinanceCustomerCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8531411568272815721L;

	/**
	 * 企业联系邮箱号
	 */
	@ApiField("company_email")
	private String companyEmail;

	/**
	 * 公司名
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 企业法人证件号码
	 */
	@ApiField("legal_person_cert_no")
	private String legalPersonCertNo;

	/**
	 * 企业法人证件类型，100：居民身份证
	 */
	@ApiField("legal_person_cert_type")
	private String legalPersonCertType;

	/**
	 * 企业法人姓名
	 */
	@ApiField("legal_person_name")
	private String legalPersonName;

	/**
	 * 企业法人手机号
	 */
	@ApiField("legal_person_phone_num")
	private String legalPersonPhoneNum;

	/**
	 * 统一社会信用代码
	 */
	@ApiField("org_code")
	private String orgCode;

	/**
	 * 企业角色，核心企业和供应商，CORE_BUSINESS和SUPPLIER
	 */
	@ApiField("role_type")
	private String roleType;

	/**
	 * 操作员证件号码
	 */
	@ApiField("user_cert_no")
	private String userCertNo;

	/**
	 * 证件类型，100：居民身份证
	 */
	@ApiField("user_cert_type")
	private String userCertType;

	/**
	 * 操作员姓名
	 */
	@ApiField("user_person_name")
	private String userPersonName;

	/**
	 * 操作员手机号
	 */
	@ApiField("user_phone_num")
	private String userPhoneNum;

	public String getCompanyEmail() {
		return this.companyEmail;
	}
	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
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

	public String getLegalPersonPhoneNum() {
		return this.legalPersonPhoneNum;
	}
	public void setLegalPersonPhoneNum(String legalPersonPhoneNum) {
		this.legalPersonPhoneNum = legalPersonPhoneNum;
	}

	public String getOrgCode() {
		return this.orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getRoleType() {
		return this.roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public String getUserCertNo() {
		return this.userCertNo;
	}
	public void setUserCertNo(String userCertNo) {
		this.userCertNo = userCertNo;
	}

	public String getUserCertType() {
		return this.userCertType;
	}
	public void setUserCertType(String userCertType) {
		this.userCertType = userCertType;
	}

	public String getUserPersonName() {
		return this.userPersonName;
	}
	public void setUserPersonName(String userPersonName) {
		this.userPersonName = userPersonName;
	}

	public String getUserPhoneNum() {
		return this.userPhoneNum;
	}
	public void setUserPhoneNum(String userPhoneNum) {
		this.userPhoneNum = userPhoneNum;
	}

}
