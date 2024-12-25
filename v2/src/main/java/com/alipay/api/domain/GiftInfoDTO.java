package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 满赠信息
 *
 * @author auto create
 * @since 1.0, 2023-05-31 15:00:10
 */
public class GiftInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 3139119683677548225L;

	/**
	 * 消费最低金额限制
	 */
	@ApiField("floor_amount")
	private Amount floorAmount;

	/**
	 * 增品说明
	 */
	@ApiField("gift")
	private String gift;

	public Amount getFloorAmount() {
		return this.floorAmount;
	}
	public void setFloorAmount(Amount floorAmount) {
		this.floorAmount = floorAmount;
	}

	public String getGift() {
		return this.gift;
	}
	public void setGift(String gift) {
		this.gift = gift;
	}

}
