package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单业务中，商户的前置费用明细条目
 *
 * @author auto create
 * @since 1.0, 2019-11-14 14:05:35
 */
public class PreAmountClauseResult extends AlipayObject {

	private static final long serialVersionUID = 6511665696768341363L;

	/**
	 * 具体的金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 用于指定金额的描述信息
	 */
	@ApiField("desc")
	private String desc;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

}
