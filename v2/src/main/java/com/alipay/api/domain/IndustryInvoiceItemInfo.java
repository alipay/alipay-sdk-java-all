package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 正向通用发票商品信息
 *
 * @author auto create
 * @since 1.0, 2025-08-11 23:07:19
 */
public class IndustryInvoiceItemInfo extends AlipayObject {

	private static final long serialVersionUID = 4325514172575235526L;

	/**
	 * 优惠政策标识
	 */
	@ApiField("favoured_policy_flag")
	private String favouredPolicyFlag;

	/**
	 * 明细行总开票金额(单位:元)，总和小于等于账单金额 当前字段已废弃(字段调整为item_amount，此字段不做处理)
	 */
	@ApiField("invoice_amount")
	@Deprecated
	private String invoiceAmount;

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
	 * 商品数量：总27位数，最多15位整数，最多10位小数
	 */
	@ApiField("item_num")
	private String itemNum;

	/**
	 * 商品规格型号
	 */
	@ApiField("item_spec")
	private String itemSpec;

	/**
	 * 商品税率，小数介于(0, 1)，小数部分最多保留四位
	 */
	@ApiField("item_tax_rate")
	private String itemTaxRate;

	/**
	 * 商品单位
不动产经营租赁传值仅支持：平方米
成品油传值仅支持：升、吨
其他开票场景可自定义单位
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

	public String getInvoiceAmount() {
		return this.invoiceAmount;
	}
	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
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
