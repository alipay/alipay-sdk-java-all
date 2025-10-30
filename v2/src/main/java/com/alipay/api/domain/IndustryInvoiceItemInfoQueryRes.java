package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付可开票查询结果商品明细
 *
 * @author auto create
 * @since 1.0, 2025-07-25 14:01:38
 */
public class IndustryInvoiceItemInfoQueryRes extends AlipayObject {

	private static final long serialVersionUID = 6744419394119928624L;

	/**
	 * 优惠政策标识
	 */
	@ApiField("favoured_policy_flag")
	private String favouredPolicyFlag;

	/**
	 * 发票行性质
	 */
	@ApiField("invoice_line_property")
	private String invoiceLineProperty;

	/**
	 * 开票金额：总位数20位，最多16位整数，最多2位小数，单位：元
	 */
	@ApiField("item_amount")
	private String itemAmount;

	/**
	 * 税收分类编码简称
	 */
	@ApiField("item_category_name")
	private String itemCategoryName;

	/**
	 * 商品配置编码
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商品数量：总位数26位，最多15整数,10小数
	 */
	@ApiField("item_num")
	private String itemNum;

	/**
	 * 规格型号
	 */
	@ApiField("item_spec")
	private String itemSpec;

	/**
	 * 税额，单位：元
	 */
	@ApiField("item_tax_amount")
	private String itemTaxAmount;

	/**
	 * 商品税率
	 */
	@ApiField("item_tax_rate")
	private String itemTaxRate;

	/**
	 * 商品单位
	 */
	@ApiField("item_unit")
	private String itemUnit;

	/**
	 * 关联蓝票明细行序号
	 */
	@ApiField("related_blue_serial_no")
	private Long relatedBlueSerialNo;

	/**
	 * 明细行序号
	 */
	@ApiField("serial_no")
	private Long serialNo;

	/**
	 * 税收分类编码
	 */
	@ApiField("tax_code")
	private String taxCode;

	public String getFavouredPolicyFlag() {
		return this.favouredPolicyFlag;
	}
	public void setFavouredPolicyFlag(String favouredPolicyFlag) {
		this.favouredPolicyFlag = favouredPolicyFlag;
	}

	public String getInvoiceLineProperty() {
		return this.invoiceLineProperty;
	}
	public void setInvoiceLineProperty(String invoiceLineProperty) {
		this.invoiceLineProperty = invoiceLineProperty;
	}

	public String getItemAmount() {
		return this.itemAmount;
	}
	public void setItemAmount(String itemAmount) {
		this.itemAmount = itemAmount;
	}

	public String getItemCategoryName() {
		return this.itemCategoryName;
	}
	public void setItemCategoryName(String itemCategoryName) {
		this.itemCategoryName = itemCategoryName;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemNum() {
		return this.itemNum;
	}
	public void setItemNum(String itemNum) {
		this.itemNum = itemNum;
	}

	public String getItemSpec() {
		return this.itemSpec;
	}
	public void setItemSpec(String itemSpec) {
		this.itemSpec = itemSpec;
	}

	public String getItemTaxAmount() {
		return this.itemTaxAmount;
	}
	public void setItemTaxAmount(String itemTaxAmount) {
		this.itemTaxAmount = itemTaxAmount;
	}

	public String getItemTaxRate() {
		return this.itemTaxRate;
	}
	public void setItemTaxRate(String itemTaxRate) {
		this.itemTaxRate = itemTaxRate;
	}

	public String getItemUnit() {
		return this.itemUnit;
	}
	public void setItemUnit(String itemUnit) {
		this.itemUnit = itemUnit;
	}

	public Long getRelatedBlueSerialNo() {
		return this.relatedBlueSerialNo;
	}
	public void setRelatedBlueSerialNo(Long relatedBlueSerialNo) {
		this.relatedBlueSerialNo = relatedBlueSerialNo;
	}

	public Long getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(Long serialNo) {
		this.serialNo = serialNo;
	}

	public String getTaxCode() {
		return this.taxCode;
	}
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

}
