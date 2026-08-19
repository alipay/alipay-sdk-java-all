package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-30 11:12:56
 */
public class DrugItem extends AlipayObject {

	private static final long serialVersionUID = 8417494411864227861L;

	/**
	 * 用药叮嘱
	 */
	@ApiField("drug_notice")
	private String drugNotice;

	/**
	 * 每次用药剂量，剂量+剂量单位 + "/次",如1片/次，3ml/次
	 */
	@ApiField("drugdosage")
	private String drugdosage;

	/**
	 * 用药时间
	 */
	@ApiField("drugduration")
	private String drugduration;

	/**
	 * 用药频次，如一天一次，一天三次等
	 */
	@ApiField("drugfrequency")
	private String drugfrequency;

	/**
	 * 药品名
	 */
	@ApiField("drugname")
	private String drugname;

	/**
	 * 开药数量+单位，如7盒、8包、6瓶等
	 */
	@ApiField("drugquantity")
	private String drugquantity;

	/**
	 * 药品规格包装，如1.5mg*10片/包,5mg*28片/盒,50mg*10s*2板等
	 */
	@ApiField("drugspecification")
	private String drugspecification;

	/**
	 * 用药，药品用法
	 */
	@ApiField("druguse")
	private String druguse;

	public String getDrugNotice() {
		return this.drugNotice;
	}
	public void setDrugNotice(String drugNotice) {
		this.drugNotice = drugNotice;
	}

	public String getDrugdosage() {
		return this.drugdosage;
	}
	public void setDrugdosage(String drugdosage) {
		this.drugdosage = drugdosage;
	}

	public String getDrugduration() {
		return this.drugduration;
	}
	public void setDrugduration(String drugduration) {
		this.drugduration = drugduration;
	}

	public String getDrugfrequency() {
		return this.drugfrequency;
	}
	public void setDrugfrequency(String drugfrequency) {
		this.drugfrequency = drugfrequency;
	}

	public String getDrugname() {
		return this.drugname;
	}
	public void setDrugname(String drugname) {
		this.drugname = drugname;
	}

	public String getDrugquantity() {
		return this.drugquantity;
	}
	public void setDrugquantity(String drugquantity) {
		this.drugquantity = drugquantity;
	}

	public String getDrugspecification() {
		return this.drugspecification;
	}
	public void setDrugspecification(String drugspecification) {
		this.drugspecification = drugspecification;
	}

	public String getDruguse() {
		return this.druguse;
	}
	public void setDruguse(String druguse) {
		this.druguse = druguse;
	}

}
