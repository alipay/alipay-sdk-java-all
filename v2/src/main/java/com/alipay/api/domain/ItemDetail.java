package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商业订单商品明细
 *
 * @author auto create
 * @since 1.0, 2019-08-17 17:40:59
 */
public class ItemDetail extends AlipayObject {

	private static final long serialVersionUID = 7817421588963861624L;

	/**
	 * 商品编号
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商品价格，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("price")
	private String price;

	/**
	 * 商品数量。目前仅支持整数，若需要传小数，请咨询支付宝小二或接口owner
	 */
	@ApiField("quantity")
	private Long quantity;

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

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

}
