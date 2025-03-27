package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 公司
 *
 * @author auto create
 * @since 1.0, 2024-06-07 15:31:11
 */
public class CorpCompanyVO extends AlipayObject {

	private static final long serialVersionUID = 2597791958799672784L;

	/**
	 * 经营范围
	 */
	@ApiField("business_activities")
	private String businessActivities;

	/**
	 * 经营期限
	 */
	@ApiField("business_period")
	private Date businessPeriod;

	/**
	 * 公司维护人
	 */
	@ApiListField("company_maintainer")
	@ApiField("opera_person_v_o")
	private List<OperaPersonVO> companyMaintainer;

	/**
	 * 公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 公司英文名称
	 */
	@ApiField("company_name_en")
	private String companyNameEn;

	/**
	 * 公司状态
	 */
	@ApiField("company_status")
	private String companyStatus;

	/**
	 * 公司类型
	 */
	@ApiField("company_type")
	private String companyType;

	/**
	 * 公司电话
	 */
	@ApiField("contact_no")
	private String contactNo;

	/**
	 * 董监高列表
	 */
	@ApiListField("corp_manager_list")
	@ApiField("corp_manager_v_o")
	private List<CorpManagerVO> corpManagerList;

	/**
	 * 股东列表
	 */
	@ApiListField("corp_shareholder_list")
	@ApiField("corp_shareholder_v_o")
	private List<CorpShareholderVO> corpShareholderList;

	/**
	 * 区域
	 */
	@ApiField("country")
	private String country;

	/**
	 * 注册资本
	 */
	@ApiListField("currency")
	@ApiField("currency_v_o")
	private List<CurrencyVO> currency;

	/**
	 * 公司邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 提报时间
	 */
	@ApiField("filing_annual_return_start_date")
	private Date filingAnnualReturnStartDate;

	/**
	 * 财政年度结算日
	 */
	@ApiField("finance_year_settlement")
	private Date financeYearSettlement;

	/**
	 * 成立地区
	 */
	@ApiField("incorporation_area")
	private String incorporationArea;

	/**
	 * 成立所在国
	 */
	@ApiField("incorporation_country")
	private String incorporationCountry;

	/**
	 * 公司成立日期
	 */
	@ApiField("incorporation_date")
	private Date incorporationDate;

	/**
	 * 法定代表人
	 */
	@ApiField("legal_person")
	private PersonSimpleVO legalPerson;

	/**
	 * oucode
	 */
	@ApiField("ou_code")
	private String ouCode;

	/**
	 * 所属公司
	 */
	@ApiField("parent_company")
	private String parentCompany;

	/**
	 * 曾用名
	 */
	@ApiField("previous_name")
	private String previousName;

	/**
	 * 公司注册地址-省 市 区 信息
	 */
	@ApiField("registered_address_format")
	private RegisteredAddressVO registeredAddressFormat;

	/**
	 * 公司英文注册地址
	 */
	@ApiField("registered_office_address_en")
	private String registeredOfficeAddressEn;

	/**
	 * 统一社会信用代码
	 */
	@ApiField("registration_no")
	private String registrationNo;

	/**
	 * 周年股东大会日期
	 */
	@ApiField("shareholders_meeting_date")
	private Date shareholdersMeetingDate;

	public String getBusinessActivities() {
		return this.businessActivities;
	}
	public void setBusinessActivities(String businessActivities) {
		this.businessActivities = businessActivities;
	}

	public Date getBusinessPeriod() {
		return this.businessPeriod;
	}
	public void setBusinessPeriod(Date businessPeriod) {
		this.businessPeriod = businessPeriod;
	}

	public List<OperaPersonVO> getCompanyMaintainer() {
		return this.companyMaintainer;
	}
	public void setCompanyMaintainer(List<OperaPersonVO> companyMaintainer) {
		this.companyMaintainer = companyMaintainer;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyNameEn() {
		return this.companyNameEn;
	}
	public void setCompanyNameEn(String companyNameEn) {
		this.companyNameEn = companyNameEn;
	}

	public String getCompanyStatus() {
		return this.companyStatus;
	}
	public void setCompanyStatus(String companyStatus) {
		this.companyStatus = companyStatus;
	}

	public String getCompanyType() {
		return this.companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getContactNo() {
		return this.contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public List<CorpManagerVO> getCorpManagerList() {
		return this.corpManagerList;
	}
	public void setCorpManagerList(List<CorpManagerVO> corpManagerList) {
		this.corpManagerList = corpManagerList;
	}

	public List<CorpShareholderVO> getCorpShareholderList() {
		return this.corpShareholderList;
	}
	public void setCorpShareholderList(List<CorpShareholderVO> corpShareholderList) {
		this.corpShareholderList = corpShareholderList;
	}

	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public List<CurrencyVO> getCurrency() {
		return this.currency;
	}
	public void setCurrency(List<CurrencyVO> currency) {
		this.currency = currency;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFilingAnnualReturnStartDate() {
		return this.filingAnnualReturnStartDate;
	}
	public void setFilingAnnualReturnStartDate(Date filingAnnualReturnStartDate) {
		this.filingAnnualReturnStartDate = filingAnnualReturnStartDate;
	}

	public Date getFinanceYearSettlement() {
		return this.financeYearSettlement;
	}
	public void setFinanceYearSettlement(Date financeYearSettlement) {
		this.financeYearSettlement = financeYearSettlement;
	}

	public String getIncorporationArea() {
		return this.incorporationArea;
	}
	public void setIncorporationArea(String incorporationArea) {
		this.incorporationArea = incorporationArea;
	}

	public String getIncorporationCountry() {
		return this.incorporationCountry;
	}
	public void setIncorporationCountry(String incorporationCountry) {
		this.incorporationCountry = incorporationCountry;
	}

	public Date getIncorporationDate() {
		return this.incorporationDate;
	}
	public void setIncorporationDate(Date incorporationDate) {
		this.incorporationDate = incorporationDate;
	}

	public PersonSimpleVO getLegalPerson() {
		return this.legalPerson;
	}
	public void setLegalPerson(PersonSimpleVO legalPerson) {
		this.legalPerson = legalPerson;
	}

	public String getOuCode() {
		return this.ouCode;
	}
	public void setOuCode(String ouCode) {
		this.ouCode = ouCode;
	}

	public String getParentCompany() {
		return this.parentCompany;
	}
	public void setParentCompany(String parentCompany) {
		this.parentCompany = parentCompany;
	}

	public String getPreviousName() {
		return this.previousName;
	}
	public void setPreviousName(String previousName) {
		this.previousName = previousName;
	}

	public RegisteredAddressVO getRegisteredAddressFormat() {
		return this.registeredAddressFormat;
	}
	public void setRegisteredAddressFormat(RegisteredAddressVO registeredAddressFormat) {
		this.registeredAddressFormat = registeredAddressFormat;
	}

	public String getRegisteredOfficeAddressEn() {
		return this.registeredOfficeAddressEn;
	}
	public void setRegisteredOfficeAddressEn(String registeredOfficeAddressEn) {
		this.registeredOfficeAddressEn = registeredOfficeAddressEn;
	}

	public String getRegistrationNo() {
		return this.registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public Date getShareholdersMeetingDate() {
		return this.shareholdersMeetingDate;
	}
	public void setShareholdersMeetingDate(Date shareholdersMeetingDate) {
		this.shareholdersMeetingDate = shareholdersMeetingDate;
	}

}
