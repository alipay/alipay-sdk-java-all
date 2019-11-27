package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.Account;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.trade.recvscheme.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class MybankCreditSupplychainTradeRecvschemeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5344459212335474496L;

	/** 
	 * 到账金额，单位元
	 */
	@ApiField("actual_amt")
	private String actualAmt;

	/** 
	 * true表示准入，false表示不准入
	 */
	@ApiField("admit")
	private Boolean admit;

	/** 
	 * 支用申请金额，单位元，等于订单金额，等于到账金额+费用金额
	 */
	@ApiField("apply_amt")
	private String applyAmt;

	/** 
	 * 贷款方案签名，用于收款签名
	 */
	@ApiField("data_sign")
	private String dataSign;

	/** 
	 * 支用到期日
	 */
	@ApiField("expire_date")
	private String expireDate;

	/** 
	 * 费用金额，单位元
	 */
	@ApiField("fee_amt")
	private String feeAmt;

	/** 
	 * 可贷额度，单位元
	 */
	@ApiField("loanable_amt")
	private String loanableAmt;

	/** 
	 * 收款账号
	 */
	@ApiField("recv_account")
	private Account recvAccount;

	/** 
	 * 还款方式，枚举值：1（等额本息）、2（等额本金）、3（按期付息到期还本）、4（组合还款）、6（一次性到期还本付息）、7（固定利息等额分期），客户签署贷款合约时会展示此值、8（等本等费）
	 */
	@ApiField("repay_mode")
	private String repayMode;

	/** 
	 * 交易金额，单位元，等于订单金额
	 */
	@ApiField("trade_amt")
	private String tradeAmt;

	public void setActualAmt(String actualAmt) {
		this.actualAmt = actualAmt;
	}
	public String getActualAmt( ) {
		return this.actualAmt;
	}

	public void setAdmit(Boolean admit) {
		this.admit = admit;
	}
	public Boolean getAdmit( ) {
		return this.admit;
	}

	public void setApplyAmt(String applyAmt) {
		this.applyAmt = applyAmt;
	}
	public String getApplyAmt( ) {
		return this.applyAmt;
	}

	public void setDataSign(String dataSign) {
		this.dataSign = dataSign;
	}
	public String getDataSign( ) {
		return this.dataSign;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}
	public String getExpireDate( ) {
		return this.expireDate;
	}

	public void setFeeAmt(String feeAmt) {
		this.feeAmt = feeAmt;
	}
	public String getFeeAmt( ) {
		return this.feeAmt;
	}

	public void setLoanableAmt(String loanableAmt) {
		this.loanableAmt = loanableAmt;
	}
	public String getLoanableAmt( ) {
		return this.loanableAmt;
	}

	public void setRecvAccount(Account recvAccount) {
		this.recvAccount = recvAccount;
	}
	public Account getRecvAccount( ) {
		return this.recvAccount;
	}

	public void setRepayMode(String repayMode) {
		this.repayMode = repayMode;
	}
	public String getRepayMode( ) {
		return this.repayMode;
	}

	public void setTradeAmt(String tradeAmt) {
		this.tradeAmt = tradeAmt;
	}
	public String getTradeAmt( ) {
		return this.tradeAmt;
	}

}
