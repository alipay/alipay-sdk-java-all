package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单商品信息
 *
 * @author auto create
 * @since 1.0, 2025-04-16 11:02:04
 */
public class OrderItemDetail extends AlipayObject {

	private static final long serialVersionUID = 6141757143841261622L;

	/**
	 * lm侧商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品标题
	 */
	@ApiField("item_title")
	private String itemTitle;

	/**
	 * 商品购买数量
	 */
	@ApiField("number")
	private Long number;

	/**
	 * 商品skuId
	 */
	@ApiField("sku_id")
	private String skuId;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemTitle() {
		return this.itemTitle;
	}
	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}

	public Long getNumber() {
		return this.number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
