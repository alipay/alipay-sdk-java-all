package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改商品
 *
 * @author auto create
 * @since 1.0, 2025-07-07 14:29:58
 */
public class AlipayCommerceEcIndustryinvoiceItemModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1647436782664869236L;

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

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

}
