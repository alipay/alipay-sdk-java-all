package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 处方药品信息
 *
 * @author auto create
 * @since 1.0, 2026-09-28 16:08:46
 */
public class PlatformPrescriptionDrugInfo extends AlipayObject {

	private static final long serialVersionUID = 5243887662426336454L;

	/**
	 * 给药途径，如"口服" 非枚举
	 */
	@ApiField("administration_route")
	private String administrationRoute;

	/**
	 * 备注
	 */
	@ApiField("comments")
	private String comments;

	/**
	 * 剂型 非枚举
	 */
	@ApiField("dosage_form")
	private String dosageForm;

	/**
	 * 药品通用名
	 */
	@ApiField("drug_generic_name")
	private String drugGenericName;

	/**
	 * 药品id
	 */
	@ApiField("drug_id")
	private String drugId;

	/**
	 * 药品名称
	 */
	@ApiField("drug_name")
	private String drugName;

	/**
	 * 药品图片链接
	 */
	@ApiField("drug_url")
	private String drugUrl;

	/**
	 * 频次（单位允许不统一）
	 */
	@ApiField("frequency")
	private String frequency;

	/**
	 * 用药说明
	 */
	@ApiField("instructions")
	private String instructions;

	/**
	 * 药品数量（单位允许不统一）
	 */
	@ApiField("medicine_quantity")
	private String medicineQuantity;

	/**
	 * 单次剂量（如"2片"）
	 */
	@ApiField("single_dose")
	private String singleDose;

	/**
	 * 规格
	 */
	@ApiField("spec")
	private String spec;

	public String getAdministrationRoute() {
		return this.administrationRoute;
	}
	public void setAdministrationRoute(String administrationRoute) {
		this.administrationRoute = administrationRoute;
	}

	public String getComments() {
		return this.comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getDosageForm() {
		return this.dosageForm;
	}
	public void setDosageForm(String dosageForm) {
		this.dosageForm = dosageForm;
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

	public String getDrugUrl() {
		return this.drugUrl;
	}
	public void setDrugUrl(String drugUrl) {
		this.drugUrl = drugUrl;
	}

	public String getFrequency() {
		return this.frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getInstructions() {
		return this.instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public String getMedicineQuantity() {
		return this.medicineQuantity;
	}
	public void setMedicineQuantity(String medicineQuantity) {
		this.medicineQuantity = medicineQuantity;
	}

	public String getSingleDose() {
		return this.singleDose;
	}
	public void setSingleDose(String singleDose) {
		this.singleDose = singleDose;
	}

	public String getSpec() {
		return this.spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}

}
