package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.accountbook.card.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:25:21
 */
public class AlipayFundAccountbookCardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2342129716471488548L;

	/** 
	 * 记账本外卡卡号
	 */
	@ApiField("account_book_card_no")
	private String accountBookCardNo;

	/** 
	 * 可用余额
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/** 
	 * 记账本的外卡户名
	 */
	@ApiField("bank_acc_name")
	private String bankAccName;

	/** 
	 * 记账本的外卡开户行
	 */
	@ApiField("card_bank")
	private String cardBank;

	/** 
	 * 记账本的外卡支行
	 */
	@ApiField("card_branch")
	private String cardBranch;

	/** 
	 * 记账本的外卡联行号
	 */
	@ApiField("card_deposit")
	private String cardDeposit;

	/** 
	 * 记账本的外卡开户地址
	 */
	@ApiField("card_location")
	private String cardLocation;

	/** 
	 * 记账的外卡状态, A：正常状态; 其他：异常
	 */
	@ApiField("status")
	private String status;

	public void setAccountBookCardNo(String accountBookCardNo) {
		this.accountBookCardNo = accountBookCardNo;
	}
	public String getAccountBookCardNo( ) {
		return this.accountBookCardNo;
	}

	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}
	public String getAvailableAmount( ) {
		return this.availableAmount;
	}

	public void setBankAccName(String bankAccName) {
		this.bankAccName = bankAccName;
	}
	public String getBankAccName( ) {
		return this.bankAccName;
	}

	public void setCardBank(String cardBank) {
		this.cardBank = cardBank;
	}
	public String getCardBank( ) {
		return this.cardBank;
	}

	public void setCardBranch(String cardBranch) {
		this.cardBranch = cardBranch;
	}
	public String getCardBranch( ) {
		return this.cardBranch;
	}

	public void setCardDeposit(String cardDeposit) {
		this.cardDeposit = cardDeposit;
	}
	public String getCardDeposit( ) {
		return this.cardDeposit;
	}

	public void setCardLocation(String cardLocation) {
		this.cardLocation = cardLocation;
	}
	public String getCardLocation( ) {
		return this.cardLocation;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
