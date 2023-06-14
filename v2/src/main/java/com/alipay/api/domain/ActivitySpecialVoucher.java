package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 私域营销开放特价券详情
 *
 * @author auto create
 * @since 1.0, 2023-06-01 17:31:32
 */
public class ActivitySpecialVoucher extends AlipayObject {

	private static final long serialVersionUID = 1587126478285155758L;

	/**
	 * 门槛金额。
	 */
	@ApiField("floor_amount")
	private String floorAmount;

	/**
	 * 商品名称。说明：该字段可不填，填入 origin_amount 则必填。
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 原价。
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
