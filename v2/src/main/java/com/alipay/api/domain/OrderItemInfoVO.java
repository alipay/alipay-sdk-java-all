package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品信息
 *
 * @author auto create
 * @since 1.0, 2023-04-04 19:53:18
 */
public class OrderItemInfoVO extends AlipayObject {

	private static final long serialVersionUID = 5148128922284953258L;

	/**
	 * 商品个数
	 */
	@ApiField("item_cnt")
	private Long itemCnt;

	/**
	 * 商品itemId
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 外部商品id
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 外部商品skuid
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 生成订单时商品的售卖价（单位：分），可以跟上传商品接口的价格不一致
	 */
	@ApiField("sale_price")
	private String salePrice;

	/**
	 * 商品skuid
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
