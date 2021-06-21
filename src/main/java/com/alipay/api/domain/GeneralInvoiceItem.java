package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票明细模型
 *
 * @author auto create
 * @since 1.0, 2020-07-10 16:59:38
 */
public class GeneralInvoiceItem extends AlipayObject {

	private static final long serialVersionUID = 2713582995838229262L;

	/**
	 * 价税合计。(等于sumPrice和tax之和)，
单位：元，格式为2位小数，精度2位小数
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 发票项目名称（或商品名称）
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 发票项目编号（或商品编号）
	 */
	@ApiField("item_no")
	private String itemNo;

	/**
	 * 单价（不含税），2到6位小数。格式为2位小数。
折扣行此参数不能传，非折扣行必传
	 */
	@ApiField("price")
	private String price;

	/**
	 * 数量，最多6位小数。
折扣行此参数不能传，非折扣行必传。存在则需>0
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 发票行性质。0表示正常行，1表示折扣行，2表示被折扣行。
比如充电器单价100元，折扣10元，则明细为2行，充电器行性质为2，折扣行性质为1。如果充电器没有折扣，则值应为0。
	 */
	@ApiField("row_type")
	private String rowType;

	/**
	 * 规格型号
	 */
	@ApiField("specification")
	private String specification;

	/**
	 * 总价 (不含税)，格式为2位小数
单位：元，精度2位小数
	 */
	@ApiField("sum_price")
	private String sumPrice;

	/**
	 * 税额，格式为2位小数
	 */
	@ApiField("tax")
	private String tax;

	/**
	 * 单价（含税），格式为2位小数。最大支持6位小数，不足2位小数时需转化为2位小数格式。 折扣行此参数不能传，非折扣行必传。当auto_preprocess=true 只能传一个，不能同时传。当auto_preprocess=false, tax_price字段无用，勿传。此时开票需要传price
	 */
	@ApiField("tax_price")
	private String taxPrice;

	/**
	 * 税率。税率只能为0.00或0.03或0.04或0.06或0.11或0.13或0.17
	 */
	@ApiField("tax_rate")
	private String taxRate;

	/**
	 * 单位。折扣行不能传，非折扣行必传
	 */
	@ApiField("unit")
	private String unit;

	/**
	 * 0税率标识，只有税率为0的情况才有值，0=出口零税率，1=免税，2=不征收，3=普通零税率
	 */
	@ApiField("zero_rate_flag")
	private String zeroRateFlag;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
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

	public String getSpecification() {
		return this.specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public String getSumPrice() {
		return this.sumPrice;
	}
	public void setSumPrice(String sumPrice) {
		this.sumPrice = sumPrice;
	}

	public String getTax() {
		return this.tax;
	}
	public void setTax(String tax) {
		this.tax = tax;
	}

	public String getTaxPrice() {
		return this.taxPrice;
	}
	public void setTaxPrice(String taxPrice) {
		this.taxPrice = taxPrice;
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

	public String getZeroRateFlag() {
		return this.zeroRateFlag;
	}
	public void setZeroRateFlag(String zeroRateFlag) {
		this.zeroRateFlag = zeroRateFlag;
	}

}
