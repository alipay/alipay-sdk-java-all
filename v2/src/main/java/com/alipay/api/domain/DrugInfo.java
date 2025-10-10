package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 药品信息
 *
 * @author auto create
 * @since 1.0, 2025-09-25 10:22:22
 */
public class DrugInfo extends AlipayObject {

	private static final long serialVersionUID = 7446459262254144627L;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 诊断结果
	 */
	@ApiField("diagnosis")
	private String diagnosis;

	/**
	 * 购买数量
	 */
	@ApiField("drug_cnt")
	private String drugCnt;

	/**
	 * 发药剂型
	 */
	@ApiField("drug_dosform")
	private String drugDosform;

	/**
	 * 药品图片链接
	 */
	@ApiField("drug_pic_url")
	private String drugPicUrl;

	/**
	 * 药品类型
1-处方药,2-OTC (西药必传）
	 */
	@ApiField("drug_type")
	private String drugType;

	/**
	 * 购买单位描述
	 */
	@ApiField("drug_unit_desc")
	private String drugUnitDesc;

	/**
	 * 外部药品编码
	 */
	@ApiField("ext_drug_code")
	private String extDrugCode;

	/**
	 * 外部药品名称
	 */
	@ApiField("ext_drug_name")
	private String extDrugName;

	/**
	 * 通用名
	 */
	@ApiField("generic_name")
	private String genericName;

	/**
	 * 购药风险确认
	 */
	@ApiField("risk_confirm")
	private Boolean riskConfirm;

	/**
	 * 风险等级
	 */
	@ApiField("risk_level")
	private String riskLevel;

	/**
	 * 规格 
例：75mg*30粒
	 */
	@ApiField("spec")
	private String spec;

	/**
	 * 用法用量描述
	 */
	@ApiField("usage_dosage_desc")
	private String usageDosageDesc;

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getDiagnosis() {
		return this.diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getDrugCnt() {
		return this.drugCnt;
	}
	public void setDrugCnt(String drugCnt) {
		this.drugCnt = drugCnt;
	}

	public String getDrugDosform() {
		return this.drugDosform;
	}
	public void setDrugDosform(String drugDosform) {
		this.drugDosform = drugDosform;
	}

	public String getDrugPicUrl() {
		return this.drugPicUrl;
	}
	public void setDrugPicUrl(String drugPicUrl) {
		this.drugPicUrl = drugPicUrl;
	}

	public String getDrugType() {
		return this.drugType;
	}
	public void setDrugType(String drugType) {
		this.drugType = drugType;
	}

	public String getDrugUnitDesc() {
		return this.drugUnitDesc;
	}
	public void setDrugUnitDesc(String drugUnitDesc) {
		this.drugUnitDesc = drugUnitDesc;
	}

	public String getExtDrugCode() {
		return this.extDrugCode;
	}
	public void setExtDrugCode(String extDrugCode) {
		this.extDrugCode = extDrugCode;
	}

	public String getExtDrugName() {
		return this.extDrugName;
	}
	public void setExtDrugName(String extDrugName) {
		this.extDrugName = extDrugName;
	}

	public String getGenericName() {
		return this.genericName;
	}
	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}

	public Boolean getRiskConfirm() {
		return this.riskConfirm;
	}
	public void setRiskConfirm(Boolean riskConfirm) {
		this.riskConfirm = riskConfirm;
	}

	public String getRiskLevel() {
		return this.riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}

	public String getSpec() {
		return this.spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}

	public String getUsageDosageDesc() {
		return this.usageDosageDesc;
	}
	public void setUsageDosageDesc(String usageDosageDesc) {
		this.usageDosageDesc = usageDosageDesc;
	}

}
