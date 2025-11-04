package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 入金的卡信息
 *
 * @author auto create
 * @since 1.0, 2024-12-31 15:31:17
 */
public class TransInCardInfo extends AlipayObject {

	private static final long serialVersionUID = 5859626711569948852L;

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
	 * 记账的外卡联航号
	 */
	@ApiField("card_deposit")
	private String cardDeposit;

	/**
	 * 记账的外卡开户地址
	 */
	@ApiField("card_location")
	private String cardLocation;

	/**
	 * 平台资金专户对应的记账的外卡卡号
	 */
	@ApiField("card_no")
	private String cardNo;

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

}
