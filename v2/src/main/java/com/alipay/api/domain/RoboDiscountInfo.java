package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 费用详情
 *
 * @author auto create
 * @since 1.0, 2025-12-03 11:39:17
 */
public class RoboDiscountInfo extends AlipayObject {

	private static final long serialVersionUID = 2475437368727986232L;

	/**
	 * 金额，单位：分
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 唯一标识
	 */
	@ApiField("key")
	private String key;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

}
