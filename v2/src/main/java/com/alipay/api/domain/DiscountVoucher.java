package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 折扣券详情 限制: 券类型voucher_type为折扣券DISCOUNT_VOUCHER时必传
 *
 * @author auto create
 * @since 1.0, 2022-08-24 14:42:48
 */
public class DiscountVoucher extends AlipayObject {

	private static final long serialVersionUID = 7323325858386619513L;

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
	 * 门槛金额。说明：该字段可不填，认为无门槛;
	 */
	@ApiField("floor_amount")
	private String floorAmount;

	/**
	 * 商品名称。说明：该字段可不填，填入则origin_amount必填。
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 原价。说明：该字段可不填，填入则商品名称goods_name必填;
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
