package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 费控额度扣减记录
 *
 * @author auto create
 * @since 1.0, 2022-12-14 16:05:43
 */
public class ExpenseControlQuotaPayInfo extends AlipayObject {

	private static final long serialVersionUID = 1428658231832121533L;

	/**
	 * 金额（分）
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 对应的规则ID
	 */
	@ApiField("standard_id")
	private String standardId;

	/**
	 * 已扣减 - DEDUCTED
已恢复 - RECOVERED
	 */
	@ApiField("status")
	private String status;

	/**
	 * 支付宝正向交易单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getStandardId() {
		return this.standardId;
	}
	public void setStandardId(String standardId) {
		this.standardId = standardId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
