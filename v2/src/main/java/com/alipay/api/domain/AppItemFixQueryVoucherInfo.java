package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 满减优惠查询信息
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:19
 */
public class AppItemFixQueryVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 5337371183721784258L;

	/**
	 * 券面额，单位：元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 门槛金额，单位：元
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
