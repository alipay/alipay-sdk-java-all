package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 跨境结算商品明细
 *
 * @author auto create
 * @since 1.0, 2021-07-06 15:34:24
 */
public class OverseasGoods extends AlipayObject {

	private static final long serialVersionUID = 2779521994643319913L;

	/**
	 * 商品价格，单位为元
	 */
	@ApiField("goods_amount")
	private String goodsAmount;

	/**
	 * 商品的编号
	 */
	@ApiField("goods_id")
	private String goodsId;

	public String getGoodsAmount() {
		return this.goodsAmount;
	}
	public void setGoodsAmount(String goodsAmount) {
		this.goodsAmount = goodsAmount;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

}
