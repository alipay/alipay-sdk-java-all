package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 减至使用限制
 *
 * @author auto create
 * @since 1.0, 2023-05-31 15:00:10
 */
public class ReduceToInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8356741976951954467L;

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

	/**
	 * 特价
	 */
	@ApiField("special_amount")
	private Amount specialAmount;

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

	public Amount getSpecialAmount() {
		return this.specialAmount;
	}
	public void setSpecialAmount(Amount specialAmount) {
		this.specialAmount = specialAmount;
	}

}
