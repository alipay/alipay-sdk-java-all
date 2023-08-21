package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于传递芝麻免押后付费项目相关信息，json格式
 *
 * @author auto create
 * @since 1.0, 2023-07-26 17:59:37
 */
public class PostPayment extends AlipayObject {

	private static final long serialVersionUID = 8592693373211249828L;

	/**
	 * 后付费金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 计费说明
	 */
	@ApiField("description")
	private String description;

	/**
	 * 后付费项目名称
	 */
	@ApiField("name")
	private String name;

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

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
