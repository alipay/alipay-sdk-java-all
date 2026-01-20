package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 药品信息
 *
 * @author auto create
 * @since 1.0, 2025-12-11 11:04:41
 */
public class DrugInfoVO extends AlipayObject {

	private static final long serialVersionUID = 5775995387567275617L;

	/**
	 * 数量单位盒、瓶、支,如2
	 */
	@ApiField("drug_cnt")
	private Long drugCnt;

	/**
	 * 75mg*30粒
	 */
	@ApiField("drug_spec")
	private String drugSpec;

	/**
	 * 购买单位,取值有盒、瓶、支等
	 */
	@ApiField("drug_unit")
	private String drugUnit;

	/**
	 * 药品通用名
	 */
	@ApiField("generic_name")
	private String genericName;

	/**
	 * 一日三餐,50克每餐
	 */
	@ApiField("usage_dosage")
	private String usageDosage;

	public Long getDrugCnt() {
		return this.drugCnt;
	}
	public void setDrugCnt(Long drugCnt) {
		this.drugCnt = drugCnt;
	}

	public String getDrugSpec() {
		return this.drugSpec;
	}
	public void setDrugSpec(String drugSpec) {
		this.drugSpec = drugSpec;
	}

	public String getDrugUnit() {
		return this.drugUnit;
	}
	public void setDrugUnit(String drugUnit) {
		this.drugUnit = drugUnit;
	}

	public String getGenericName() {
		return this.genericName;
	}
	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}

	public String getUsageDosage() {
		return this.usageDosage;
	}
	public void setUsageDosage(String usageDosage) {
		this.usageDosage = usageDosage;
	}

}
