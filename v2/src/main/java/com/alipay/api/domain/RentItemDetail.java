package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁商品详情
 *
 * @author auto create
 * @since 1.0, 2024-07-08 21:59:50
 */
public class RentItemDetail extends AlipayObject {

	private static final long serialVersionUID = 4629851423134965825L;

	/**
	 * 租赁商品类目，具体类目信息见<a href="https://opendocs.alipay.com/open/10719">https://opendocs.alipay.com/open/10719</a>
	 */
	@ApiField("goods_category")
	private String goodsCategory;

	/**
	 * 租赁商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 外部商品ID
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 外部SKU标识
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 租赁商品数量，单位为个
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 是否监管机
	 */
	@ApiField("supervised")
	private Boolean supervised;

	/**
	 * 单个商品价格。单位:元，精度:分
	 */
	@ApiField("unit_price")
	private String unitPrice;

	public String getGoodsCategory() {
		return this.goodsCategory;
	}
	public void setGoodsCategory(String goodsCategory) {
		this.goodsCategory = goodsCategory;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Boolean getSupervised() {
		return this.supervised;
	}
	public void setSupervised(Boolean supervised) {
		this.supervised = supervised;
	}

	public String getUnitPrice() {
		return this.unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

}
