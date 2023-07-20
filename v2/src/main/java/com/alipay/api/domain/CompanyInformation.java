package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业信息
 *
 * @author auto create
 * @since 1.0, 2021-04-13 11:11:01
 */
public class CompanyInformation extends AlipayObject {

	private static final long serialVersionUID = 2355984635995417455L;

	/**
	 * 行业分类代码默认为F51-5193
	 */
	@ApiField("business_category_code")
	private String businessCategoryCode;

	/**
	 * 营业许可证有效期开始,格式（yyyy-MM-dd）
	 */
	@ApiField("company_cert_effective_date")
	private String companyCertEffectiveDate;

	/**
	 * 营业许可证有效期结束,格式（yyyy-MM-dd）
	 */
	@ApiField("company_cert_expiration_date")
	private String companyCertExpirationDate;

	/**
	 * 企业身份标识号码
	 */
	@ApiField("company_cert_no")
	private String companyCertNo;

	/**
	 * 企业证件类型,NATIONAL_LEGAL-传统工商注册类型;NATIONAL_LEGAL_MERGE-统一社会信用代码
	 */
	@ApiField("company_cert_type")
	private String companyCertType;

	/**
	 * Jiangsu zhuo'ao energy saving equipment installation engineering Co., Ltd
	 */
	@ApiField("company_english_name")
	private String companyEnglishName;

	/**
	 * 企业名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 企业登记地址
	 */
	@ApiField("company_registered_address")
	private String companyRegisteredAddress;

	/**
	 * 注册资本，币种最小单位，如果是CNY，则单位分
	 */
	@ApiField("company_registered_capital_amount")
	private String companyRegisteredCapitalAmount;

	/**
	 * 注册资本，币种
	 */
	@ApiField("company_registered_capital_amount_currency")
	private String companyRegisteredCapitalAmountCurrency;

	/**
	 * 企业登记国别代码默认为CN
	 */
	@ApiField("company_registered_country")
	private String companyRegisteredCountry;

	/**
	 * 企业规模默认为小型企业
	 */
	@ApiField("company_size")
	private String companySize;

	/**
	 * 经济类型代码默认为175 - 个体经营
	 */
	@ApiField("economic_category_code")
	private String economicCategoryCode;

	public String getBusinessCategoryCode() {
		return this.businessCategoryCode;
	}
	public void setBusinessCategoryCode(String businessCategoryCode) {
		this.businessCategoryCode = businessCategoryCode;
	}

	public String getCompanyCertEffectiveDate() {
		return this.companyCertEffectiveDate;
	}
	public void setCompanyCertEffectiveDate(String companyCertEffectiveDate) {
		this.companyCertEffectiveDate = companyCertEffectiveDate;
	}

	public String getCompanyCertExpirationDate() {
		return this.companyCertExpirationDate;
	}
	public void setCompanyCertExpirationDate(String companyCertExpirationDate) {
		this.companyCertExpirationDate = companyCertExpirationDate;
	}

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

	public String getCompanyEnglishName() {
		return this.companyEnglishName;
	}
	public void setCompanyEnglishName(String companyEnglishName) {
		this.companyEnglishName = companyEnglishName;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyRegisteredAddress() {
		return this.companyRegisteredAddress;
	}
	public void setCompanyRegisteredAddress(String companyRegisteredAddress) {
		this.companyRegisteredAddress = companyRegisteredAddress;
	}

	public String getCompanyRegisteredCapitalAmount() {
		return this.companyRegisteredCapitalAmount;
	}
	public void setCompanyRegisteredCapitalAmount(String companyRegisteredCapitalAmount) {
		this.companyRegisteredCapitalAmount = companyRegisteredCapitalAmount;
	}

	public String getCompanyRegisteredCapitalAmountCurrency() {
		return this.companyRegisteredCapitalAmountCurrency;
	}
	public void setCompanyRegisteredCapitalAmountCurrency(String companyRegisteredCapitalAmountCurrency) {
		this.companyRegisteredCapitalAmountCurrency = companyRegisteredCapitalAmountCurrency;
	}

	public String getCompanyRegisteredCountry() {
		return this.companyRegisteredCountry;
	}
	public void setCompanyRegisteredCountry(String companyRegisteredCountry) {
		this.companyRegisteredCountry = companyRegisteredCountry;
	}

	public String getCompanySize() {
		return this.companySize;
	}
	public void setCompanySize(String companySize) {
		this.companySize = companySize;
	}

	public String getEconomicCategoryCode() {
		return this.economicCategoryCode;
	}
	public void setEconomicCategoryCode(String economicCategoryCode) {
		this.economicCategoryCode = economicCategoryCode;
	}

}
