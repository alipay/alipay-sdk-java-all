package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 处方药品信息
 *
 * @author auto create
 * @since 1.0, 2025-11-03 15:32:13
 */
public class HDFDrugInfo extends AlipayObject {

	private static final long serialVersionUID = 2182136835329945728L;

	/**
	 * 批准文号
	 */
	@ApiField("approve_number")
	private String approveNumber;

	/**
	 * 用药时长
	 */
	@ApiField("drug_duration")
	private Long drugDuration;

	/**
	 * 用药时长单位
	 */
	@ApiField("drug_duration_unit")
	private String drugDurationUnit;

	/**
	 * 用药频率
	 */
	@ApiField("drug_frequency")
	private String drugFrequency;

	/**
	 * 药品名称
	 */
	@ApiField("drug_name")
	private String drugName;

	/**
	 * 开药量
	 */
	@ApiField("drug_quantity")
	private Long drugQuantity;

	/**
	 * 开药量单位
	 */
	@ApiField("drug_quantity_unit")
	private String drugQuantityUnit;

	/**
	 * 用药途径
	 */
	@ApiField("drug_route")
	private String drugRoute;

	/**
	 * 药品规格
	 */
	@ApiField("drug_specification")
	private String drugSpecification;

	/**
	 * 用药禁忌
	 */
	@ApiField("drug_taboo")
	private String drugTaboo;

	/**
	 * 厂商
	 */
	@ApiField("factory")
	private String factory;

	/**
	 * 单次用量
	 */
	@ApiField("once_dosage")
	private String onceDosage;

	/**
	 * 单次用量单位
	 */
	@ApiField("once_dosage_unit")
	private String onceDosageUnit;

	/**
	 * 合作方唯一药品标识	PARTNER_DRUG_888
	 */
	@ApiField("partner_drug_id")
	private String partnerDrugId;

	/**
	 * 药品商品名
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 是否为处方药 true  是/ false 否
	 */
	@ApiField("rx")
	private Boolean rx;

	/**
	 * 煎法/服用方法
	 */
	@ApiField("take_mode")
	private String takeMode;

	/**
	 * 用药时间
	 */
	@ApiField("user_time")
	private String userTime;

	public String getApproveNumber() {
		return this.approveNumber;
	}
	public void setApproveNumber(String approveNumber) {
		this.approveNumber = approveNumber;
	}

	public Long getDrugDuration() {
		return this.drugDuration;
	}
	public void setDrugDuration(Long drugDuration) {
		this.drugDuration = drugDuration;
	}

	public String getDrugDurationUnit() {
		return this.drugDurationUnit;
	}
	public void setDrugDurationUnit(String drugDurationUnit) {
		this.drugDurationUnit = drugDurationUnit;
	}

	public String getDrugFrequency() {
		return this.drugFrequency;
	}
	public void setDrugFrequency(String drugFrequency) {
		this.drugFrequency = drugFrequency;
	}

	public String getDrugName() {
		return this.drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public Long getDrugQuantity() {
		return this.drugQuantity;
	}
	public void setDrugQuantity(Long drugQuantity) {
		this.drugQuantity = drugQuantity;
	}

	public String getDrugQuantityUnit() {
		return this.drugQuantityUnit;
	}
	public void setDrugQuantityUnit(String drugQuantityUnit) {
		this.drugQuantityUnit = drugQuantityUnit;
	}

	public String getDrugRoute() {
		return this.drugRoute;
	}
	public void setDrugRoute(String drugRoute) {
		this.drugRoute = drugRoute;
	}

	public String getDrugSpecification() {
		return this.drugSpecification;
	}
	public void setDrugSpecification(String drugSpecification) {
		this.drugSpecification = drugSpecification;
	}

	public String getDrugTaboo() {
		return this.drugTaboo;
	}
	public void setDrugTaboo(String drugTaboo) {
		this.drugTaboo = drugTaboo;
	}

	public String getFactory() {
		return this.factory;
	}
	public void setFactory(String factory) {
		this.factory = factory;
	}

	public String getOnceDosage() {
		return this.onceDosage;
	}
	public void setOnceDosage(String onceDosage) {
		this.onceDosage = onceDosage;
	}

	public String getOnceDosageUnit() {
		return this.onceDosageUnit;
	}
	public void setOnceDosageUnit(String onceDosageUnit) {
		this.onceDosageUnit = onceDosageUnit;
	}

	public String getPartnerDrugId() {
		return this.partnerDrugId;
	}
	public void setPartnerDrugId(String partnerDrugId) {
		this.partnerDrugId = partnerDrugId;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Boolean getRx() {
		return this.rx;
	}
	public void setRx(Boolean rx) {
		this.rx = rx;
	}

	public String getTakeMode() {
		return this.takeMode;
	}
	public void setTakeMode(String takeMode) {
		this.takeMode = takeMode;
	}

	public String getUserTime() {
		return this.userTime;
	}
	public void setUserTime(String userTime) {
		this.userTime = userTime;
	}

}
