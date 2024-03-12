package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 托管子户账单
 *
 * @author auto create
 * @since 1.0, 2019-06-24 17:50:12
 */
public class TrusteeshipAccountBillQueryResponse extends AlipayObject {

	private static final long serialVersionUID = 5642578932353798179L;

	/**
	 * 账单日
	 */
	@ApiField("account_date")
	private String accountDate;

	/**
	 * 流水类型，取值为I/O，I表示IN，即流入；O表示OUT，即流出。
	 */
	@ApiField("action")
	private String action;

	/**
	 * 涉及金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 账户剩余金额
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 托管流水号
	 */
	@ApiField("id")
	private String id;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 交易时间
	 */
	@ApiField("trans_dt")
	private String transDt;

	/**
	 * 支付宝ID
	 */
	@ApiField("uid")
	private String uid;

	public String getAccountDate() {
		return this.accountDate;
	}
	public void setAccountDate(String accountDate) {
		this.accountDate = accountDate;
	}

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBalance() {
		return this.balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getTransDt() {
		return this.transDt;
	}
	public void setTransDt(String transDt) {
		this.transDt = transDt;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
