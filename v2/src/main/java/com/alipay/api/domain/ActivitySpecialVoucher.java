package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 私域营销开放特价券详情
 *
 * @author auto create
 * @since 1.0, 2023-09-19 13:43:55
 */
public class ActivitySpecialVoucher extends AlipayObject {

	private static final long serialVersionUID = 5342478612466356939L;

	/**
	 * 门槛金额。说明：该字段可不填，认为无门槛;
	 */
	@ApiField("floor_amount")
	private String floorAmount;

	/**
	 * 商品名称。说明：该字段可不填，填入 origin_amount 则必填。
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 原价。说明：该字段可不填，填入商品名称goods_name则必填;
	 */
	@ApiField("origin_amount")
	private String originAmount;

	/**
	 * 特价，即：原价-特价=优惠金额。
	 */
	@ApiField("special_amount")
	private String specialAmount;

	public String getFloorAmount() {
		return this.floorAmount;
	}
	public void setFloorAmount(String floorAmount) {
		this.floorAmount = floorAmount;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getOriginAmount() {
		return this.originAmount;
	}
	public void setOriginAmount(String originAmount) {
		this.originAmount = originAmount;
	}

	public String getSpecialAmount() {
		return this.specialAmount;
	}
	public void setSpecialAmount(String specialAmount) {
		this.specialAmount = specialAmount;
	}

}
