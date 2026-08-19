package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票商品信息
 *
 * @author auto create
 * @since 1.0, 2026-08-14 19:59:20
 */
public class InvoiceProductItemInfo extends AlipayObject {

	private static final long serialVersionUID = 4489338336314157238L;

	/**
	 * 商品金额,单位元，精确到分
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 以元为单位精确到分。开红 票(红冲)时为负数
	 */
	@ApiField("excluding_tax_amount")
	private String excludingTaxAmount;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商品编码(或税 收分类编码)
	 */
	@ApiField("item_no")
	private String itemNo;

	/**
	 * 部分红冲需要考虑此字段， 当红冲的商品行不是第一 行时，需要传次字段，传入 要红冲的对应的蓝票商品 行排序序号
	 */
	@ApiField("original_blue_item_serial_no")
	private String originalBlueItemSerialNo;

	/**
	 * N:不使用，Y:使用
	 */
	@ApiField("preferential_policy_flag")
	private String preferentialPolicyFlag;

	/**
	 * 不含税单价，以元为单位精确到分
	 */
	@ApiField("price")
	private String price;

	/**
	 * 开红票(红冲)时为 负数
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 0:正常行 1:折扣行 2:被折扣行
	 */
	@ApiField("row_type")
	private String rowType;

	/**
	 * 明细行号，从 1 开始
	 */
	@ApiField("serial_no")
	private Long serialNo;

	/**
	 * 规格型号
	 */
	@ApiField("specification")
	private String specification;

	/**
	 * 税额，以元为单位精确到分
	 */
	@ApiField("tax_amount")
	private String taxAmount;

	/**
	 * 税率只能为 0 或 0.01 或 0.03 或 0.04 或 0.05 或 0.06 或 0.09 或 0.11 或 0.13 或 0.17
	 */
	@ApiField("tax_rate")
	private String taxRate;

	/**
	 * 单位
	 */
	@ApiField("unit")
	private String unit;

	/**
	 * 享受优惠政策标志 为 Y 时 必填
比如04 不征税
	 */
	@ApiField("vat_special_management")
	private String vatSpecialManagement;

	/**
	 * 空:非零税率， 1:免税 2:不征税 3:普通零税率
	 */
	@ApiField("zero_rate_flag")
	private String zeroRateFlag;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getExcludingTaxAmount() {
		return this.excludingTaxAmount;
	}
	public void setExcludingTaxAmount(String excludingTaxAmount) {
		this.excludingTaxAmount = excludingTaxAmount;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemNo() {
		return this.itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public String getOriginalBlueItemSerialNo() {
		return this.originalBlueItemSerialNo;
	}
	public void setOriginalBlueItemSerialNo(String originalBlueItemSerialNo) {
		this.originalBlueItemSerialNo = originalBlueItemSerialNo;
	}

	public String getPreferentialPolicyFlag() {
		return this.preferentialPolicyFlag;
	}
	public void setPreferentialPolicyFlag(String preferentialPolicyFlag) {
		this.preferentialPolicyFlag = preferentialPolicyFlag;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getRowType() {
		return this.rowType;
	}
	public void setRowType(String rowType) {
		this.rowType = rowType;
	}

	public Long getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(Long serialNo) {
		this.serialNo = serialNo;
	}

	public String getSpecification() {
		return this.specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public String getTaxAmount() {
		return this.taxAmount;
	}
	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}

	public String getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getVatSpecialManagement() {
		return this.vatSpecialManagement;
	}
	public void setVatSpecialManagement(String vatSpecialManagement) {
		this.vatSpecialManagement = vatSpecialManagement;
	}

	public String getZeroRateFlag() {
		return this.zeroRateFlag;
	}
	public void setZeroRateFlag(String zeroRateFlag) {
		this.zeroRateFlag = zeroRateFlag;
	}

}
