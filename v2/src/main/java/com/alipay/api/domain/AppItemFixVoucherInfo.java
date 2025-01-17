package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 满减券
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:31
 */
public class AppItemFixVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 3769175782843861333L;

	/**
	 * 【描述】券的优惠面额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 【描述】满减券的门槛金额
	 */
	@ApiField("floor_amount")
	private String floorAmount;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getFloorAmount() {
		return this.floorAmount;
	}
	public void setFloorAmount(String floorAmount) {
		this.floorAmount = floorAmount;
	}

}
