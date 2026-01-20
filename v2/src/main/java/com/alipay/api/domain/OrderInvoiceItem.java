package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单发票明细
 *
 * @author auto create
 * @since 1.0, 2025-09-10 10:36:12
 */
public class OrderInvoiceItem extends AlipayObject {

	private static final long serialVersionUID = 4233381227676629761L;

	/**
	 * 优惠政策标识
	 */
	@ApiField("favoured_policy_flag")
	private String favouredPolicyFlag;

	/**
	 * 行性质
	 */
	@ApiField("invoice_line_property")
	private String invoiceLineProperty;

	/**
	 * 不含税金额，计量单位：人民币
	 */
	@ApiField("item_amount")
	private String itemAmount;

	/**
	 * 分类简称
	 */
	@ApiField("item_category_name")
	private String itemCategoryName;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 数量
	 */
	@ApiField("item_num")
	private String itemNum;

	/**
	 * 规格型号
	 */
	@ApiField("item_spec")
	private String itemSpec;

	/**
	 * 税额，计量单位：人民币
	 */
	@ApiField("item_tax_amount")
	private String itemTaxAmount;

	/**
	 * 税收分类编码
	 */
	@ApiField("item_tax_code")
	private String itemTaxCode;

	/**
	 * 税率，以小数形式展示
	 */
	@ApiField("item_tax_rate")
	private String itemTaxRate;

	/**
	 * 含税金额，计量单位：人民币
	 */
	@ApiField("item_total_amount")
	private String itemTotalAmount;

	/**
	 * 单位
	 */
	@ApiField("item_unit")
	private String itemUnit;

	/**
	 * 单价，计量单位：人民币
	 */
	@ApiField("item_unit_amount")
	private String itemUnitAmount;

	/**
	 * 开具红字发票时，明细对应红冲的蓝字发票明细序号
	 */
	@ApiField("related_blue_serial_no")
	private Long relatedBlueSerialNo;

	/**
	 * 明细序号
	 */
	@ApiField("serial_no")
	private Long serialNo;

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

	public String getItemTaxCode() {
		return this.itemTaxCode;
	}
	public void setItemTaxCode(String itemTaxCode) {
		this.itemTaxCode = itemTaxCode;
	}

	public String getItemTaxRate() {
		return this.itemTaxRate;
	}
	public void setItemTaxRate(String itemTaxRate) {
		this.itemTaxRate = itemTaxRate;
	}

	public String getItemTotalAmount() {
		return this.itemTotalAmount;
	}
	public void setItemTotalAmount(String itemTotalAmount) {
		this.itemTotalAmount = itemTotalAmount;
	}

	public String getItemUnit() {
		return this.itemUnit;
	}
	public void setItemUnit(String itemUnit) {
		this.itemUnit = itemUnit;
	}

	public String getItemUnitAmount() {
		return this.itemUnitAmount;
	}
	public void setItemUnitAmount(String itemUnitAmount) {
		this.itemUnitAmount = itemUnitAmount;
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

}
