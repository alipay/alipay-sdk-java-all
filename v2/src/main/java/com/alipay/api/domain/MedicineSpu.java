package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医药标准商品信息
 *
 * @author auto create
 * @since 1.0, 2024-05-09 14:35:20
 */
public class MedicineSpu extends AlipayObject {

	private static final long serialVersionUID = 6557558492461221522L;

	/**
	 * 药品类型特有字段，给药途径
	 */
	@ApiField("administration_method")
	private String administrationMethod;

	/**
	 * 药品类型特有字段，不良反应
	 */
	@ApiField("adverse_reactions")
	private String adverseReactions;

	/**
	 * 药品类型特有字段，适用年龄
	 */
	@ApiField("applicable_age")
	private String applicableAge;

	/**
	 * 医疗器械类型特有字段，适用范围
	 */
	@ApiField("application_scope")
	private String applicationScope;

	/**
	 * 医疗器械传主品的注册证编号或者备案凭证编号，其余传批准文号
	 */
	@ApiField("approval_number")
	private String approvalNumber;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * CHINESES_PATENT-中成药
CHEMICALS-化学药
BIOLOGICS-生物制剂
OTHERS-其他
	 */
	@ApiField("classification")
	private String classification;

	/**
	 * 通用名称，医疗器械传医疗器械审批名称，其余传对应的通用名称
	 */
	@ApiField("common_name")
	private String commonName;

	/**
	 * 药品、医药保健品类型特有字段，服用使用禁忌
	 */
	@ApiField("contraindications")
	private String contraindications;

	/**
	 * 医疗器械特有，器械产品名称
	 */
	@ApiField("device_common_name")
	private String deviceCommonName;

	/**
	 * 医疗器械类型特有字段，且必填，按国家药监审批的型号填写（多品拼合）
	 */
	@ApiField("device_spec")
	private String deviceSpec;

	/**
	 * 药品、保健品和特医食品特有，保健品和特医食品必填，枚举类型，从以下选择：
TABLETS-片剂
CAPSULE-胶囊剂
SOLUTION-溶液剂
SUSPENSION-混悬剂
EMULSION-乳剂
GEL-胶浆剂
LOTION-乳液
COMPOUND_PREPARATION-合剂
TINCTURE-酊剂
DROP-滴剂
SUSPENSION_DROP-混悬滴剂
SYRUP-糖浆剂
PILL-丸剂
DRIPPING_PILL-滴丸
GRANULE-颗粒剂
POWDER-散剂
DUST-粉剂
DUSTING_POWDER-撒粉
TOPICAL_POWDER-撒布剂
OINTMENT-膏剂
CREAM-霜剂
PASTE-糊剂
PATCH-贴剂
FILM-膜剂
TRANSDERMAL_PATCH-透皮贴剂
TOPICAL_SOLUTION-外用溶液剂
WASH-洗剂
MOUTHWASH-漱口剂
MOUTHWASH-含漱液
ORAL_SUSPENSION-胶浆剂
LINIMENT-搽剂
TINCTURE-酊剂
OIL-油剂
LATEX-乳胶剂
GEL-凝胶剂
PAINT-涂剂
FILM_FORMING_AGENT-涂膜剂
TOPICAL_APPLICATION-涂布剂
SUPPOSITORY-栓剂
OPHTHALMIC_DROPS-滴眼剂
OTIC_DROPS-滴耳剂
NASAL_DROPS-滴鼻剂
AEROSOL-气雾剂
POWDER_INHALER-粉雾剂
INHALER-吸入剂
NEBULIZER_SOLUTION-雾化溶液剂
NEBULIZER_SOLUTION-雾化液
INJECTION-注射剂
POWDER_FOR_INJECTION-粉针剂
INJECTABLE-针剂
OTHERS-其他
	 */
	@ApiField("dosage_from")
	private String dosageFrom;

