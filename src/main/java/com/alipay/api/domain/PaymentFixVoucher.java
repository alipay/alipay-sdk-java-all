package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 满减券详情
 *
 * @author auto create
 * @since 1.0, 2021-08-16 21:28:00
 */
public class PaymentFixVoucher extends AlipayObject {

	private static final long serialVersionUID = 6186234685515196923L;

	/**
	 * 面额，每张优惠券可以抵扣的金额。

限制：
1、币种为人民币，单位为元。小数点以后最多保留两位。
2、取值范围:0.1<=x<=3000
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 门槛金额，当订单总金额大于等于门槛金额时券才能使用。默认无门槛限制。 

限制:
1、币种为人民币，单位为元。小数点以后最多保留两位。 
2、取值范围:0.1<=x<= 50000。
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
