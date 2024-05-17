package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品信息
 *
 * @author auto create
 * @since 1.0, 2024-05-10 13:45:16
 */
public class GoodsInfoDetail extends AlipayObject {

	private static final long serialVersionUID = 1522548653233689345L;

	/**
	 * 商品描述
	 */
	@ApiField("goods_desc")
	private String goodsDesc;

	/**
	 * 商品名称，由isv传入
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 商品类型
	 */
	@ApiField("goods_type")
	private String goodsType;

	/**
	 * 商品单价 单位：元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 商品数量
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 数量单位
	 */
	@ApiField("unit")
	private String unit;

	public String getGoodsDesc() {
		return this.goodsDesc;
	}
	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsType() {
		return this.goodsType;
	}
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
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

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
