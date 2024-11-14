package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间联商户运营活动报名接口
 *
 * @author auto create
 * @since 1.0, 2023-07-20 15:22:54
 */
public class AntMerchantExpandIndirectActivityCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6883935999398735584L;

	/**
	 * 活动类型，间连商户报名的支付宝活动类型。
特殊行业优惠费率：INDUSTRY_SPECIAL
服务商返佣活动：REBATE
	 */
	@ApiField("activity_type")
	private String activityType;

	/**
	 * 商户简称，需和进件时简称保持一致。
	 */
	@ApiField("alias_name")
	private String aliasName;

	/**
	 * app的应用上架市场名称，申请app支付必选
	 */
	@ApiField("app_market")
	private String appMarket;

	/**
	 * 申请app支付的app应用名称，申请app支付必选
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * APP上架截图，申请APP支付优惠费率时必填
	 */
	@ApiField("app_screenshot")
	private String appScreenshot;

	/**
	 * app上架状态，true已上架，false未上架
	 */
	@ApiField("app_status")
	private String appStatus;

	/**
	 * 申请app支付、PC网站支付时，app、网站的ICP许可证主体与申请商户不一致时提供
	 */
	@ApiField("auth_license")
	private String authLicense;

	/**
	 * 一般为商户同名银行账户信息，党费等特殊业务除外
	 */
	@ApiField("bank_account")
	private BankCardInfo bankAccount;

	/**
	 * 银行开户证明/银行开户回单/委托代收党费党支部红头文件，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。
	 */
	@ApiField("bank_account_prove")
	private String bankAccountProve;

	/**
	 * 机构跟银行的合作协议关键页/机构银行合作授权函，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key
	 */
	@ApiField("bank_cooperation_agreement")
	private String bankCooperationAgreement;

	/**
	 * 统一社会信用代码证（三证合一）、营业执照、事业单位法人证书、组织机构代码证，要求文本信息清晰可见，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。
	 */
	@ApiField("business_license_pic")
	private String businessLicensePic;

	/**
	 * 其他证明文件图片，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。
	 */
	@ApiField("certificate_file")
	private String certificateFile;

	/**
	 * 收费样本，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。
	 */
	@ApiField("charge_sample")
	private String chargeSample;

	/**
	 * 收银台照片
请上传照片OSSKey（参见应用场景说明）。
蓝海活动必须包含：①主扫：扫码支付场景需要展示具有支付宝logo和“推荐使用支付宝 或 支付就用支付宝”露出的二维码物料或立牌；②被
扫：展示具有支付宝logo和推荐使用支付宝 或 支付就用支付宝”的扫码机具（盒子 ）
特殊行业，请参见<a href="https://opendocs.alipay.com/p/01y6vi">间连特殊行业上传资质</a>
	 */
	@ApiField("checkstand_pic")
	private String checkstandPic;

	/**
	 * 照会。
请上传照片OSSKey（参见应用场景说明）。
特殊行业，请参见<a href="https://opendocs.alipay.com/p/01y6vi">间连特殊行业上传资质</a>
	 */
	@ApiField("diplomatic_note")
	private String diplomaticNote;

	/**
	 * 申请app支付、PC网站支付时，app、PC网站的ICP许可证与商户主体一致时必填
	 */
	@ApiField("icp_license")
	private String icpLicense;

	/**
	 * 店内环境照，具体可参见资质要求，要求照片清晰可见，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。
	 */
	@ApiField("indoor_pic")
	private String indoorPic;

	/**
	 * 活动报名资质表中对应的行业code
	 */
	@ApiField("industry_code")
	private String industryCode;

	/**
	 * 商户行业资质图片，如《医疗机构执业许可证》、《党组织批复成立文件》等，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key
	 */
	@ApiField("industry_qualification_image")
	private String industryQualificationImage;

	/**
	 * 事业单位法人证书图片。
请上传照片OSSKey（参见应用场景说明）。
特殊行业，请参见<a href="https://opendocs.alipay.com/p/01y6vi">间连特殊行业上传资质</a>
	 */
	@ApiField("institutional_organization_pic")
	private String institutionalOrganizationPic;

	/**
	 * 负责人授权函，如果上传代理人身份证，需补充法人授权函；上传党支部书记身份证，需补充党支部书记任命函或党组织授权函，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。
	 */
	@ApiField("legal_person_license_auth_pic")
	private String legalPersonLicenseAuthPic;

	/**
	 * 负责人身份证图片正反面，可以上传法人身份证/代理人身份证/党支部书记身份证，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。
	 */
	@ApiField("legal_person_pic")
	private String legalPersonPic;

	/**
	 * 法人登记证书图片。
请上传照片OSSKey（参见应用场景说明）。
特殊行业，请参见<a href="https://opendocs.alipay.com/p/01y6vi">间连特殊行业上传资质</a>
	 */
	@ApiField("legal_person_registration_pic")
	private String legalPersonRegistrationPic;

	/**
	 * 医疗执业许可证图片。
请上传照片OSSKey（参见应用场景说明）。
特殊行业，请参见<a href="https://opendocs.alipay.com/p/01y6vi">间连特殊行业上传资质</a>
	 */
	@ApiField("medical_instrument_practice_license_pic")
	private String medicalInstrumentPracticeLicensePic;

	/**
	 * 商户名称，注册登记证件上的名称，需和进件名称保持一致。
	 */
	@ApiField("name")
	private String name;

	/**
	 * 组织机构代码证图片。
请上传照片OSSKey（参见应用场景说明）。
特殊行业，请参见<a href="https://opendocs.alipay.com/p/01y6vi">间连特殊行业上传资质</a>
	 */
	@ApiField("org_cert_pic")
	private String orgCertPic;

	/**
	 * 申请PC网站支付的PC站点地址，申请PC支付必填
	 */
	@ApiField("pc_site")
	private String pcSite;

	/**
	 * 网站上架状态，商户申请PC支付特殊费率时必填；true已上线，false未上线
	 */
	@ApiField("pc_site_status")
	private String pcSiteStatus;

	/**
	 * 民办非企业单位登记证书图片。
请上传照片OSSKey（参见应用场景说明）。
特殊行业，请参见<a href="https://opendocs.alipay.com/p/01y6vi">间连特殊行业上传资质</a>
	 */
	@ApiField("private_nonenterprise_units")
	private String privateNonenterpriseUnits;

	/**
	 * 商户开通代扣的单日额度限制
	 */
	@ApiField("quota_per_day")
	private String quotaPerDay;

	/**
	 * 商户开通代扣的单笔额度限制
	 */
	@ApiField("quota_per_each")
	private String quotaPerEach;

	/**
	 * 办学资质图片。
请上传照片OSSKey（参见应用场景说明）。
特殊行业，请参见<a href="https://opendocs.alipay.com/p/01y6vi">间连特殊行业上传资质</a>
	 */
	@ApiField("run_school_license_pic")
	private String runSchoolLicensePic;

	/**
	 * 主流餐饮平台入驻证明（任选一个即可）：大众点评、美团、饿了么、口碑、百度外卖餐饮平台商户展示页面。
请上传照片OSSKey（参见应用场景说明）。
蓝海活动必传。
特殊行业，请参见<a href="https://opendocs.alipay.com/p/01y6vi">间连特殊行业上传资质</a>
	 */
	@ApiField("settled_pic")
	private String settledPic;

	/**
	 * 门头照，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。
	 */
	@ApiField("shop_entrance_pic")
	private String shopEntrancePic;

	/**
	 * 商户在支付宝入驻成功后，生成的支付宝内全局唯一的商户编号
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	/**
	 * 商家开通代扣的服务描述
	 */
	@ApiField("withhold_service_desc")
	private String withholdServiceDesc;

	/**
	 * 商家开通代扣的服务名称
	 */
	@ApiField("withhold_service_name")
	private String withholdServiceName;

	public String getActivityType() {
		return this.activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getAliasName() {
		return this.aliasName;
	}
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public String getAppMarket() {
		return this.appMarket;
	}
	public void setAppMarket(String appMarket) {
		this.appMarket = appMarket;
	}

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppScreenshot() {
		return this.appScreenshot;
	}
	public void setAppScreenshot(String appScreenshot) {
		this.appScreenshot = appScreenshot;
	}

	public String getAppStatus() {
		return this.appStatus;
	}
	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
	}

	public String getAuthLicense() {
		return this.authLicense;
	}
	public void setAuthLicense(String authLicense) {
		this.authLicense = authLicense;
	}

	public BankCardInfo getBankAccount() {
		return this.bankAccount;
	}
	public void setBankAccount(BankCardInfo bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getBankAccountProve() {
		return this.bankAccountProve;
	}
	public void setBankAccountProve(String bankAccountProve) {
		this.bankAccountProve = bankAccountProve;
	}

	public String getBankCooperationAgreement() {
		return this.bankCooperationAgreement;
	}
	public void setBankCooperationAgreement(String bankCooperationAgreement) {
		this.bankCooperationAgreement = bankCooperationAgreement;
	}

	public String getBusinessLicensePic() {
		return this.businessLicensePic;
	}
	public void setBusinessLicensePic(String businessLicensePic) {
		this.businessLicensePic = businessLicensePic;
	}

	public String getCertificateFile() {
		return this.certificateFile;
	}
	public void setCertificateFile(String certificateFile) {
		this.certificateFile = certificateFile;
	}

	public String getChargeSample() {
		return this.chargeSample;
	}
	public void setChargeSample(String chargeSample) {
		this.chargeSample = chargeSample;
	}

	public String getCheckstandPic() {
		return this.checkstandPic;
	}
	public void setCheckstandPic(String checkstandPic) {
		this.checkstandPic = checkstandPic;
	}

	public String getDiplomaticNote() {
		return this.diplomaticNote;
	}
	public void setDiplomaticNote(String diplomaticNote) {
		this.diplomaticNote = diplomaticNote;
	}

	public String getIcpLicense() {
		return this.icpLicense;
	}
	public void setIcpLicense(String icpLicense) {
		this.icpLicense = icpLicense;
	}

	public String getIndoorPic() {
		return this.indoorPic;
	}
	public void setIndoorPic(String indoorPic) {
		this.indoorPic = indoorPic;
	}

	public String getIndustryCode() {
		return this.industryCode;
	}
	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
	}

	public String getIndustryQualificationImage() {
		return this.industryQualificationImage;
	}
	public void setIndustryQualificationImage(String industryQualificationImage) {
		this.industryQualificationImage = industryQualificationImage;
	}

	public String getInstitutionalOrganizationPic() {
		return this.institutionalOrganizationPic;
	}
	public void setInstitutionalOrganizationPic(String institutionalOrganizationPic) {
		this.institutionalOrganizationPic = institutionalOrganizationPic;
	}

	public String getLegalPersonLicenseAuthPic() {
		return this.legalPersonLicenseAuthPic;
	}
	public void setLegalPersonLicenseAuthPic(String legalPersonLicenseAuthPic) {
		this.legalPersonLicenseAuthPic = legalPersonLicenseAuthPic;
	}

	public String getLegalPersonPic() {
		return this.legalPersonPic;
	}
	public void setLegalPersonPic(String legalPersonPic) {
		this.legalPersonPic = legalPersonPic;
	}

	public String getLegalPersonRegistrationPic() {
		return this.legalPersonRegistrationPic;
	}
	public void setLegalPersonRegistrationPic(String legalPersonRegistrationPic) {
		this.legalPersonRegistrationPic = legalPersonRegistrationPic;
	}

	public String getMedicalInstrumentPracticeLicensePic() {
		return this.medicalInstrumentPracticeLicensePic;
	}
	public void setMedicalInstrumentPracticeLicensePic(String medicalInstrumentPracticeLicensePic) {
		this.medicalInstrumentPracticeLicensePic = medicalInstrumentPracticeLicensePic;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOrgCertPic() {
		return this.orgCertPic;
	}
	public void setOrgCertPic(String orgCertPic) {
		this.orgCertPic = orgCertPic;
	}

	public String getPcSite() {
		return this.pcSite;
	}
	public void setPcSite(String pcSite) {
		this.pcSite = pcSite;
	}

	public String getPcSiteStatus() {
		return this.pcSiteStatus;
	}
	public void setPcSiteStatus(String pcSiteStatus) {
		this.pcSiteStatus = pcSiteStatus;
	}

	public String getPrivateNonenterpriseUnits() {
		return this.privateNonenterpriseUnits;
	}
	public void setPrivateNonenterpriseUnits(String privateNonenterpriseUnits) {
		this.privateNonenterpriseUnits = privateNonenterpriseUnits;
	}

	public String getQuotaPerDay() {
		return this.quotaPerDay;
	}
	public void setQuotaPerDay(String quotaPerDay) {
		this.quotaPerDay = quotaPerDay;
	}

	public String getQuotaPerEach() {
		return this.quotaPerEach;
	}
	public void setQuotaPerEach(String quotaPerEach) {
		this.quotaPerEach = quotaPerEach;
	}

	public String getRunSchoolLicensePic() {
		return this.runSchoolLicensePic;
	}
	public void setRunSchoolLicensePic(String runSchoolLicensePic) {
		this.runSchoolLicensePic = runSchoolLicensePic;
	}

	public String getSettledPic() {
		return this.settledPic;
	}
	public void setSettledPic(String settledPic) {
		this.settledPic = settledPic;
	}

	public String getShopEntrancePic() {
		return this.shopEntrancePic;
	}
	public void setShopEntrancePic(String shopEntrancePic) {
		this.shopEntrancePic = shopEntrancePic;
	}

	public String getSubMerchantId() {
		return this.subMerchantId;
	}
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

	public String getWithholdServiceDesc() {
		return this.withholdServiceDesc;
	}
	public void setWithholdServiceDesc(String withholdServiceDesc) {
		this.withholdServiceDesc = withholdServiceDesc;
	}

	public String getWithholdServiceName() {
		return this.withholdServiceName;
	}
	public void setWithholdServiceName(String withholdServiceName) {
		this.withholdServiceName = withholdServiceName;
	}

}
