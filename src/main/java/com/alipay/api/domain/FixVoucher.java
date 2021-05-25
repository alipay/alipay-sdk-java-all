package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 满减配置
 *
 * @author auto create
 * @since 1.0, 2021-05-10 14:00:52
 */
public class FixVoucher extends AlipayObject {

	private static final long serialVersionUID = 5762969771551261886L;

	/**
	 * 面额，每张代金券可以抵扣的金额。



限制：

币种为人民币，单位为元。小数点以后最多保留两位。



取值范围:0.1<=x<=3000
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 门槛金额。该字段不填写，认为无门槛。



限制： 只有当订单金额大于等于门槛金额时券才能使用。



币种为人民币，单位为元。小数点以后最多保留两位。



设置门槛：取值范围:0.1<=x<= 50000。

如果设置了门槛金额，则必须大于等于0.1，不可以等于0
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
