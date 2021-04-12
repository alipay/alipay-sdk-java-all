package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付记录非实付金额数据模型
 *
 * @author auto create
 * @since 1.0, 2020-04-03 14:55:36
 */
public class TransactionAmountModifierDTO extends AlipayObject {

	private static final long serialVersionUID = 1733455337756719452L;

	/**
	 * 金额
	 */
	@ApiField("amount")
	private TransactionAmountDTO amount;

	/**
	 * 金额类型说明
	 */
	@ApiField("description")
	private String description;

	/**
	 * 金额类型
	 */
	@ApiField("type")
	private String type;

	public TransactionAmountDTO getAmount() {
		return this.amount;
	}
	public void setAmount(TransactionAmountDTO amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
