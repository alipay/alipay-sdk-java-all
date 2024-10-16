package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * UpdatePartnerRequest
 *
 * @author auto create
 * @since 1.0, 2023-10-19 09:49:14
 */
public class UpdatePartnerRequest extends AlipayObject {

	private static final long serialVersionUID = 5282628873629992151L;

	/**
	 * bd
	 */
	@ApiField("bd")
	private String bd;

	/**
	 * 合作伙伴证书编号
	 */
	@ApiField("certificate_number")
	private String certificateNumber;

	/**
	 * 合作伙认证有效期
	 */
	@ApiField("certificate_valid_date")
	private Date certificateValidDate;

	/**
	 * 法人姓名
	 */
	@ApiField("charge_person_name")
	private String chargePersonName;

	/**
	 * 国家
	 */
	@ApiField("country")
	private String country;

	/**
	 * 创建人
	 */
	@ApiField("creator")
	private String creator;

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
	 * 合作伙伴渠道分类
	 */
	@ApiField("partner_channel_type")
	private String partnerChannelType;

	/**
	 * 合作伙伴类型列表
	 */
	@ApiListField("partner_type_list")
	@ApiField("string")
	private List<String> partnerTypeList;

	/**
	 * pid
	 */
	@ApiField("pid")
	private String pid;

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
	 * 风险提示
	 */
	@ApiField("risk_warning")
	private String riskWarning;

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

	public String getCertificateNumber() {
		return this.certificateNumber;
	}
	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}

	public Date getCertificateValidDate() {
		return this.certificateValidDate;
	}
	public void setCertificateValidDate(Date certificateValidDate) {
		this.certificateValidDate = certificateValidDate;
	}

	public String getChargePersonName() {
		return this.chargePersonName;
	}
	public void setChargePersonName(String chargePersonName) {
		this.chargePersonName = chargePersonName;
	}

	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getCreator() {
		return this.creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
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

	public String getPartnerChannelType() {
		return this.partnerChannelType;
	}
	public void setPartnerChannelType(String partnerChannelType) {
		this.partnerChannelType = partnerChannelType;
	}

	public List<String> getPartnerTypeList() {
		return this.partnerTypeList;
	}
	public void setPartnerTypeList(List<String> partnerTypeList) {
		this.partnerTypeList = partnerTypeList;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
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

	public String getRiskWarning() {
		return this.riskWarning;
	}
	public void setRiskWarning(String riskWarning) {
		this.riskWarning = riskWarning;
	}

	public String getSocialSecurityAccount() {
		return this.socialSecurityAccount;
	}
	public void setSocialSecurityAccount(String socialSecurityAccount) {
		this.socialSecurityAccount = socialSecurityAccount;
	}

}
