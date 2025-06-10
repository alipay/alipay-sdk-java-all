package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品明细信息
 *
 * @author auto create
 * @since 1.0, 2017-08-16 14:41:52
 */
public class GoodsInfo extends AlipayObject {

	private static final long serialVersionUID = 2793454853747495223L;

	/**
	 * 商品类目
	 */
	@ApiField("goods_category")
	private String goodsCategory;

	/**
	 * 商户自定义商品外部编号
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商户自定义商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 商品单价，单位元,精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("price")
	private String price;

	/**
	 * 商品数量,支持小数，但是小数位不能超过两位
	 */
	@ApiField("quantity")
	private String quantity;

	public String getGoodsCategory() {
		return this.goodsCategory;
	}
	public void setGoodsCategory(String goodsCategory) {
		this.goodsCategory = goodsCategory;
	}

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
