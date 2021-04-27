package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代金券
 *
 * @author auto create
 * @since 1.0, 2021-04-24 14:47:26
 */
public class FixVoucher extends AlipayObject {

	private static final long serialVersionUID = 7119717423972691144L;

	/**
	 * 面额。每张代金券可以抵扣的金额。币种为人民币，单位为元。该数值不能小于0.1，小数点以后最多保留两位。



取值范围:0.1<x<3000
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 最低额度。设置券使用门槛，只有订单金额大于等于最低额度时券才能使用。币种为人民币，单位为元。该数值不能小于0，小数点以后最多保留两位。



设置门槛：取值范围:0.1<x<

50000



不设置门槛：认为是无门槛
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
