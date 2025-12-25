package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-11-19 15:22:37
 */
public class MedicationGuidanceItem extends AlipayObject {

	private static final long serialVersionUID = 8792669193939561412L;

	/**
	 * 注意事项
	 */
	@ApiField("cautions_desc")
	private String cautionsDesc;

	/**
	 * 药品名称
	 */
	@ApiField("drug_name")
	private String drugName;

	/**
	 * 用药指导
	 */
	@ApiField("drug_specifications")
	private String drugSpecifications;

	public String getCautionsDesc() {
		return this.cautionsDesc;
	}
	public void setCautionsDesc(String cautionsDesc) {
		this.cautionsDesc = cautionsDesc;
	}

	public String getDrugName() {
		return this.drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public String getDrugSpecifications() {
		return this.drugSpecifications;
	}
	public void setDrugSpecifications(String drugSpecifications) {
		this.drugSpecifications = drugSpecifications;
	}

}
