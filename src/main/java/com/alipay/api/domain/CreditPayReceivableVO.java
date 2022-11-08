package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用支付应收视图
 *
 * @author auto create
 * @since 1.0, 2022-04-11 20:46:30
 */
public class CreditPayReceivableVO extends AlipayObject {

	private static final long serialVersionUID = 3648496713813418149L;

	/**
	 * 应收结清时间
	 */
	@ApiField("clear_date")
	private String clearDate;

	/**
	 * 应收创建时间
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 应收到期日
	 */
	@ApiField("due_date")
	private String dueDate;

	/**
	 * 应收生效时间
	 */
	@ApiField("effective_date")
	private String effectiveDate;

	/**
	 * 费余额
	 */
	@ApiField("fee_balance_amt")
	private CreditPayMoneyVO feeBalanceAmt;

	/**
	 * 待扣费金额
	 */
	@ApiField("fee_dbt_amt")
	private CreditPayMoneyVO feeDbtAmt;

	/**
	 * 冻结金额
	 */
	@ApiField("freeze_amt")
	private CreditPayMoneyVO freezeAmt;

	/**
	 * 收款账号描述
	 */
	@ApiField("grant_account")
	private String grantAccount;

	/**
	 * 应收失效时间
	 */
	@ApiField("invalid_date")
	private String invalidDate;

	/**
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 买家信息
	 */
	@ApiField("payer")
	private CreditPayUserVO payer;

	/**
	 * 关联外部订单号
	 */
	@ApiField("platform_order_no")
	private String platformOrderNo;

	/**
	 * 已打款金额
	 */
	@ApiField("rct_amt")
	private CreditPayMoneyVO rctAmt;

	/**
	 * 可打款余额
	 */
	@ApiField("rcv_balance_amt")
	private CreditPayMoneyVO rcvBalanceAmt;

	/**
	 * 应收金额
	 */
	@ApiField("receivable_amt")
	private CreditPayMoneyVO receivableAmt;

	/**
	 * 退款金额
	 */
	@ApiField("refund_amt")
	private CreditPayMoneyVO refundAmt;

	/**
	 * WAIT_CONFIRM：待确认
RECEIVABLE：已生效且存在未收金额
DUE_RECEIVED：已全额到期自动收款
FACTORING_RECEIVED：已全额提前收款
UNVALID：失效
	 */
	@ApiField("status")
	private String status;

	/**
	 * 交易原始金额
	 */
	@ApiField("trade_origin_amt")
	private CreditPayMoneyVO tradeOriginAmt;

	/**
	 * 转让金额
	 */
	@ApiField("transfer_amt")
	private CreditPayMoneyVO transferAmt;

	public String getClearDate() {
		return this.clearDate;
	}
	public void setClearDate(String clearDate) {
		this.clearDate = clearDate;
	}

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getDueDate() {
		return this.dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getEffectiveDate() {
		return this.effectiveDate;
	}
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public CreditPayMoneyVO getFeeBalanceAmt() {
		return this.feeBalanceAmt;
	}
	public void setFeeBalanceAmt(CreditPayMoneyVO feeBalanceAmt) {
		this.feeBalanceAmt = feeBalanceAmt;
	}

	public CreditPayMoneyVO getFeeDbtAmt() {
		return this.feeDbtAmt;
	}
	public void setFeeDbtAmt(CreditPayMoneyVO feeDbtAmt) {
		this.feeDbtAmt = feeDbtAmt;
	}

	public CreditPayMoneyVO getFreezeAmt() {
		return this.freezeAmt;
	}
	public void setFreezeAmt(CreditPayMoneyVO freezeAmt) {
		this.freezeAmt = freezeAmt;
	}

	public String getGrantAccount() {
		return this.grantAccount;
	}
	public void setGrantAccount(String grantAccount) {
		this.grantAccount = grantAccount;
	}

	public String getInvalidDate() {
		return this.invalidDate;
	}
	public void setInvalidDate(String invalidDate) {
		this.invalidDate = invalidDate;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public CreditPayUserVO getPayer() {
		return this.payer;
	}
	public void setPayer(CreditPayUserVO payer) {
		this.payer = payer;
	}

	public String getPlatformOrderNo() {
		return this.platformOrderNo;
	}
	public void setPlatformOrderNo(String platformOrderNo) {
		this.platformOrderNo = platformOrderNo;
	}

	public CreditPayMoneyVO getRctAmt() {
		return this.rctAmt;
	}
	public void setRctAmt(CreditPayMoneyVO rctAmt) {
		this.rctAmt = rctAmt;
	}

	public CreditPayMoneyVO getRcvBalanceAmt() {
		return this.rcvBalanceAmt;
	}
	public void setRcvBalanceAmt(CreditPayMoneyVO rcvBalanceAmt) {
		this.rcvBalanceAmt = rcvBalanceAmt;
	}

	public CreditPayMoneyVO getReceivableAmt() {
		return this.receivableAmt;
	}
	public void setReceivableAmt(CreditPayMoneyVO receivableAmt) {
		this.receivableAmt = receivableAmt;
	}

	public CreditPayMoneyVO getRefundAmt() {
		return this.refundAmt;
	}
	public void setRefundAmt(CreditPayMoneyVO refundAmt) {
		this.refundAmt = refundAmt;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public CreditPayMoneyVO getTradeOriginAmt() {
		return this.tradeOriginAmt;
	}
	public void setTradeOriginAmt(CreditPayMoneyVO tradeOriginAmt) {
		this.tradeOriginAmt = tradeOriginAmt;
	}

	public CreditPayMoneyVO getTransferAmt() {
		return this.transferAmt;
	}
	public void setTransferAmt(CreditPayMoneyVO transferAmt) {
		this.transferAmt = transferAmt;
	}

}
