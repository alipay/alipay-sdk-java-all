package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小票优惠信息
 *
 * @author auto create
 * @since 1.0, 2020-07-23 14:42:08
 */
public class ReceiptDiscountInfo extends AlipayObject {

	private static final long serialVersionUID = 2554722584444241392L;

	/**
	 * 优惠金额，单位分
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 优惠描述
	 */
	@ApiField("desc")
	private String desc;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

}
