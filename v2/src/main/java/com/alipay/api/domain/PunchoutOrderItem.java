package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单详情
 *
 * @author auto create
 * @since 1.0, 2023-07-11 10:37:27
 */
public class PunchoutOrderItem extends AlipayObject {

	private static final long serialVersionUID = 7515677165189335781L;

	/**
	 * 合同id，用于下pr单
	 */
	@ApiField("contract_id")
	private String contractId;

	/**
	 * currency_code，用于下pr单
	 */
	@ApiField("currency_code")
	private String currencyCode;

	/**
	 * item_description，用于下pr单
	 */
	@ApiField("item_description")
	private String itemDescription;

	/**
	 * 商品id，用于下pr单
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * item_name
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * mall_category_id，用于下pr单
	 */
	@ApiField("mall_category_id")
	private String mallCategoryId;

	/**
	 * quantity，用于下pr单
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * sku_id，用于下pr单
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * sub_pur_req_id，用于下pr单
	 */
	@ApiField("sub_pur_req_id")
	private String subPurReqId;

	/**
	 * 供应商id用于下pr单
	 */
	@ApiField("supplier_id")
	private String supplierId;

	/**
	 * 税率，如13%传13
	 */
	@ApiField("tax_rate")
	private String taxRate;

	/**
	 * 单价（含税），用于pr下单
	 */
	@ApiField("unit_price")
	private String unitPrice;

	/**
	 * uom，用于下pr单
	 */
	@ApiField("uom")
	private String uom;

	public String getContractId() {
		return this.contractId;
	}
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getItemDescription() {
		return this.itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getMallCategoryId() {
		return this.mallCategoryId;
	}
	public void setMallCategoryId(String mallCategoryId) {
		this.mallCategoryId = mallCategoryId;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getSubPurReqId() {
		return this.subPurReqId;
	}
	public void setSubPurReqId(String subPurReqId) {
		this.subPurReqId = subPurReqId;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

	public String getUnitPrice() {
		return this.unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getUom() {
		return this.uom;
	}
	public void setUom(String uom) {
		this.uom = uom;
	}

}