	/**
	 * 保健品类型特有，多选枚举，枚举从以下值选传：
有助于增强免疫力ENHANCING_IMMUNITY
辅助保护化学性肝损伤PROTECTING_FROM_CHEMICAL_LIVER_DAMAGE
有助于抗氧化FIGHTING_OXIDATION
有助于改善痤疮LIGHTENING_ACNE
有助于改善黄褐班LIGHTENING_MELASMA
有助于改善皮肤水份INCREASING_SKIN_MOISTURE
改善皮肤油分REDUCING_SKIN_OILINESS
辅助改善记忆AIDING_MEMORY_IMPROVEMENT
有助于改善睡眠ENHANCING_SLEEP
缓解体力疲劳RELIEVING_PHYSICAL_FATIGUE
清咽润喉SOOTHING_THE_THROAT
有助于控制体内脂肪CONTROLLING_BODY_FAT
有助于改善骨密度IMPROVING_BONE_DENSITY
改善缺铁性贫血TREATING_IRON_DEFICIENCY_ANEMIA
有助于调节肠道菌群REGULATING_GUT_MICROBIOTA
有助于消化AIDING_DIGESTION
有助于润肠通便PROMOTING_BOWEL_MOVEMENT
辅助保护胃粘膜PROTECTING_STOMACH_LINING
有助于维持血脂MAINTAINING_BLOOD_LIPIDS
有助于维持血糖MAINTAINING_BLOOD_SUGAR
有助于维持血压MAINTAINING_BLOOD_PRESSURE
有助于改善骨密度IMPROVING_BONE_DENSITY
有助于排铅HELPING_WITH_LEAD_DETOXIFICATION
缓解视觉疲劳EASING_EYE_TIREDNESS
改善生长发育IMPROVING_GROWTH_DEVELOPMENT
促进泌乳STIMULATING_LACTATION
耐缺氧WITHSTANDING_LOW_OXYGEN
电离辐射辅助保护SUPPORTING_RADIATION_PROTECTION
	 */
	@ApiListField("efficacies")
	@ApiField("string")
	private List<String> efficacies;

	/**
	 * 器械、保健品和特医食品类型特有字段，上市许可持有人
	 */
	@ApiField("mah")
	private String mah;

	/**
	 * 医疗器械类型特有字段，主品医疗器械准入资质
	 */
	@ApiField("main_access_qualification")
	private MedicineAccessQualification mainAccessQualification;

	/**
	 * MEDICINE - 药品
FUNCTIONAL_FOOD - 保健食品
MEDICAL_FOOD - 特殊医学用途食品
MEDICAL_DEVICE - 医疗器械
	 */
	@ApiField("main_category")
	private String mainCategory;

	/**
	 * 通过图片文件上传接口alipay.open.file.upload上传图片后获取文件Id
	 */
	@ApiField("main_image")
	private String mainImage;

	/**
	 * 药品、特医保健品类型特有字段，主要成份
	 */
	@ApiField("main_ingredients")
	private String mainIngredients;

	/**
	 * 医疗器械类型特有字段，且必填，枚举类型
	 */
	@ApiField("management_category")
	private String managementCategory;

	/**
	 * 药品、特医保健类型特有字段，生产厂家或企业
	 */
	@ApiField("manufacturer_name")
	private String manufacturerName;

	/**
	 * 器械、保健品和特医食品类型特有字段，且必传，计量单位
	 */
	@ApiField("measurement_unit")
	private String measurementUnit;

	/**
	 * 进/出口标签
	 */
	@ApiField("origin_label")
	private String originLabel;

	/**
	 * 商品产地
	 */
	@ApiField("origin_place")
	private String originPlace;

	/**
	 * 医疗器械类型特有字段，副品医疗器械准入资质
	 */
	@ApiListField("other_access_qualifications")
	@ApiField("medicine_access_qualification")
	private List<MedicineAccessQualification> otherAccessQualifications;

	/**
	 * 通过图片文件上传接口alipay.open.file.upload上传图片后获取文件Id
	 */
	@ApiListField("other_images")
	@ApiField("string")
	private List<String> otherImages;

	/**
	 * 药品、特医保健品类型特有字段，性状
	 */
	@ApiField("physical_properties")
	private String physicalProperties;

	/**
	 * 药品、特医保健品类型特有字段，注意事项
	 */
	@ApiField("precautions")
	private String precautions;

