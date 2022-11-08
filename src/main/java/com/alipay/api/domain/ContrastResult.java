package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 货柜lite人工识别结果
 *
 * @author auto create
 * @since 1.0, 2022-10-08 13:11:14
 */
public class ContrastResult extends AlipayObject {

	private static final long serialVersionUID = 3653463483237935831L;

	/**
	 * 变化商品数量
	 */
	@ApiField("goods_count")
	private Long goodsCount;

	/**
	 * 货柜商品算法ID
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商品是否减少，true为减少
	 */
	@ApiField("goods_reduce")
	private Boolean goodsReduce;

	public Long getGoodsCount() {
		return this.goodsCount;
	}
	public void setGoodsCount(Long goodsCount) {
		this.goodsCount = goodsCount;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public Boolean getGoodsReduce() {
		return this.goodsReduce;
	}
	public void setGoodsReduce(Boolean goodsReduce) {
		this.goodsReduce = goodsReduce;
	}

}
