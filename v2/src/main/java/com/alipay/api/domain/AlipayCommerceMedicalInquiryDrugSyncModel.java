package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 互联网医院药品数据同步
 *
 * @author auto create
 * @since 1.0, 2026-09-21 16:57:54
 */
public class AlipayCommerceMedicalInquiryDrugSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8721123967733114132L;

	/**
	 * 与UPC码至少一个非空
	 */
	@ApiField("approval_number")
	private String approvalNumber;

	/**
	 * 中药国标编码
	 */
	@ApiField("chinese_standard_code")
	private String chineseStandardCode;

	/**
	 * 版本号
	 */
	@ApiField("data_version")
	private String dataVersion;

	/**
	 * qd 每日1次/bid 每日2次/tid 每日3次/qid 每日4次/qod 隔日1次/qn 每晚1次/qh 每小时/q4h 每4小时/q12h 每12小时/ac 饭前/pc 饭后/hs 睡时/am 上午/pm 下午/st 立即/sos 必要时/prm 按情酌定/cito 紧急
	 */
	@ApiField("default_frequency")
	private String defaultFrequency;

	/**
	 * 舌下给药/含服给药/口服给药/静脉注射/肌内注射/皮下注射/皮内注射/动脉注射/鞘内注射/关节腔注射/眼内注射/腹腔给药/脑室内注射/椎管内注射/气管内给药/局部注射/注射给药/表皮给药/眼部给药/耳部给药/鼻腔给药/直肠给药/阴道给药/尿道给药/消化道插管给药/吸入给药/口腔给药/植入给药/静脉滴注/其他途径
	 */
	@ApiField("default_route")
	private String defaultRoute;

	/**
	 * 药品剂型
	 */
	@ApiField("dosage_form")
	private String dosageForm;

	/**
	 * 化学药
	 */
	@ApiField("drug_category")
	private String drugCategory;

	/**
	 * 药品分类
	 */
	@ApiField("drug_classification")
	private String drugClassification;

	/**
	 * 药品通用名
	 */
	@ApiField("drug_generic_name")
	private String drugGenericName;

	/**
	 * 原始药品ID
	 */
	@ApiField("drug_id")
	private String drugId;

	/**
	 * 原始药品名称
	 */
	@ApiField("drug_name")
	private String drugName;

	/**
	 * 药品拼音码
	 */
	@ApiField("drug_pinyin_code")
	private String drugPinyinCode;

	/**
	 * ENABLED/DISABLED
	 */
	@ApiField("drug_status")
	private String drugStatus;

	/**
	 * 药品商品名
	 */
	@ApiField("drug_trade_name")
	private String drugTradeName;

	/**
	 * 原始医院ID
	 */
	@ApiField("hospital_id")
	private String hospitalId;

	/**
	 * 是否院内自制剂
	 */
	@ApiField("is_hospital_preparation")
	private String isHospitalPreparation;

	/**
	 * 是否原研药
	 */
	@ApiField("is_original_drug")
	private String isOriginalDrug;

	/**
	 * 服务商编码
	 */
	@ApiField("isv_code")
	private String isvCode;

	/**
	 * 生产厂家
	 */
	@ApiField("manufacturer")
	private String manufacturer;

	/**
	 * 医保编码
	 */
	@ApiField("medical_insurance_code")
	private String medicalInsuranceCode;

	/**
	 * 最小剂量单位，单位：mg
	 */
	@ApiField("min_dose_unit")
	private String minDoseUnit;

	/**
	 * 最小包装单位，单位：包
	 */
	@ApiField("min_package_unit")
	private String minPackageUnit;

	/**
	 * 产地
	 */
	@ApiField("origin")
	private String origin;

	/**
	 * 药库单位
	 */
	@ApiField("pharmacy_unit")
	private String pharmacyUnit;

	/**
	 * 来源平台编码
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 处方药/甲类OTC/乙类OTC
	 */
	@ApiField("regulatory_level")
	private String regulatoryLevel;

	/**
	 * 包装规格，单位：包/千克
	 */
	@ApiField("specification")
	private String specification;

	/**
	 * 与批准文号至少一个非空
	 */
	@ApiField("upc_code")
	private String upcCode;

	public String getApprovalNumber() {
		return this.approvalNumber;
	}
	public void setApprovalNumber(String approvalNumber) {
		this.approvalNumber = approvalNumber;
	}

	public String getChineseStandardCode() {
		return this.chineseStandardCode;
	}
	public void setChineseStandardCode(String chineseStandardCode) {
		this.chineseStandardCode = chineseStandardCode;
	}

	public String getDataVersion() {
		return this.dataVersion;
	}
	public void setDataVersion(String dataVersion) {
		this.dataVersion = dataVersion;
	}

	public String getDefaultFrequency() {
		return this.defaultFrequency;
	}
	public void setDefaultFrequency(String defaultFrequency) {
		this.defaultFrequency = defaultFrequency;
	}

	public String getDefaultRoute() {
		return this.defaultRoute;
	}
	public void setDefaultRoute(String defaultRoute) {
		this.defaultRoute = defaultRoute;
	}

	public String getDosageForm() {
		return this.dosageForm;
	}
	public void setDosageForm(String dosageForm) {
		this.dosageForm = dosageForm;
	}

	public String getDrugCategory() {
		return this.drugCategory;
	}
	public void setDrugCategory(String drugCategory) {
		this.drugCategory = drugCategory;
	}

	public String getDrugClassification() {
		return this.drugClassification;
	}
	public void setDrugClassification(String drugClassification) {
		this.drugClassification = drugClassification;
	}

	public String getDrugGenericName() {
		return this.drugGenericName;
	}
	public void setDrugGenericName(String drugGenericName) {
		this.drugGenericName = drugGenericName;
	}

	public String getDrugId() {
		return this.drugId;
	}
	public void setDrugId(String drugId) {
		this.drugId = drugId;
	}

	public String getDrugName() {
		return this.drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public String getDrugPinyinCode() {
		return this.drugPinyinCode;
	}
	public void setDrugPinyinCode(String drugPinyinCode) {
		this.drugPinyinCode = drugPinyinCode;
	}

	public String getDrugStatus() {
		return this.drugStatus;
	}
	public void setDrugStatus(String drugStatus) {
		this.drugStatus = drugStatus;
	}

	public String getDrugTradeName() {
		return this.drugTradeName;
	}
	public void setDrugTradeName(String drugTradeName) {
		this.drugTradeName = drugTradeName;
	}

	public String getHospitalId() {
		return this.hospitalId;
	}
	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getIsHospitalPreparation() {
		return this.isHospitalPreparation;
	}
	public void setIsHospitalPreparation(String isHospitalPreparation) {
		this.isHospitalPreparation = isHospitalPreparation;
	}

	public String getIsOriginalDrug() {
		return this.isOriginalDrug;
	}
	public void setIsOriginalDrug(String isOriginalDrug) {
		this.isOriginalDrug = isOriginalDrug;
	}

	public String getIsvCode() {
		return this.isvCode;
	}
	public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
	}

	public String getManufacturer() {
		return this.manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getMedicalInsuranceCode() {
		return this.medicalInsuranceCode;
	}
	public void setMedicalInsuranceCode(String medicalInsuranceCode) {
		this.medicalInsuranceCode = medicalInsuranceCode;
	}

	public String getMinDoseUnit() {
		return this.minDoseUnit;
	}
	public void setMinDoseUnit(String minDoseUnit) {
		this.minDoseUnit = minDoseUnit;
	}

	public String getMinPackageUnit() {
		return this.minPackageUnit;
	}
	public void setMinPackageUnit(String minPackageUnit) {
		this.minPackageUnit = minPackageUnit;
	}

	public String getOrigin() {
		return this.origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getPharmacyUnit() {
		return this.pharmacyUnit;
	}
	public void setPharmacyUnit(String pharmacyUnit) {
		this.pharmacyUnit = pharmacyUnit;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getRegulatoryLevel() {
		return this.regulatoryLevel;
	}
	public void setRegulatoryLevel(String regulatoryLevel) {
		this.regulatoryLevel = regulatoryLevel;
	}

	public String getSpecification() {
		return this.specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public String getUpcCode() {
		return this.upcCode;
	}
	public void setUpcCode(String upcCode) {
		this.upcCode = upcCode;
	}

}
