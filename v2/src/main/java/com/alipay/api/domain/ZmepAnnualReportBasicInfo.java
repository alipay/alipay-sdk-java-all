package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业工商年报基本信息
 *
 * @author auto create
 * @since 1.0, 2025-01-20 11:20:25
 */
public class ZmepAnnualReportBasicInfo extends AlipayObject {

	private static final long serialVersionUID = 3448162426677774838L;

	/**
	 * 企业通信地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 企业控股情况
	 */
	@ApiField("control_composition")
	private String controlComposition;

	/**
	 * 企业电子邮箱
	 */
	@ApiField("email_address")
	private String emailAddress;

	/**
	 * 从业人数
	 */
	@ApiField("employee_account")
	private String employeeAccount;

	/**
	 * 统一社会信用代码/注册号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 企业名称
	 */
	@ApiField("ep_name")
	private String epName;

	/**
	 * 企业经营状态
	 */
	@ApiField("ep_status")
	private String epStatus;

	/**
	 * 是否有对外提供担保信息
	 */
	@ApiField("has_external_guarantee")
	private String hasExternalGuarantee;

	/**
	 * 是否有投资信息或购买其他公司股权
	 */
	@ApiField("has_external_invest")
	private String hasExternalInvest;

	/**
	 * 有限责任公司本年度是否发生股东股权转让
	 */
	@ApiField("has_shareholder_equity_transfer")
	private String hasShareholderEquityTransfer;

	/**
	 * 是否有网站或网店
	 */
	@ApiField("has_website")
	private String hasWebsite;

	/**
	 * 企业联系电话
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	/**
	 * 邮政编码
	 */
	@ApiField("postcode")
	private String postcode;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getControlComposition() {
		return this.controlComposition;
	}
	public void setControlComposition(String controlComposition) {
		this.controlComposition = controlComposition;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getEmployeeAccount() {
		return this.employeeAccount;
	}
	public void setEmployeeAccount(String employeeAccount) {
		this.employeeAccount = employeeAccount;
	}

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

	public String getEpName() {
		return this.epName;
	}
	public void setEpName(String epName) {
		this.epName = epName;
	}

	public String getEpStatus() {
		return this.epStatus;
	}
	public void setEpStatus(String epStatus) {
		this.epStatus = epStatus;
	}

	public String getHasExternalGuarantee() {
		return this.hasExternalGuarantee;
	}
	public void setHasExternalGuarantee(String hasExternalGuarantee) {
		this.hasExternalGuarantee = hasExternalGuarantee;
	}

	public String getHasExternalInvest() {
		return this.hasExternalInvest;
	}
	public void setHasExternalInvest(String hasExternalInvest) {
		this.hasExternalInvest = hasExternalInvest;
	}

	public String getHasShareholderEquityTransfer() {
		return this.hasShareholderEquityTransfer;
	}
	public void setHasShareholderEquityTransfer(String hasShareholderEquityTransfer) {
		this.hasShareholderEquityTransfer = hasShareholderEquityTransfer;
	}

	public String getHasWebsite() {
		return this.hasWebsite;
	}
	public void setHasWebsite(String hasWebsite) {
		this.hasWebsite = hasWebsite;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPostcode() {
		return this.postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

}
