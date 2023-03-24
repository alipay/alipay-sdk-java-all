package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金指令门面
 *
 * @author auto create
 * @since 1.0, 2022-10-28 17:19:04
 */
public class AlipayAccountInstfundWithdrawApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3357942738366381462L;

	/**
	 * 提现卡户名
	 */
	@ApiField("bank_card_name")
	private String bankCardName;

	/**
	 * 提现卡号
	 */
	@ApiField("bank_card_no")
	private String bankCardNo;

	/**
	 * 提现银行联行号
	 */
	@ApiField("bank_code")
	private String bankCode;

	/**
	 * 付款账号
	 */
	@ApiField("debit_account_no")
	private String debitAccountNo;

	/**
	 * 付款金额
	 */
	@ApiField("debit_amount")
	private String debitAmount;

	/**
	 * 付款币种
	 */
	@ApiField("debit_currency")
	private String debitCurrency;

	/**
	 * 付款账号用户id
	 */
	@ApiField("debit_user_id")
	private String debitUserId;

	/**
	 * 附言字段
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 外部序列号，联合PID，幂等使用
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getBankCardName() {
		return this.bankCardName;
	}
	public void setBankCardName(String bankCardName) {
		this.bankCardName = bankCardName;
	}

	public String getBankCardNo() {
		return this.bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getBankCode() {
		return this.bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getDebitAccountNo() {
		return this.debitAccountNo;
	}
	public void setDebitAccountNo(String debitAccountNo) {
		this.debitAccountNo = debitAccountNo;
	}

	public String getDebitAmount() {
		return this.debitAmount;
	}
	public void setDebitAmount(String debitAmount) {
		this.debitAmount = debitAmount;
	}

	public String getDebitCurrency() {
		return this.debitCurrency;
	}
	public void setDebitCurrency(String debitCurrency) {
		this.debitCurrency = debitCurrency;
	}

	public String getDebitUserId() {
		return this.debitUserId;
	}
	public void setDebitUserId(String debitUserId) {
		this.debitUserId = debitUserId;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
