package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品咨询请求
 *
 * @author auto create
 * @since 1.0, 2021-02-18 15:05:47
 */
public class ItemConsultRequest extends AlipayObject {

	private static final long serialVersionUID = 6362971691422366845L;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品单价，单位为元，最多2位小数
	 */
	@ApiField("price")
	private String price;

	/**
	 * 商品数量
	 */
	@ApiField("quantity")
	private String quantity;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
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

}
