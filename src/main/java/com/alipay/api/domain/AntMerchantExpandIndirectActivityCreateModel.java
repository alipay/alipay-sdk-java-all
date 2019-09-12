package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间联商户运营活动报名接口
 *
 * @author auto create
 * @since 1.0, 2018-12-29 11:01:33
 */
public class AntMerchantExpandIndirectActivityCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8565623744452629273L;

	/**
	 * 活动类型，间连商户报名的支付宝活动类型。
蓝海行动：BLUE_SEA
特殊行业优惠费率：INDUSTRY_SPECIAL
	 */
	@ApiField("activity_type")
	private String activityType;

	/**
	 * 商户简称，门头照的名称或者大众点评、美团、饿了么、口碑、百度外卖入驻平台名称。需和进件时别名保持一致。
	 */
	@ApiField("alias_name")
	private String aliasName;

	/**
	 * 银行卡信息。
特殊行业，请参见<a href="https://docs.open.alipay.com/10933">间连特殊行业上传资质</a>
	 */
	@ApiField("bank_account")
	private BankCardInfo bankAccount;

	/**
	 * 营业执照，要求营业执照文本信息清晰可见。
请上传照片OSSKey（参见应用场景说明）。
蓝海行动必传。
特殊行业，请参见<a href="https://docs.open.alipay.com/10933">间连特殊行业上传资质</a>
	 */
	@ApiField("business_license_pic")
	private String businessLicensePic;

	/**
	 * 证明文件图片。
请上传照片OSSKey（参见应用场景说明）。
特殊行业，请参见<a href="https://docs.open.alipay.com/10933">间连特殊行业上传资质</a>
	 */
	@ApiField("certificate_file")
	private String certificateFile;

	/**
	 * 收费样本。
请上传照片OSSKey（参见应用场景说明）。
特殊行业，请参见<a href="https://docs.open.alipay.com/10933">间连特殊行业上传资质</a>
	 */
	@ApiField("charge_sample")
	private String chargeSample;

	/**
	 * 收银台照片
请上传照片OSSKey（参见应用场景说明）。
蓝海活动必须包含：①主扫：扫码支付场景需要展示具有支付宝logo和“推荐使用支付宝 或 支付就用支付宝”露出的二维码物料或立牌；②被
扫：展示具有支付宝logo和推荐使用支付宝 或 支付就用支付宝”的扫码机具（盒子 ）
特殊行业，请参见<a href="https://docs.open.alipay.com/10933">间连特殊行业上传资质</a>
	 */
	@ApiField("checkstand_pic")
	private String checkstandPic;

	/**
	 * 照会。
请上传照片OSSKey（参见应用场景说明）。
特殊行业，请参见<a href="https://docs.open.alipay.com/10933">间连特殊行业上传资质</a>
	 */
	@ApiField("diplomatic_note")
	private String diplomaticNote;

	/**
	 * 店内环境照，要求照片清晰可见。
请上传照片OSSKey（参见应用场景说明）。
蓝海活动必传。
特殊行业，请参见<a href="https://docs.open.alipay.com/10933">间连特殊行业上传资质</a>
	 */
	@ApiField("indoor_pic")
	private String indoorPic;

	/**
	 * 事业单位法人证书图片。
请上传照片OSSKey（参见应用场景说明）。
特殊行业，请参见<a href="https://docs.open.alipay.com/10933">间连特殊行业上传资质</a>
	 */
	@ApiField("institutional_organization_pic")
	private String institutionalOrganizationPic;

	/**
	 * 法人身份证图片。需上传包含正反面的法人身份证图片。
请上传照片OSSKey（参见应用场景说明）。
特殊行业，请参见<a href="https://docs.open.alipay.com/10933">间连特殊行业上传资质</a>
	 */
	@ApiField("legal_person_pic")
	private String legalPersonPic;

	/**
	 * 法人登记证书图片。
请上传照片OSSKey（参见应用场景说明）。
特殊行业，请参见<a href="https://docs.open.alipay.com/10933">间连特殊行业上传资质</a>
	 */
	@ApiField("legal_person_registration_pic")
	private String legalPersonRegistrationPic;

	/**
	 * 医疗执业许可证图片。
请上传照片OSSKey（参见应用场景说明）。
特殊行业，请参见<a href="https://docs.open.alipay.com/10933">间连特殊行业上传资质</a>
	 */
	@ApiField("medical_instrument_practice_license_pic")
	private String medicalInstrumentPracticeLicensePic;

	/**
	 * 商户名称，营业执照上的名称，需和进件名称保持一致。
	 */
	@ApiField("name")
	private String name;

	/**
	 * 组织机构代码证图片。
请上传照片OSSKey（参见应用场景说明）。
特殊行业，请参见<a href="https://docs.open.alipay.com/10933">间连特殊行业上传资质</a>
	 */
	@ApiField("org_cert_pic")
	private String orgCertPic;

	/**
	 * 民办非企业单位登记证书图片。
请上传照片OSSKey（参见应用场景说明）。
特殊行业，请参见<a href="https://docs.open.alipay.com/10933">间连特殊行业上传资质</a>
	 */
	@ApiField("private_nonenterprise_units")
	private String privateNonenterpriseUnits;

	/**
	 * 办学资质图片。
请上传照片OSSKey（参见应用场景说明）。
特殊行业，请参见<a href="https://docs.open.alipay.com/10933">间连特殊行业上传资质</a>
	 */
	@ApiField("run_school_license_pic")
	private String runSchoolLicensePic;

	/**
	 * 主流餐饮平台入驻证明（任选一个即可）：大众点评、美团、饿了么、口碑、百度外卖餐饮平台商户展示页面。
请上传照片OSSKey（参见应用场景说明）。
蓝海活动必传。
特殊行业，请参见<a href="https://docs.open.alipay.com/10933">间连特殊行业上传资质</a>
	 */
	@ApiField("settled_pic")
	private String settledPic;

	/**
	 * 门头照。
请上传照片OSSKey（参见应用场景说明）。
蓝海行动必传。
特殊行业，请参见<a href="https://docs.open.alipay.com/10933">间连特殊行业上传资质</a>
	 */
	@ApiField("shop_entrance_pic")
	private String shopEntrancePic;

	/**
	 * 商户在支付宝入驻成功后，生成的支付宝内全局唯一的商户编号
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

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

	public BankCardInfo getBankAccount() {
		return this.bankAccount;
	}
	public void setBankAccount(BankCardInfo bankAccount) {
		this.bankAccount = bankAccount;
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

	public String getIndoorPic() {
		return this.indoorPic;
	}
	public void setIndoorPic(String indoorPic) {
		this.indoorPic = indoorPic;
	}

	public String getInstitutionalOrganizationPic() {
		return this.institutionalOrganizationPic;
	}
	public void setInstitutionalOrganizationPic(String institutionalOrganizationPic) {
		this.institutionalOrganizationPic = institutionalOrganizationPic;
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

	public String getPrivateNonenterpriseUnits() {
		return this.privateNonenterpriseUnits;
	}
	public void setPrivateNonenterpriseUnits(String privateNonenterpriseUnits) {
		this.privateNonenterpriseUnits = privateNonenterpriseUnits;
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

}
