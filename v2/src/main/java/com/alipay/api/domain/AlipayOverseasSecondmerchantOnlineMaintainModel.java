package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 海外线上商户报备接口
 *
 * @author auto create
 * @since 1.0, 2021-12-22 17:15:58
 */
public class AlipayOverseasSecondmerchantOnlineMaintainModel extends AlipayObject {

	private static final long serialVersionUID = 7174686443554751978L;

	/**
	 * 联系人邮箱
	 */
	@ApiField("contact_email")
	private String contactEmail;

	/**
	 * 联系人电话
	 */
	@ApiField("contact_no")
	private String contactNo;

	/**
	 * 客服邮箱
	 */
	@ApiField("cs_email")
	private String csEmail;

	/**
	 * 客服电话
	 */
	@ApiField("cs_no")
	private String csNo;

	/**
	 * 二级商户地址
	 */
	@ApiField("register_address")
	private String registerAddress;

	/**
	 * 二级商户所在国家码
	 */
	@ApiField("register_country")
	private String registerCountry;

	/**
	 * 公司注册号
	 */
	@ApiField("registration_no")
	private String registrationNo;

	/**
	 * 个人ID
	 */
	@ApiField("representative_id")
	private String representativeId;

	/**
	 * 个人姓名
	 */
	@ApiField("representative_name")
	private String representativeName;

	/**
	 * 法定代表人国籍
	 */
	@ApiField("representative_nationality")
	private String representativeNationality;

	/**
	 * 二级商户ID
	 */
	@ApiField("secondary_merchant_id")
	private String secondaryMerchantId;

	/**
	 * 二级商户行业类型
	 */
	@ApiField("secondary_merchant_industry")
	private String secondaryMerchantIndustry;

	/**
	 * 二级商户名称
	 */
	@ApiField("secondary_merchant_name")
	private String secondaryMerchantName;

	/**
	 * 二级商户类型
	 */
	@ApiField("secondary_merchant_type")
	private String secondaryMerchantType;

	/**
	 * 商户结算卡号
	 */
	@ApiField("settlement_no")
	private String settlementNo;

	/**
	 * 股东ID
	 */
	@ApiField("shareholder_id")
	private String shareholderId;

	/**
	 * 股东名称
	 */
	@ApiField("shareholder_name")
	private String shareholderName;

	/**
	 * 股东国籍
	 */
	@ApiField("shareholder_nationality")
	private String shareholderNationality;

	/**
	 * 线上二级商户网站信息
	 */
	@ApiListField("site_infos")
	@ApiField("merchant_site_info")
	private List<MerchantSiteInfo> siteInfos;

	public String getContactEmail() {
		return this.contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactNo() {
		return this.contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getCsEmail() {
		return this.csEmail;
	}
	public void setCsEmail(String csEmail) {
		this.csEmail = csEmail;
	}

	public String getCsNo() {
		return this.csNo;
	}
	public void setCsNo(String csNo) {
		this.csNo = csNo;
	}

	public String getRegisterAddress() {
		return this.registerAddress;
	}
	public void setRegisterAddress(String registerAddress) {
		this.registerAddress = registerAddress;
	}

	public String getRegisterCountry() {
		return this.registerCountry;
	}
	public void setRegisterCountry(String registerCountry) {
		this.registerCountry = registerCountry;
	}

	public String getRegistrationNo() {
		return this.registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getRepresentativeId() {
		return this.representativeId;
	}
	public void setRepresentativeId(String representativeId) {
		this.representativeId = representativeId;
	}

	public String getRepresentativeName() {
		return this.representativeName;
	}
	public void setRepresentativeName(String representativeName) {
		this.representativeName = representativeName;
	}

	public String getRepresentativeNationality() {
		return this.representativeNationality;
	}
	public void setRepresentativeNationality(String representativeNationality) {
		this.representativeNationality = representativeNationality;
	}

	public String getSecondaryMerchantId() {
		return this.secondaryMerchantId;
	}
	public void setSecondaryMerchantId(String secondaryMerchantId) {
		this.secondaryMerchantId = secondaryMerchantId;
	}

	public String getSecondaryMerchantIndustry() {
		return this.secondaryMerchantIndustry;
	}
	public void setSecondaryMerchantIndustry(String secondaryMerchantIndustry) {
		this.secondaryMerchantIndustry = secondaryMerchantIndustry;
	}

	public String getSecondaryMerchantName() {
		return this.secondaryMerchantName;
	}
	public void setSecondaryMerchantName(String secondaryMerchantName) {
		this.secondaryMerchantName = secondaryMerchantName;
	}

	public String getSecondaryMerchantType() {
		return this.secondaryMerchantType;
	}
	public void setSecondaryMerchantType(String secondaryMerchantType) {
		this.secondaryMerchantType = secondaryMerchantType;
	}

	public String getSettlementNo() {
		return this.settlementNo;
	}
	public void setSettlementNo(String settlementNo) {
		this.settlementNo = settlementNo;
	}

	public String getShareholderId() {
		return this.shareholderId;
	}
	public void setShareholderId(String shareholderId) {
		this.shareholderId = shareholderId;
	}

	public String getShareholderName() {
		return this.shareholderName;
	}
	public void setShareholderName(String shareholderName) {
		this.shareholderName = shareholderName;
	}

	public String getShareholderNationality() {
		return this.shareholderNationality;
	}
	public void setShareholderNationality(String shareholderNationality) {
		this.shareholderNationality = shareholderNationality;
	}

	public List<MerchantSiteInfo> getSiteInfos() {
		return this.siteInfos;
	}
	public void setSiteInfos(List<MerchantSiteInfo> siteInfos) {
		this.siteInfos = siteInfos;
	}

}
