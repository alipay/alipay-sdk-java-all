package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品库新增商品信息
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:37:54
 */
public class AlipayCommerceEcRecyclinginvoiceItemCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5222388614492796294L;

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
	 * 商品单位
	 */
	@ApiField("item_unit")
	private String itemUnit;

	/**
	 * 外部商品ID，是由请求者传入的
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 根据企业（商户）所开通的产品查询该产品ID
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 税收分类编码
	 */
	@ApiField("tax_code")
	private String taxCode;

	/**
	 * 分配给企业（商户）的税号
	 */
	@ApiField("tax_no")
	private String taxNo;

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

	public String getItemUnit() {
		return this.itemUnit;
	}
	public void setItemUnit(String itemUnit) {
		this.itemUnit = itemUnit;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getTaxCode() {
		return this.taxCode;
	}
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

}
