package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁采购支付信息
 *
 * @author auto create
 * @since 1.0, 2026-05-18 10:15:55
 */
public class RentProcurementPayItemInfoVO extends AlipayObject {

	private static final long serialVersionUID = 8816841111933278396L;

	/**
	 * 金额，单位：元，精确到小数点后两位
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 费项类型
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
