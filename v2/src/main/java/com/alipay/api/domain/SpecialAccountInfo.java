package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 专用账户详细信息
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:37:51
 */
public class SpecialAccountInfo extends AlipayObject {

	private static final long serialVersionUID = 7178237449333328453L;

	/**
	 * 户名
	 */
	@ApiField("bank_acc_name")
	private String bankAccName;

	/**
	 * 开户行
	 */
	@ApiField("card_bank")
	private String cardBank;

	/**
	 * 支行
	 */
	@ApiField("card_branch")
	private String cardBranch;

	/**
	 * 开户行号
	 */
	@ApiField("card_deposit")
	private String cardDeposit;

	/**
	 * 银行卡开户地址
	 */
	@ApiField("card_location")
	private String cardLocation;

	/**
	 * 银行卡卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 总剩余金额（元，两位小数）
	 */
	@ApiField("total_amount")
	private String totalAmount;

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

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
