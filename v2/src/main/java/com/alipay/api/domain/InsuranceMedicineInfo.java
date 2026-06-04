package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-04-13 20:47:44
 */
public class InsuranceMedicineInfo extends AlipayObject {

	private static final long serialVersionUID = 7438783119394252913L;

	/**
	 * 药品总价，单位：元，保留2位小数
	 */
	@ApiField("medicine_amount")
	private String medicineAmount;

	/**
	 * 药品名称
	 */
	@ApiField("medicine_name")
	private String medicineName;

	/**
	 * 药品数量，单位：克、钱、盒、支、粒，保留2位小数
	 */
	@ApiField("medicine_num")
	private String medicineNum;

	/**
	 * 药品价格，单位：元，保留2位小数
	 */
	@ApiField("medicine_price")
	private String medicinePrice;

	/**
	 * 药品规格，描述药品规格说明，单位：盒、次、处方、非处方等
	 */
	@ApiField("medicine_specification")
	private String medicineSpecification;

	public String getMedicineAmount() {
		return this.medicineAmount;
	}
	public void setMedicineAmount(String medicineAmount) {
		this.medicineAmount = medicineAmount;
	}

	public String getMedicineName() {
		return this.medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public String getMedicineNum() {
		return this.medicineNum;
	}
	public void setMedicineNum(String medicineNum) {
		this.medicineNum = medicineNum;
	}

	public String getMedicinePrice() {
		return this.medicinePrice;
	}
	public void setMedicinePrice(String medicinePrice) {
		this.medicinePrice = medicinePrice;
	}

	public String getMedicineSpecification() {
		return this.medicineSpecification;
	}
	public void setMedicineSpecification(String medicineSpecification) {
		this.medicineSpecification = medicineSpecification;
	}

}
