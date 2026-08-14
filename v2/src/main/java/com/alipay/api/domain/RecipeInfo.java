package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 处方内容
 *
 * @author auto create
 * @since 1.0, 2026-07-30 11:12:56
 */
public class RecipeInfo extends AlipayObject {

	private static final long serialVersionUID = 1522883667694784959L;

	/**
	 * 诊断
	 */
	@ApiField("diagnosis")
	private String diagnosis;

	/**
	 * 医生提醒
	 */
	@ApiField("doc_notice")
	private String docNotice;

	/**
	 * null
	 */
	@ApiListField("druglist")
	@ApiField("drug_item")
	private List<DrugItem> druglist;

	/**
	 * 患者年龄，如XX岁XX月；
	 */
	@ApiField("patientage")
	private String patientage;

	/**
	 * 患者性别
	 */
	@ApiField("patientsex")
	private String patientsex;

	/**
	 * 患者体重，单位kg
	 */
	@ApiField("patientweight")
	private String patientweight;

	/**
	 * 业务方传入审核的处方id
	 */
	@ApiField("prescription_id")
	private String prescriptionId;

	/**
	 * 处方状态
	 */
	@ApiField("recipe_status")
	private String recipeStatus;

	/**
	 * 处方开具时间
	 */
	@ApiField("recipe_time")
	private String recipeTime;

	/**
	 * 处方类型
	 */
	@ApiField("recipedrugtype")
	private String recipedrugtype;

	/**
	 * 拒绝修改原因
	 */
	@ApiField("refusemodifyreason")
	private String refusemodifyreason;

	public String getDiagnosis() {
		return this.diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getDocNotice() {
		return this.docNotice;
	}
	public void setDocNotice(String docNotice) {
		this.docNotice = docNotice;
	}

	public List<DrugItem> getDruglist() {
		return this.druglist;
	}
	public void setDruglist(List<DrugItem> druglist) {
		this.druglist = druglist;
	}

	public String getPatientage() {
		return this.patientage;
	}
	public void setPatientage(String patientage) {
		this.patientage = patientage;
	}

	public String getPatientsex() {
		return this.patientsex;
	}
	public void setPatientsex(String patientsex) {
		this.patientsex = patientsex;
	}

	public String getPatientweight() {
		return this.patientweight;
	}
	public void setPatientweight(String patientweight) {
		this.patientweight = patientweight;
	}

	public String getPrescriptionId() {
		return this.prescriptionId;
	}
	public void setPrescriptionId(String prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

	public String getRecipeStatus() {
		return this.recipeStatus;
	}
	public void setRecipeStatus(String recipeStatus) {
		this.recipeStatus = recipeStatus;
	}

	public String getRecipeTime() {
		return this.recipeTime;
	}
	public void setRecipeTime(String recipeTime) {
		this.recipeTime = recipeTime;
	}

	public String getRecipedrugtype() {
		return this.recipedrugtype;
	}
	public void setRecipedrugtype(String recipedrugtype) {
		this.recipedrugtype = recipedrugtype;
	}

	public String getRefusemodifyreason() {
		return this.refusemodifyreason;
	}
	public void setRefusemodifyreason(String refusemodifyreason) {
		this.refusemodifyreason = refusemodifyreason;
	}

}
