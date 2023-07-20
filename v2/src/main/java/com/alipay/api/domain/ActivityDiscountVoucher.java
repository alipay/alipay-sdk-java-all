package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销私域开放折扣券详情
 *
 * @author auto create
 * @since 1.0, 2023-06-01 17:31:32
 */
public class ActivityDiscountVoucher extends AlipayObject {

	private static final long serialVersionUID = 3177833279893123437L;

	/**
	 * 封顶金额。
	 */
	@ApiField("ceiling_amount")
	private String ceilingAmount;

	/**
	 * 折扣率。
	 */
	@ApiField("discount")
	private String discount;

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

	public String getCeilingAmount() {
		return this.ceilingAmount;
	}
	public void setCeilingAmount(String ceilingAmount) {
		this.ceilingAmount = ceilingAmount;
	}

	public String getDiscount() {
		return this.discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}

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

}
