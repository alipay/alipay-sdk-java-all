package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转入卡资金明细详情
 *
 * @author auto create
 * @since 1.0, 2021-07-13 20:44:04
 */
public class CardAmountDetailVO extends AlipayObject {

	private static final long serialVersionUID = 4767554242972558523L;

	/**
	 * 转入金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 持卡人姓名
	 */
	@ApiField("card_holder_name")
	private String cardHolderName;

	/**
	 * 转入卡账号
	 */
	@ApiField("out_bank_card_no")
	private String outBankCardNo;

	/**
	 * 转入行的银行机构id
	 */
	@ApiField("out_bank_inst_id")
	private String outBankInstId;

	/**
	 * 转入行的银行名称
	 */
	@ApiField("out_bank_name")
	private String outBankName;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCardHolderName() {
		return this.cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getOutBankCardNo() {
		return this.outBankCardNo;
	}
	public void setOutBankCardNo(String outBankCardNo) {
		this.outBankCardNo = outBankCardNo;
	}

	public String getOutBankInstId() {
		return this.outBankInstId;
	}
	public void setOutBankInstId(String outBankInstId) {
		this.outBankInstId = outBankInstId;
	}

	public String getOutBankName() {
		return this.outBankName;
	}
	public void setOutBankName(String outBankName) {
		this.outBankName = outBankName;
	}

}
