package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 家医药品搜索接口返回对象
 *
 * @author auto create
 * @since 1.0, 2021-11-16 15:39:04
 */
public class HealthServiceFamilyDoctorDrugDTO extends AlipayObject {

	private static final long serialVersionUID = 4418743514138778598L;

	/**
	 * 是否是目录内药品
	 */
	@ApiField("catalogue_listed")
	private Boolean catalogueListed;

	/**
	 * 剂量形式
	 */
	@ApiField("dosage_forms")
	private String dosageForms;

	/**
	 * 药品分类
	 */
	@ApiField("drug_classification")
	private String drugClassification;

	/**
	 * 药品通用名
	 */
	@ApiField("general_name")
	private String generalName;

	/**
	 * 库存
	 */
	@ApiField("inventory")
	private Long inventory;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 生产厂家名称
	 */
	@ApiField("manufacturer_name")
	private String manufacturerName;

	/**
	 * 最大可购买数量，如果为空则不限制
	 */
	@ApiField("max_purchase_quantity")
	private Long maxPurchaseQuantity;

	/**
	 * 最小可购买数量，如果为空则不限制
	 */
	@ApiField("min_purchase_quantity")
	private Long minPurchaseQuantity;

	/**
	 * 售价
	 */
	@ApiField("price")
	private String price;

	/**
	 * 规格
	 */
	@ApiField("specifications")
	private String specifications;

	/**
	 * 支持急诊配送
	 */
	@ApiField("support_emergency_delivery")
	private Boolean supportEmergencyDelivery;

	/**
	 * 用法用量
	 */
	@ApiField("usage_dosage")
	private String usageDosage;

	public Boolean getCatalogueListed() {
		return this.catalogueListed;
	}
	public void setCatalogueListed(Boolean catalogueListed) {
		this.catalogueListed = catalogueListed;
	}

	public String getDosageForms() {
		return this.dosageForms;
	}
	public void setDosageForms(String dosageForms) {
		this.dosageForms = dosageForms;
	}

	public String getDrugClassification() {
		return this.drugClassification;
	}
	public void setDrugClassification(String drugClassification) {
		this.drugClassification = drugClassification;
	}

	public String getGeneralName() {
		return this.generalName;
	}
	public void setGeneralName(String generalName) {
		this.generalName = generalName;
	}

	public Long getInventory() {
		return this.inventory;
	}
	public void setInventory(Long inventory) {
		this.inventory = inventory;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getManufacturerName() {
		return this.manufacturerName;
	}
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public Long getMaxPurchaseQuantity() {
		return this.maxPurchaseQuantity;
	}
	public void setMaxPurchaseQuantity(Long maxPurchaseQuantity) {
		this.maxPurchaseQuantity = maxPurchaseQuantity;
	}

	public Long getMinPurchaseQuantity() {
		return this.minPurchaseQuantity;
	}
	public void setMinPurchaseQuantity(Long minPurchaseQuantity) {
		this.minPurchaseQuantity = minPurchaseQuantity;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getSpecifications() {
		return this.specifications;
	}
	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}

	public Boolean getSupportEmergencyDelivery() {
		return this.supportEmergencyDelivery;
	}
	public void setSupportEmergencyDelivery(Boolean supportEmergencyDelivery) {
		this.supportEmergencyDelivery = supportEmergencyDelivery;
	}

	public String getUsageDosage() {
		return this.usageDosage;
	}
	public void setUsageDosage(String usageDosage) {
		this.usageDosage = usageDosage;
	}

}
