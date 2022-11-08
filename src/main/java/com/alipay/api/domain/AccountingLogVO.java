package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账户流水VO
 *
 * @author auto create
 * @since 1.0, 2022-05-06 14:26:36
 */
public class AccountingLogVO extends AlipayObject {

	private static final long serialVersionUID = 7822777476196247322L;

	/**
	 * 交易账户
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 账户类型:监管户-SUPERVISED_ACC,托管子户-ENTRUST_SUB_ACC
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 记账动作
IN:流入
OUT:流出
	 */
	@ApiField("action")
	private String action;

	/**
	 * 余额,人民币,单位元,1.23代表1.23元。注:因账务异步记账模式,此处余额展示可能会有延迟,不保证实时更新。
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 流水主键
	 */
	@ApiField("log_id")
	private String logId;

	/**
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 对手方账户
	 */
	@ApiField("other_account")
	private String otherAccount;

	/**
	 * 外部请求号,跟分账或提现的out_request_no保持一致
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 交易金额,人民币,单位元,1.23代表1.23元
	 */
	@ApiField("trans_amount")
	private String transAmount;

	/**
	 * 交易日期
	 */
	@ApiField("trans_dt")
	private String transDt;

	/**
	 * 交易备注
	 */
	@ApiField("trans_memo")
	private String transMemo;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getBalance() {
		return this.balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getLogId() {
		return this.logId;
	}
	public void setLogId(String logId) {
		this.logId = logId;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOtherAccount() {
		return this.otherAccount;
	}
	public void setOtherAccount(String otherAccount) {
		this.otherAccount = otherAccount;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getTransAmount() {
		return this.transAmount;
	}
	public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
	}

	public String getTransDt() {
		return this.transDt;
	}
	public void setTransDt(String transDt) {
		this.transDt = transDt;
	}

	public String getTransMemo() {
		return this.transMemo;
	}
	public void setTransMemo(String transMemo) {
		this.transMemo = transMemo;
	}

}
