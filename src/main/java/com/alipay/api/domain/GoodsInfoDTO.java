package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户购买的商品信息
 *
 * @author auto create
 * @since 1.0, 2022-03-18 20:51:52
 */
public class GoodsInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 1612448248391922761L;

	/**
	 * 商品金额
	 */
	@ApiField("goods_amount")
	private String goodsAmount;

	/**
	 * 商品购买数量
	 */
	@ApiField("goods_count")
	private String goodsCount;

	/**
	 * 商品标准69码
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商品名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	public String getGoodsAmount() {
		return this.goodsAmount;
	}
	public void setGoodsAmount(String goodsAmount) {
		this.goodsAmount = goodsAmount;
	}

	public String getGoodsCount() {
		return this.goodsCount;
	}
	public void setGoodsCount(String goodsCount) {
		this.goodsCount = goodsCount;
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

}
