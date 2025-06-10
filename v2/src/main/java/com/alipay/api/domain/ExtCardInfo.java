package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金记账账簿外卡信息
 *
 * @author auto create
 * @since 1.0, 2025-03-26 19:52:19
 */
public class ExtCardInfo extends AlipayObject {

	private static final long serialVersionUID = 5415129267269424289L;

	/**
	 * 记账的外卡户名
	 */
	@ApiField("bank_acc_name")
	private String bankAccName;

	/**
	 * 记账的外卡开户行
	 */
	@ApiField("card_bank")
	private String cardBank;

	/**
	 * 记账的外卡支行
	 */
	@ApiField("card_branch")
	private String cardBranch;

	/**
	 * 记账的外卡联行号
	 */
	@ApiField("card_deposit")
	private String cardDeposit;

	/**
	 * 记账的外卡开户地址
	 */
	@ApiField("card_location")
	private String cardLocation;

	/**
	 * 记账的外卡卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 记账的外卡状态,
A：正常状态; 
其他：异常
	 */
	@ApiField("status")
	private String status;

	public String getBankAccName() {
		return this.bankAccName;
	}
	public void setBankAccName(String bankAccName) {
		this.bankAccName = bankAccName;
	}

	public String getCardBank() {
		return this.cardBank;
	}
	public void setCardBank(String cardBank) {
		this.cardBank = cardBank;
	}

	public String getCardBranch() {
		return this.cardBranch;
	}
	public void setCardBranch(String cardBranch) {
		this.cardBranch = cardBranch;
	}

	public String getCardDeposit() {
		return this.cardDeposit;
	}
	public void setCardDeposit(String cardDeposit) {
		this.cardDeposit = cardDeposit;
	}

	public String getCardLocation() {
		return this.cardLocation;
	}
	public void setCardLocation(String cardLocation) {
		this.cardLocation = cardLocation;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
