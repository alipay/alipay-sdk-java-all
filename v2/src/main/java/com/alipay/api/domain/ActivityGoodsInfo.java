package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动核销商品详情
 *
 * @author auto create
 * @since 1.0, 2023-07-17 13:49:53
 */
public class ActivityGoodsInfo extends AlipayObject {

	private static final long serialVersionUID = 1548815487394137491L;

	/**
	 * 商品编码
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 活动单品类型。
	 */
	@ApiField("goods_use_type")
	private String goodsUseType;

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsUseType() {
		return this.goodsUseType;
	}
	public void setGoodsUseType(String goodsUseType) {
		this.goodsUseType = goodsUseType;
	}

}
