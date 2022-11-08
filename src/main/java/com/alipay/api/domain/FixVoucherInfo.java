package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 满减券
 *
 * @author auto create
 * @since 1.0, 2022-11-03 16:33:13
 */
public class FixVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 1387385636912686429L;

	/**
	 * 面额，每张代金券可以抵扣的金额。
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 门槛金额。该字段不填写，认为无门槛。
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
