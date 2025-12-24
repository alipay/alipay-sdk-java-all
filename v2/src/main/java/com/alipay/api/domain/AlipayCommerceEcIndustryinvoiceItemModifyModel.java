package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改商品
 *
 * @author auto create
 * @since 1.0, 2025-11-25 21:15:34
 */
public class AlipayCommerceEcIndustryinvoiceItemModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5889346379477317976L;

	/**
	 * 企业商品ID
	 */
	@ApiField("company_item_id")
	private String companyItemId;

	/**
	 * 优惠政策标识
	 */
	@ApiField("favoured_policy_flag")
	private String favouredPolicyFlag;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 规格型号
	 */
	@ApiField("item_spec")
	private String itemSpec;

	/**
	 * 商品税率，小数值，如13%则传值为0.13
	 */
	@ApiField("item_tax_rate")
	private String itemTaxRate;

	/**
	 * 商品单位
	 */
	@ApiField("item_unit")
	private String itemUnit;

	/**
	 * 含税单价，总位数30位，最多17位整数，最多13位小数，单位：元
	 */
	@ApiField("item_unit_amount_with_tax")
	private String itemUnitAmountWithTax;

	/**
	 * 企业税号
	 */
	@ApiField("tax_no")
	private String taxNo;

	public String getCompanyItemId() {
		return this.companyItemId;
	}
	public void setCompanyItemId(String companyItemId) {
		this.companyItemId = companyItemId;
	}

	public String getFavouredPolicyFlag() {
		return this.favouredPolicyFlag;
	}
	public void setFavouredPolicyFlag(String favouredPolicyFlag) {
		this.favouredPolicyFlag = favouredPolicyFlag;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
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

	public String getItemUnitAmountWithTax() {
		return this.itemUnitAmountWithTax;
	}
	public void setItemUnitAmountWithTax(String itemUnitAmountWithTax) {
		this.itemUnitAmountWithTax = itemUnitAmountWithTax;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

}
