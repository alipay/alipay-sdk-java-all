package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单的商品信息
 *
 * @author auto create
 * @since 1.0, 2024-06-25 21:28:01
 */
public class RentItemInfo extends AlipayObject {

	private static final long serialVersionUID = 4839613891439875355L;

	/**
	 * 订单中的商品的下单数量
	 */
	@ApiField("item_cnt")
	private Long itemCnt;

	/**
	 * 商品库商品唯一ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商户商品ID
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 商户商品sku_id
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 生成订单时商品的实际价格，单位：元，精确到小数点后两位
	 */
	@ApiField("real_sale_price")
	private String realSalePrice;

	/**
	 * 订单时商品的售卖价，单位：元，精确到小数点后两位
	 */
	@ApiField("sale_price")
	private String salePrice;

	/**
	 * 支付宝侧商品skuid
	 */
	@ApiField("sku_id")
	private String skuId;

	public Long getItemCnt() {
		return this.itemCnt;
	}
	public void setItemCnt(Long itemCnt) {
		this.itemCnt = itemCnt;
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

	public String getRealSalePrice() {
		return this.realSalePrice;
	}
	public void setRealSalePrice(String realSalePrice) {
		this.realSalePrice = realSalePrice;
	}

	public String getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
