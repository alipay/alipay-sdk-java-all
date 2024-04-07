package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * UpdateCustomerRequest
 *
 * @author auto create
 * @since 1.0, 2023-10-19 09:49:53
 */
public class UpdateCustomerRequest extends AlipayObject {

	private static final long serialVersionUID = 8441712321526184569L;

	/**
	 * bd
	 */
	@ApiField("bd")
	private String bd;

	/**
	 * 法人姓名
	 */
	@ApiField("charge_person_name")
	private String chargePersonName;

	/**
	 * cid
	 */
	@ApiField("cid")
	private String cid;

	/**
	 * 国家
	 */
	@ApiField("country")
	private String country;

	/**
	 * 客户行业
	 */
	@ApiField("customer_industry")
	private String customerIndustry;

	/**
	 * 客户来源
	 */
	@ApiField("customer_source")
	private String customerSource;

	/**
	 * 统一社会信用代码
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 企业名称
	 */
	@ApiField("ep_name")
	private String epName;

	/**
	 * 注册号
	 */
	@ApiField("ep_reg_no")
	private String epRegNo;

	/**
	 * 经营状态
	 */
	@ApiField("ep_status")
	private String epStatus;

	/**
	 * 企业类型
	 */
	@ApiField("ep_type")
	private String epType;

	/**
	 * 成立日期
	 */
	@ApiField("established_date")
	private Date establishedDate;

	/**
	 * 行业大类
	 */
	@ApiField("industry")
	private String industry;

	/**
	 * 行业门类
	 */
	@ApiField("industry_category")
	private String industryCategory;

	/**
	 * 所属地区
	 */
	@ApiField("location")
	private String location;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 操作人
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 区域
	 */
	@ApiField("region")
	private String region;

	/**
	 * 注册地址
	 */
	@ApiField("registered_address")
	private String registeredAddress;

	/**
	 * 注册资本
	 */
	@ApiField("registered_capital")
	private String registeredCapital;

	/**
	 * 企业人员规模
	 */
	@ApiField("social_security_account")
	private String socialSecurityAccount;

	public String getBd() {
		return this.bd;
	}
	public void setBd(String bd) {
		this.bd = bd;
	}

	public String getChargePersonName() {
		return this.chargePersonName;
	}
	public void setChargePersonName(String chargePersonName) {
		this.chargePersonName = chargePersonName;
	}

	public String getCid() {
		return this.cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getCustomerIndustry() {
		return this.customerIndustry;
	}
	public void setCustomerIndustry(String customerIndustry) {
		this.customerIndustry = customerIndustry;
	}

	public String getCustomerSource() {
		return this.customerSource;
	}
	public void setCustomerSource(String customerSource) {
		this.customerSource = customerSource;
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

	public String getEpRegNo() {
		return this.epRegNo;
	}
	public void setEpRegNo(String epRegNo) {
		this.epRegNo = epRegNo;
	}

	public String getEpStatus() {
		return this.epStatus;
	}
	public void setEpStatus(String epStatus) {
		this.epStatus = epStatus;
	}

	public String getEpType() {
		return this.epType;
	}
	public void setEpType(String epType) {
		this.epType = epType;
	}

	public Date getEstablishedDate() {
		return this.establishedDate;
	}
	public void setEstablishedDate(Date establishedDate) {
		this.establishedDate = establishedDate;
	}

	public String getIndustry() {
		return this.industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getIndustryCategory() {
		return this.industryCategory;
	}
	public void setIndustryCategory(String industryCategory) {
		this.industryCategory = industryCategory;
	}

	public String getLocation() {
		return this.location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getRegion() {
		return this.region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

	public String getRegisteredAddress() {
		return this.registeredAddress;
	}
	public void setRegisteredAddress(String registeredAddress) {
		this.registeredAddress = registeredAddress;
	}

	public String getRegisteredCapital() {
		return this.registeredCapital;
	}
	public void setRegisteredCapital(String registeredCapital) {
		this.registeredCapital = registeredCapital;
	}

	public String getSocialSecurityAccount() {
		return this.socialSecurityAccount;
	}
	public void setSocialSecurityAccount(String socialSecurityAccount) {
		this.socialSecurityAccount = socialSecurityAccount;
	}

}