	/**
	 * 医疗器械类型特有字段，产品类别，管理类别的补充说明
	 */
	@ApiField("product_category")
	private String productCategory;

	/**
	 * 标品69码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 生产许可证号
	 */
	@ApiField("production_license_number")
	private String productionLicenseNumber;

	/**
	 * 药品类型特有字段，监管分级
	 */
	@ApiField("regulatory_classification")
	private String regulatoryClassification;

	/**
	 * 保质期
	 */
	@ApiField("shelf_life")
	private String shelfLife;

	/**
	 * 包装规格
	 */
	@ApiField("specification")
	private String specification;

	/**
	 * 贮藏条件
	 */
	@ApiField("storage_conditions")
	private String storageConditions;

	/**
	 * 医疗器械类型特有字段，结构及组成
	 */
	@ApiField("structure_composition")
	private String structureComposition;

	/**
	 * 子品牌名
	 */
	@ApiField("sub_brand_name")
	private String subBrandName;

	/**
	 * 药品、特医保健品类型特有字段，适宜人群
	 */
	@ApiField("suitable_population")
	private String suitablePopulation;

	/**
	 * 药品类型特有字段，功能主治
	 */
	@ApiField("therapeutic_efficacy")
	private String therapeuticEfficacy;

	/**
	 * 药品类型专有字段，商标名称
	 */
	@ApiField("trademark_name")
	private String trademarkName;

	/**
	 * 药品、特医保健品类型特有字段，不适宜人群
	 */
	@ApiField("unsuitable_population")
	private String unsuitablePopulation;

	/**
	 * 外部标品唯一id
	 */
	@ApiField("upc")
	private String upc;

	/**
	 * 特医保健品类型特有字段，食用方法及食用量
	 */
	@ApiField("usage_method_amount")
	private String usageMethodAmount;

	public String getAdministrationMethod() {
		return this.administrationMethod;
	}
	public void setAdministrationMethod(String administrationMethod) {
		this.administrationMethod = administrationMethod;
	}

	public String getAdverseReactions() {
		return this.adverseReactions;
	}
	public void setAdverseReactions(String adverseReactions) {
		this.adverseReactions = adverseReactions;
	}

	public String getApplicableAge() {
		return this.applicableAge;
	}
	public void setApplicableAge(String applicableAge) {
		this.applicableAge = applicableAge;
	}

	public String getApplicationScope() {
		return this.applicationScope;
	}
	public void setApplicationScope(String applicationScope) {
		this.applicationScope = applicationScope;
	}

	public String getApprovalNumber() {
		return this.approvalNumber;
	}
	public void setApprovalNumber(String approvalNumber) {
		this.approvalNumber = approvalNumber;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getClassification() {
		return this.classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}

	public String getCommonName() {
		return this.commonName;
	}
	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}

	public String getContraindications() {
		return this.contraindications;
	}
	public void setContraindications(String contraindications) {
		this.contraindications = contraindications;
	}

	public String getDeviceCommonName() {
		return this.deviceCommonName;
	}
	public void setDeviceCommonName(String deviceCommonName) {
		this.deviceCommonName = deviceCommonName;
	}

	public String getDeviceSpec() {
		return this.deviceSpec;
	}
	public void setDeviceSpec(String deviceSpec) {
		this.deviceSpec = deviceSpec;
	}

	public String getDosageFrom() {
		return this.dosageFrom;
	}
	public void setDosageFrom(String dosageFrom) {
		this.dosageFrom = dosageFrom;
	}

	public List<String> getEfficacies() {
		return this.efficacies;
	}
	public void setEfficacies(List<String> efficacies) {
		this.efficacies = efficacies;
	}

	public String getMah() {
		return this.mah;
	}
	public void setMah(String mah) {
		this.mah = mah;
	}

	public MedicineAccessQualification getMainAccessQualification() {
		return this.mainAccessQualification;
	}
	public void setMainAccessQualification(MedicineAccessQualification mainAccessQualification) {
		this.mainAccessQualification = mainAccessQualification;
	}

	public String getMainCategory() {
		return this.mainCategory;
	}
	public void setMainCategory(String mainCategory) {
		this.mainCategory = mainCategory;
	}

