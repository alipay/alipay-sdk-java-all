package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品信息
 *
 * @author auto create
 * @since 1.0, 2021-08-27 11:11:51
 */
public class BankGoodsDetail extends AlipayObject {

	private static final long serialVersionUID = 1638394711891924476L;

	/**
	 * 商品ID
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 价格，单位元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 数量
	 */
	@ApiField("quantity")
	private String quantity;

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
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
