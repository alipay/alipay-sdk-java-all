package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票内容项申请模型
 *
 * @author auto create
 * @since 1.0, 2020-09-15 15:06:34
 */
public class InvoiceItemApplyOpenModel extends AlipayObject {

	private static final long serialVersionUID = 7116674768192171598L;

	/**
	 * 明细不含税金额，该值为item_quantity＊item_unit_price，依据税控厂商的不同，目前对接的阿里平台和浙江航信该字段不必传
	 */
	@ApiField("item_ex_tax_amount")
	private String itemExTaxAmount;

	/**
	 * 发票项目名称（或商品名称）
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商品编号
	 */
	@ApiField("item_no")
	private String itemNo;

	/**
	 * 数量。新版电子发票，折扣行此参数不能传，非折扣行必传
	 */
	@ApiField("item_quantity")
	private Long itemQuantity;

	/**
	 * 商品型号
	 */
	@ApiField("item_spec")
	private String itemSpec;

	/**
	 * 明细价税合计。该值为item_tax_amount＋item_ex_tax_amount，依据税控厂商的不同，目前对接的阿里平台和浙江航信该字段可不传
	 */
	@ApiField("item_sum_amount")
	private String itemSumAmount;

	/**
	 * 明细税额，该值为item_ex_tax_amount*item_tax_rate,依据税控厂商的不同，对于目前对接的浙江航信和阿里平台，该字段可不传
	 */
	@ApiField("item_tax_amount")
	private String itemTaxAmount;

	/**
	 * 税率
	 */
	@ApiField("item_tax_rate")
	private String itemTaxRate;

	/**
	 * 单位
	 */
	@ApiField("item_unit")
	private String itemUnit;

	/**
	 * 单价，格式：100.00。新版电子发票，折扣行此参数不能传，非折扣行必传
	 */
	@ApiField("item_unit_price")
	private String itemUnitPrice;

	/**
	 * 优惠政策标识。0：没有优惠政策；1：对应零税率为免税或者不征税
	 */
	@ApiField("prefer_policy_flag")
	private String preferPolicyFlag;

	/**
	 * 发票行性质。0表示正常行，1表示折扣行，2表示被折扣行。比如充电器单价100元，折扣10元，则明细为2行，充电器行性质为2，折扣行性质为1。如果充电器没有折扣，则值应为0
	 */
	@ApiField("row_type")
	private String rowType;

	/**
	 * 增值税特殊管理。该标识会展示在票面上，和优惠政策标识和零税率标识强关联；如果是免税，在税率那一行展示“免税”；如果是不征税，在税率那一行展示“不征税”
	 */
	@ApiField("special_manage_flag")
	private String specialManageFlag;

	/**
	 * 零税率标识。为空：非零税率； 1：免税；2：不征税；3：普通零税率
	 */
	@ApiField("zero_tax_flag")
	private String zeroTaxFlag;

	public String getItemExTaxAmount() {
		return this.itemExTaxAmount;
	}
	public void setItemExTaxAmount(String itemExTaxAmount) {
		this.itemExTaxAmount = itemExTaxAmount;
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

	public Long getItemQuantity() {
		return this.itemQuantity;
	}
	public void setItemQuantity(Long itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public String getItemSpec() {
		return this.itemSpec;
	}
	public void setItemSpec(String itemSpec) {
		this.itemSpec = itemSpec;
	}

	public String getItemSumAmount() {
		return this.itemSumAmount;
	}
	public void setItemSumAmount(String itemSumAmount) {
		this.itemSumAmount = itemSumAmount;
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

	public String getItemUnitPrice() {
		return this.itemUnitPrice;
	}
	public void setItemUnitPrice(String itemUnitPrice) {
		this.itemUnitPrice = itemUnitPrice;
	}

	public String getPreferPolicyFlag() {
		return this.preferPolicyFlag;
	}
	public void setPreferPolicyFlag(String preferPolicyFlag) {
		this.preferPolicyFlag = preferPolicyFlag;
	}

	public String getRowType() {
		return this.rowType;
	}
	public void setRowType(String rowType) {
		this.rowType = rowType;
	}

	public String getSpecialManageFlag() {
		return this.specialManageFlag;
	}
	public void setSpecialManageFlag(String specialManageFlag) {
		this.specialManageFlag = specialManageFlag;
	}

	public String getZeroTaxFlag() {
		return this.zeroTaxFlag;
	}
	public void setZeroTaxFlag(String zeroTaxFlag) {
		this.zeroTaxFlag = zeroTaxFlag;
	}

}
