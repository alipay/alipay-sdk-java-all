package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁售后费用项明细
 *
 * @author auto create
 * @since 1.0, 2025-07-16 13:39:36
 */
public class AftersalePayItemVO extends AlipayObject {

	private static final long serialVersionUID = 7433411747478475378L;

	/**
	 * 当前费用项支付金额，单位：元，精确到小数点后两位
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 费用类型
	 */
	@ApiField("type")
	private String type;

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
