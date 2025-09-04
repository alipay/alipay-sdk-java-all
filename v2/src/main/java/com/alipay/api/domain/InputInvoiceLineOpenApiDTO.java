package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票行
 *
 * @author auto create
 * @since 1.0, 2023-08-29 20:52:13
 */
public class InputInvoiceLineOpenApiDTO extends AlipayObject {

	private static final long serialVersionUID = 1222189899829677811L;

	/**
	 * 含税金额,币种单位见currency字段
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 不含税金额,币种单位见currency字段
	 */
	@ApiField("excluding_tax_amount")
	private String excludingTaxAmount;

	/**
	 * 货物名称
	 */
	@ApiField("goods_desc")
	private String goodsDesc;

	/**
	 * 发票行id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 发票id
	 */
	@ApiField("invoice_id")
	private Long invoiceId;

	/**
	 * 规格型号
	 */
	@ApiField("model")
	private String model;

	/**
	 * 数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 单位
	 */
	@ApiField("quantity_unit")
	private String quantityUnit;

	/**
	 * 税额,币种单位见currency字段
	 */
	@ApiField("tax_amount")
	private String taxAmount;

	/**
	 * 税种
	 */
	@ApiField("tax_categories")
	private String taxCategories;

	/**
	 * 税率
	 */
	@ApiField("tax_rate")
	private Long taxRate;

	/**
	 * 单价
	 */
	@ApiField("unit_price")
	private Long unitPrice;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getExcludingTaxAmount() {
		return this.excludingTaxAmount;
	}
	public void setExcludingTaxAmount(String excludingTaxAmount) {
		this.excludingTaxAmount = excludingTaxAmount;
	}

	public String getGoodsDesc() {
		return this.goodsDesc;
	}
	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Long getInvoiceId() {
		return this.invoiceId;
	}
	public void setInvoiceId(Long invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getModel() {
		return this.model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getQuantityUnit() {
		return this.quantityUnit;
	}
	public void setQuantityUnit(String quantityUnit) {
		this.quantityUnit = quantityUnit;
	}

	public String getTaxAmount() {
		return this.taxAmount;
	}
	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}

	public String getTaxCategories() {
		return this.taxCategories;
	}
	public void setTaxCategories(String taxCategories) {
		this.taxCategories = taxCategories;
	}

	public Long getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(Long taxRate) {
		this.taxRate = taxRate;
	}

	public Long getUnitPrice() {
		return this.unitPrice;
	}
	public void setUnitPrice(Long unitPrice) {
		this.unitPrice = unitPrice;
	}

}
