package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 诊断疾病
 *
 * @author auto create
 * @since 1.0, 2023-08-02 15:13:34
 */
public class DiagnosisDisease extends AlipayObject {

	private static final long serialVersionUID = 2491232496993997767L;

	/**
	 * 药品列表
	 */
	@ApiListField("drug_item_infos")
	@ApiField("drug_item_info")
	private List<DrugItemInfo> drugItemInfos;

	/**
	 * 遵从icd10规范
	 */
	@ApiField("icd_code")
	private String icdCode;

	/**
	 * icd名称
	 */
	@ApiField("icd_name")
	private String icdName;

	/**
	 * 症状列表
	 */
	@ApiListField("symptoms")
	@ApiField("health_symptom")
	private List<HealthSymptom> symptoms;

	public List<DrugItemInfo> getDrugItemInfos() {
		return this.drugItemInfos;
	}
	public void setDrugItemInfos(List<DrugItemInfo> drugItemInfos) {
		this.drugItemInfos = drugItemInfos;
	}

	public String getIcdCode() {
		return this.icdCode;
	}
	public void setIcdCode(String icdCode) {
		this.icdCode = icdCode;
	}

	public String getIcdName() {
		return this.icdName;
	}
	public void setIcdName(String icdName) {
		this.icdName = icdName;
	}

	public List<HealthSymptom> getSymptoms() {
		return this.symptoms;
	}
	public void setSymptoms(List<HealthSymptom> symptoms) {
		this.symptoms = symptoms;
	}

}
