package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合并的商品行信息
 *
 * @author auto create
 * @since 1.0, 2023-07-11 10:37:53
 */
public class MallItemDtos extends AlipayObject {

	private static final long serialVersionUID = 6752911944427979619L;

	/**
	 * contract_code,用于合并购物车
	 */
	@ApiField("contract_code")
	private String contractCode;

	/**
	 * currency_code，用于合并购物车
	 */
	@ApiField("currency_code")
	private String currencyCode;

	/**
	 * img_url，用于合并购物车
	 */
	@ApiField("img_url")
	private String imgUrl;

	/**
	 * item_description
	 */
	@ApiField("item_description")
	private String itemDescription;

	/**
	 * item_id，用于购物车合并
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * item_name,用于合并购物车
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * item_url，用于购物车合并
	 */
	@ApiField("item_url")
	private String itemUrl;

	/**
	 * mall_category_id，用于购物车合并
	 */
	@ApiField("mall_category_id")
	private String mallCategoryId;

	/**
	 * quantity，用于购物车合并
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * sku_id，用于购物车合并
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * sub_pur_req_id，用于购物车合并
	 */
	@ApiField("sub_pur_req_id")
	private String subPurReqId;

	/**
	 * supplier_id，用于购物车合并
	 */
	@ApiField("supplier_id")
	private String supplierId;

	/**
	 * 税率，如13%传13
	 */
	@ApiField("tax_rate")
	private String taxRate;

	/**
	 * unit_price，用于合并购物车
	 */
	@ApiField("unit_price")
	private String unitPrice;

	/**
	 * uom，用于购物车合并
	 */
	@ApiField("uom")
	private String uom;

	public String getContractCode() {
		return this.contractCode;
	}
	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getImgUrl() {
		return this.imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
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

	public String getItemUrl() {
		return this.itemUrl;
	}
	public void setItemUrl(String itemUrl) {
		this.itemUrl = itemUrl;
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
