package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 每条结算明细
 *
 * @author auto create
 * @since 1.0, 2022-08-29 18:05:33
 */
public class BizFundSettleDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 5618722712226331979L;

	/**
	 * 入账金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 分账状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 入账账户
	 */
	@ApiField("trans_in")
	private String transIn;

	/**
	 * 入账账户类型
	 */
	@ApiField("trans_in_type")
	private String transInType;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTransIn() {
		return this.transIn;
	}
	public void setTransIn(String transIn) {
		this.transIn = transIn;
	}

	public String getTransInType() {
		return this.transInType;
	}
	public void setTransInType(String transInType) {
		this.transInType = transInType;
	}

}
