package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 疾病基础数据
 *
 * @author auto create
 * @since 1.0, 2022-06-20 14:30:37
 */
public class DiseaseBaseData extends AlipayObject {

	private static final long serialVersionUID = 3242986489599212344L;

	/**
	 * 临床症状
	 */
	@ApiField("clinical_symptoms")
	private String clinicalSymptoms;

	/**
	 * 是否常见病
	 */
	@ApiField("common_disease")
	private String commonDisease;

	/**
	 * 并发症
	 */
	@ApiField("complication")
	private String complication;

	/**
	 * 就诊科室
	 */
	@ApiField("department_info")
	private String departmentInfo;

	/**
	 * 别名
	 */
	@ApiField("disease_alias")
	private String diseaseAlias;

	/**
	 * 疾病周期
	 */
	@ApiField("disease_cycle")
	private String diseaseCycle;

	/**
	 * 疾病描述
	 */
	@ApiField("disease_introduction")
	private String diseaseIntroduction;

	/**
	 * 疾病中文名称
	 */
	@ApiField("disease_name_cn")
	private String diseaseNameCn;

	/**
	 * 疾病英文名称
	 */
	@ApiField("disease_name_en")
	private String diseaseNameEn;

	/**
	 * 发病部位
	 */
	@ApiField("disease_position")
	private String diseasePosition;

	/**
	 * 症状
	 */
	@ApiField("disease_symptom")
	private String diseaseSymptom;

	/**
	 * 遗传性
	 */
	@ApiField("genetic")
	private String genetic;

	/**
	 * 传染性
	 */
	@ApiField("infectivity")
	private String infectivity;

	/**
	 * 多发人群
	 */
	@ApiField("multiple_population")
	private String multiplePopulation;

	public String getClinicalSymptoms() {
		return this.clinicalSymptoms;
	}
	public void setClinicalSymptoms(String clinicalSymptoms) {
		this.clinicalSymptoms = clinicalSymptoms;
	}

	public String getCommonDisease() {
		return this.commonDisease;
	}
	public void setCommonDisease(String commonDisease) {
		this.commonDisease = commonDisease;
	}

	public String getComplication() {
		return this.complication;
	}
	public void setComplication(String complication) {
		this.complication = complication;
	}

	public String getDepartmentInfo() {
		return this.departmentInfo;
	}
	public void setDepartmentInfo(String departmentInfo) {
		this.departmentInfo = departmentInfo;
	}

	public String getDiseaseAlias() {
		return this.diseaseAlias;
	}
	public void setDiseaseAlias(String diseaseAlias) {
		this.diseaseAlias = diseaseAlias;
	}

	public String getDiseaseCycle() {
		return this.diseaseCycle;
	}
	public void setDiseaseCycle(String diseaseCycle) {
		this.diseaseCycle = diseaseCycle;
	}

	public String getDiseaseIntroduction() {
		return this.diseaseIntroduction;
	}
	public void setDiseaseIntroduction(String diseaseIntroduction) {
		this.diseaseIntroduction = diseaseIntroduction;
	}

	public String getDiseaseNameCn() {
		return this.diseaseNameCn;
	}
	public void setDiseaseNameCn(String diseaseNameCn) {
		this.diseaseNameCn = diseaseNameCn;
	}

	public String getDiseaseNameEn() {
		return this.diseaseNameEn;
	}
	public void setDiseaseNameEn(String diseaseNameEn) {
		this.diseaseNameEn = diseaseNameEn;
	}

	public String getDiseasePosition() {
		return this.diseasePosition;
	}
	public void setDiseasePosition(String diseasePosition) {
		this.diseasePosition = diseasePosition;
	}

	public String getDiseaseSymptom() {
		return this.diseaseSymptom;
	}
	public void setDiseaseSymptom(String diseaseSymptom) {
		this.diseaseSymptom = diseaseSymptom;
	}

	public String getGenetic() {
		return this.genetic;
	}
	public void setGenetic(String genetic) {
		this.genetic = genetic;
	}

	public String getInfectivity() {
		return this.infectivity;
	}
	public void setInfectivity(String infectivity) {
		this.infectivity = infectivity;
	}

	public String getMultiplePopulation() {
		return this.multiplePopulation;
	}
	public void setMultiplePopulation(String multiplePopulation) {
		this.multiplePopulation = multiplePopulation;
	}

}
