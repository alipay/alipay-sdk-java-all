package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 网商全渠道收单交易商品信息
 *
 * @author auto create
 * @since 1.0, 2019-01-10 19:22:21
 */
public class BkPosGoodsInfo extends AlipayObject {

	private static final long serialVersionUID = 7297937879956896119L;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 商品金额
	 */
	@ApiField("goods_price")
	private String goodsPrice;

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsPrice() {
		return this.goodsPrice;
	}
	public void setGoodsPrice(String goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

}
