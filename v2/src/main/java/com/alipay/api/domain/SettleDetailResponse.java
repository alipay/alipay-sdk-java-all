package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分账明细返回
 *
 * @author auto create
 * @since 1.0, 2023-10-09 10:03:40
 */
public class SettleDetailResponse extends AlipayObject {

	private static final long serialVersionUID = 2766547485569862129L;

	/**
	 * 分账金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 分账明细id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 分账比例
	 */
	@ApiField("rate")
	private String rate;

	/**
	 * 分账单ID
	 */
	@ApiField("settle_order_id")
	private String settleOrderId;

	/**
	 * 分账时间
	 */
	@ApiField("settle_time")
	private Date settleTime;

	/**
	 * 分账接收方账号
	 */
	@ApiField("trans_in_account")
	private String transInAccount;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getRate() {
		return this.rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getSettleOrderId() {
		return this.settleOrderId;
	}
	public void setSettleOrderId(String settleOrderId) {
		this.settleOrderId = settleOrderId;
	}

	public Date getSettleTime() {
		return this.settleTime;
	}
	public void setSettleTime(Date settleTime) {
		this.settleTime = settleTime;
	}

	public String getTransInAccount() {
		return this.transInAccount;
	}
	public void setTransInAccount(String transInAccount) {
		this.transInAccount = transInAccount;
	}

}
