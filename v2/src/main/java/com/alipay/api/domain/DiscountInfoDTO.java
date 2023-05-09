package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 折扣使用限制
 *
 * @author auto create
 * @since 1.0, 2022-11-14 16:05:19
 */
public class DiscountInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7723891462626942933L;

	/**
	 * 封顶金额
	 */
	@ApiField("ceiling_amount")
	private Amount ceilingAmount;

	/**
	 * 折扣比例,8这使用0.8
	 */
	@ApiField("discount")
	private String discount;

	/**
	 * 消费最低金额限制
	 */
	@ApiField("floor_amount")
	private Amount floorAmount;

	/**
	 * 原价
	 */
	@ApiField("origin_amount")
	private Amount originAmount;

	public Amount getCeilingAmount() {
		return this.ceilingAmount;
	}
	public void setCeilingAmount(Amount ceilingAmount) {
		this.ceilingAmount = ceilingAmount;
	}

	public String getDiscount() {
		return this.discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public Amount getFloorAmount() {
		return this.floorAmount;
	}
	public void setFloorAmount(Amount floorAmount) {
		this.floorAmount = floorAmount;
	}

	public Amount getOriginAmount() {
		return this.originAmount;
	}
	public void setOriginAmount(Amount originAmount) {
		this.originAmount = originAmount;
	}

}
