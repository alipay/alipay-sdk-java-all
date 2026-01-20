package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租车商品详细信息
 *
 * @author auto create
 * @since 1.0, 2021-05-25 20:32:44
 */
public class CarRentalGoods extends AlipayObject {

	private static final long serialVersionUID = 3645285215751642751L;

	/**
	 * 商家车辆id
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 商品数量
	 */
	@ApiField("goods_num")
	private String goodsNum;

	/**
	 * 商品图片id
	 */
	@ApiField("goods_pic_url")
	private String goodsPicUrl;

	/**
	 * 商品单价
	 */
	@ApiField("goods_price")
	private String goodsPrice;

	/**
	 * 商品规格
	 */
	@ApiField("goods_specs")
	private String goodsSpecs;

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

	public String getGoodsNum() {
		return this.goodsNum;
	}
	public void setGoodsNum(String goodsNum) {
		this.goodsNum = goodsNum;
	}

	public String getGoodsPicUrl() {
		return this.goodsPicUrl;
	}
	public void setGoodsPicUrl(String goodsPicUrl) {
		this.goodsPicUrl = goodsPicUrl;
	}

	public String getGoodsPrice() {
		return this.goodsPrice;
	}
	public void setGoodsPrice(String goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public String getGoodsSpecs() {
		return this.goodsSpecs;
	}
	public void setGoodsSpecs(String goodsSpecs) {
		this.goodsSpecs = goodsSpecs;
	}

}
