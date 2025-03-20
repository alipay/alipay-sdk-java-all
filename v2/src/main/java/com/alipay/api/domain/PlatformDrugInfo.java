package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 药品订单药品信息
 *
 * @author auto create
 * @since 1.0, 2025-01-06 16:03:53
 */
public class PlatformDrugInfo extends AlipayObject {

	private static final long serialVersionUID = 8215348892616551197L;

	/**
	 * 剂型
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
	 * 生产厂商
	 */
	@ApiField("manufacturer")
	private String manufacturer;

	/**
	 * 药品数量
	 */
	@ApiField("medicine_quantity")
	private String medicineQuantity;

	/**
	 * 药品单价
	 */
	@ApiField("price")
	private String price;

	/**
	 * 规格
	 */
	@ApiField("spec")
	private String spec;

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

	public String getManufacturer() {
		return this.manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getMedicineQuantity() {
		return this.medicineQuantity;
	}
	public void setMedicineQuantity(String medicineQuantity) {
		this.medicineQuantity = medicineQuantity;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getSpec() {
		return this.spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}

}