	public String getMainImage() {
		return this.mainImage;
	}
	public void setMainImage(String mainImage) {
		this.mainImage = mainImage;
	}

	public String getMainIngredients() {
		return this.mainIngredients;
	}
	public void setMainIngredients(String mainIngredients) {
		this.mainIngredients = mainIngredients;
	}

	public String getManagementCategory() {
		return this.managementCategory;
	}
	public void setManagementCategory(String managementCategory) {
		this.managementCategory = managementCategory;
	}

	public String getManufacturerName() {
		return this.manufacturerName;
	}
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public String getMeasurementUnit() {
		return this.measurementUnit;
	}
	public void setMeasurementUnit(String measurementUnit) {
		this.measurementUnit = measurementUnit;
	}

	public String getOriginLabel() {
		return this.originLabel;
	}
	public void setOriginLabel(String originLabel) {
		this.originLabel = originLabel;
	}

	public String getOriginPlace() {
		return this.originPlace;
	}
	public void setOriginPlace(String originPlace) {
		this.originPlace = originPlace;
	}

	public List<MedicineAccessQualification> getOtherAccessQualifications() {
		return this.otherAccessQualifications;
	}
	public void setOtherAccessQualifications(List<MedicineAccessQualification> otherAccessQualifications) {
		this.otherAccessQualifications = otherAccessQualifications;
	}

	public List<String> getOtherImages() {
		return this.otherImages;
	}
	public void setOtherImages(List<String> otherImages) {
		this.otherImages = otherImages;
	}

	public String getPhysicalProperties() {
		return this.physicalProperties;
	}
	public void setPhysicalProperties(String physicalProperties) {
		this.physicalProperties = physicalProperties;
	}

	public String getPrecautions() {
		return this.precautions;
	}
	public void setPrecautions(String precautions) {
		this.precautions = precautions;
	}

	public String getProductCategory() {
		return this.productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductionLicenseNumber() {
		return this.productionLicenseNumber;
	}
	public void setProductionLicenseNumber(String productionLicenseNumber) {
		this.productionLicenseNumber = productionLicenseNumber;
	}

	public String getRegulatoryClassification() {
		return this.regulatoryClassification;
	}
	public void setRegulatoryClassification(String regulatoryClassification) {
		this.regulatoryClassification = regulatoryClassification;
	}

	public String getShelfLife() {
		return this.shelfLife;
	}
	public void setShelfLife(String shelfLife) {
		this.shelfLife = shelfLife;
	}

	public String getSpecification() {
		return this.specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public String getStorageConditions() {
		return this.storageConditions;
	}
	public void setStorageConditions(String storageConditions) {
		this.storageConditions = storageConditions;
	}

	public String getStructureComposition() {
		return this.structureComposition;
	}
	public void setStructureComposition(String structureComposition) {
		this.structureComposition = structureComposition;
	}

	public String getSubBrandName() {
		return this.subBrandName;
	}
	public void setSubBrandName(String subBrandName) {
		this.subBrandName = subBrandName;
	}

	public String getSuitablePopulation() {
		return this.suitablePopulation;
	}
	public void setSuitablePopulation(String suitablePopulation) {
		this.suitablePopulation = suitablePopulation;
	}

	public String getTherapeuticEfficacy() {
		return this.therapeuticEfficacy;
	}
	public void setTherapeuticEfficacy(String therapeuticEfficacy) {
		this.therapeuticEfficacy = therapeuticEfficacy;
	}

	public String getTrademarkName() {
		return this.trademarkName;
	}
	public void setTrademarkName(String trademarkName) {
		this.trademarkName = trademarkName;
	}

	public String getUnsuitablePopulation() {
		return this.unsuitablePopulation;
	}
	public void setUnsuitablePopulation(String unsuitablePopulation) {
		this.unsuitablePopulation = unsuitablePopulation;
	}

	public String getUpc() {
		return this.upc;
	}
	public void setUpc(String upc) {
		this.upc = upc;
	}

	public String getUsageMethodAmount() {
		return this.usageMethodAmount;
	}
	public void setUsageMethodAmount(String usageMethodAmount) {
		this.usageMethodAmount = usageMethodAmount;
	}

}
