package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品详情信息
 *
 * @author auto create
 * @since 1.0, 2021-03-24 10:24:16
 */
public class GoodsDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 7843484638684839769L;

	/**
	 * 商品的编号
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 商品单位
	 */
	@ApiField("goods_unit")
	private String goodsUnit;

	/**
	 * 商品数量
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 商品单价，单位元
	 */
	@ApiField("unit_price")
	private String unitPrice;

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

	public String getGoodsUnit() {
		return this.goodsUnit;
	}
	public void setGoodsUnit(String goodsUnit) {
		this.goodsUnit = goodsUnit;
	}

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getUnitPrice() {
		return this.unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

}
