package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家基础信息响应
 *
 * @author auto create
 * @since 1.0, 2023-11-09 15:37:27
 */
public class MerchantBaseInfoResponse extends AlipayObject {

	private static final long serialVersionUID = 3233798992486898662L;

	/**
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 企业地址
	 */
	@ApiField("corp_address")
	private String corpAddress;

	/**
	 * XX企业
	 */
	@ApiField("corp_name")
	private String corpName;

	/**
	 * 企业性质编码
	 */
	@ApiField("corp_nature_code")
	private String corpNatureCode;

	/**
	 * 公司类型
	 */
	@ApiField("corp_type")
	private String corpType;

	/**
	 * 金额单位
	 */
	@ApiField("currency_name")
	private String currencyName;

	/**
	 * 地区
	 */
	@ApiField("district")
	private String district;

	/**
	 * 地区编码
	 */
	@ApiField("district_encode")
	private String districtEncode;

	/**
	 * 成立日期
	 */
	@ApiField("established_date")
	private String establishedDate;

	/**
	 * 行业代码
	 */
	@ApiField("industry_code")
	private String industryCode;

	/**
	 * 是否最新
	 */
	@ApiField("is_latest")
	private Long isLatest;

	/**
	 * 发照日期
	 */
	@ApiField("issue_date")
	private String issueDate;

	/**
	 * 法人
	 */
	@ApiField("legal_representative")
	private String legalRepresentative;

	/**
	 * 法人id
	 */
	@ApiField("legal_representative_id")
	private String legalRepresentativeId;

	/**
	 * 营业期限
	 */
	@ApiField("operating_dur")
	private String operatingDur;

	/**
	 * 经营范围
	 */
	@ApiField("operating_scope")
	private String operatingScope;

	/**
	 * 经营状态
	 */
	@ApiField("operating_status")
	private String operatingStatus;

	/**
	 * 组织机构代码
	 */
	@ApiField("org_code")
	private String orgCode;

	/**
	 * 省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 登记机关
	 */
	@ApiField("record_authority")
	private String recordAuthority;

	/**
	 * 注册资本
	 */
	@ApiField("reg_capital_pub")
	private String regCapitalPub;

	/**
	 * 注册号
	 */
	@ApiField("reg_num")
	private String regNum;

	/**
	 * 电话
	 */
	@ApiField("telephone")
	private String telephone;

	/**
	 * 所属三级行业
	 */
	@ApiField("third_level_industry")
	private String thirdLevelIndustry;

	/**
	 * 统一社会信用代码
	 */
	@ApiField("unified_social_credit_code")
	private String unifiedSocialCreditCode;

	/**
	 * 曾用名
	 */
	@ApiField("used_name")
	private String usedName;

	/**
	 * 网址
	 */
	@ApiField("website")
	private String website;

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCorpAddress() {
		return this.corpAddress;
	}
	public void setCorpAddress(String corpAddress) {
		this.corpAddress = corpAddress;
	}

	public String getCorpName() {
		return this.corpName;
	}
	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}

	public String getCorpNatureCode() {
		return this.corpNatureCode;
	}
	public void setCorpNatureCode(String corpNatureCode) {
		this.corpNatureCode = corpNatureCode;
	}

	public String getCorpType() {
		return this.corpType;
	}
	public void setCorpType(String corpType) {
		this.corpType = corpType;
	}

	public String getCurrencyName() {
		return this.currencyName;
	}
	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public String getDistrict() {
		return this.district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

	public String getDistrictEncode() {
		return this.districtEncode;
	}
	public void setDistrictEncode(String districtEncode) {
		this.districtEncode = districtEncode;
	}

	public String getEstablishedDate() {
		return this.establishedDate;
	}
	public void setEstablishedDate(String establishedDate) {
		this.establishedDate = establishedDate;
	}

	public String getIndustryCode() {
		return this.industryCode;
	}
	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
	}

	public Long getIsLatest() {
		return this.isLatest;
	}
	public void setIsLatest(Long isLatest) {
		this.isLatest = isLatest;
	}

	public String getIssueDate() {
		return this.issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getLegalRepresentative() {
		return this.legalRepresentative;
	}
	public void setLegalRepresentative(String legalRepresentative) {
		this.legalRepresentative = legalRepresentative;
	}

	public String getLegalRepresentativeId() {
		return this.legalRepresentativeId;
	}
	public void setLegalRepresentativeId(String legalRepresentativeId) {
		this.legalRepresentativeId = legalRepresentativeId;
	}

	public String getOperatingDur() {
		return this.operatingDur;
	}
	public void setOperatingDur(String operatingDur) {
		this.operatingDur = operatingDur;
	}

	public String getOperatingScope() {
		return this.operatingScope;
	}
	public void setOperatingScope(String operatingScope) {
		this.operatingScope = operatingScope;
	}

	public String getOperatingStatus() {
		return this.operatingStatus;
	}
	public void setOperatingStatus(String operatingStatus) {
		this.operatingStatus = operatingStatus;
	}

	public String getOrgCode() {
		return this.orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getRecordAuthority() {
		return this.recordAuthority;
	}
	public void setRecordAuthority(String recordAuthority) {
		this.recordAuthority = recordAuthority;
	}

	public String getRegCapitalPub() {
		return this.regCapitalPub;
	}
	public void setRegCapitalPub(String regCapitalPub) {
		this.regCapitalPub = regCapitalPub;
	}

	public String getRegNum() {
		return this.regNum;
	}
	public void setRegNum(String regNum) {
		this.regNum = regNum;
	}

	public String getTelephone() {
		return this.telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getThirdLevelIndustry() {
		return this.thirdLevelIndustry;
	}
	public void setThirdLevelIndustry(String thirdLevelIndustry) {
		this.thirdLevelIndustry = thirdLevelIndustry;
	}

	public String getUnifiedSocialCreditCode() {
		return this.unifiedSocialCreditCode;
	}
	public void setUnifiedSocialCreditCode(String unifiedSocialCreditCode) {
		this.unifiedSocialCreditCode = unifiedSocialCreditCode;
	}

	public String getUsedName() {
		return this.usedName;
	}
	public void setUsedName(String usedName) {
		this.usedName = usedName;
	}

	public String getWebsite() {
		return this.website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}

}
