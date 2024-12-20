package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流水记录校验真假
 *
 * @author auto create
 * @since 1.0, 2024-12-03 15:51:21
 */
public class AlipayCommerceFundTransferDetectModel extends AlipayObject {

	private static final long serialVersionUID = 6453466128815631919L;

	/**
	 * 实际支付金额, 单位元
	 */
	@ApiField("monetary_amount")
	private String monetaryAmount;

	/**
	 * 付款企业支付宝账号
	 */
	@ApiField("payment_account")
	private String paymentAccount;

	/**
	 * 付款企业账户名
	 */
	@ApiField("payment_bank_name")
	private String paymentBankName;

	/**
	 * 实际支付日期
	 */
	@ApiField("payment_date")
	private String paymentDate;

	/**
	 * 收款银行卡号/收款方支付宝登录号
	 */
	@ApiField("receipt_account")
	private String receiptAccount;

	/**
	 * 收款银行名称, 到卡需要填
	 */
	@ApiField("receipt_bank_name")
	private String receiptBankName;

	/**
	 * 收款方名称
	 */
	@ApiField("recipient")
	private String recipient;

	/**
	 * 收款方身份证号
	 */
	@ApiField("recipient_id")
	private String recipientId;

	/**
	 * 流水号
	 */
	@ApiField("sequence_code")
	private String sequenceCode;

	public String getMonetaryAmount() {
		return this.monetaryAmount;
	}
	public void setMonetaryAmount(String monetaryAmount) {
		this.monetaryAmount = monetaryAmount;
	}

	public String getPaymentAccount() {
		return this.paymentAccount;
	}
	public void setPaymentAccount(String paymentAccount) {
		this.paymentAccount = paymentAccount;
	}

	public String getPaymentBankName() {
		return this.paymentBankName;
	}
	public void setPaymentBankName(String paymentBankName) {
		this.paymentBankName = paymentBankName;
	}

	public String getPaymentDate() {
		return this.paymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getReceiptAccount() {
		return this.receiptAccount;
	}
	public void setReceiptAccount(String receiptAccount) {
		this.receiptAccount = receiptAccount;
	}

	public String getReceiptBankName() {
		return this.receiptBankName;
	}
	public void setReceiptBankName(String receiptBankName) {
		this.receiptBankName = receiptBankName;
	}

	public String getRecipient() {
		return this.recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getRecipientId() {
		return this.recipientId;
	}
	public void setRecipientId(String recipientId) {
		this.recipientId = recipientId;
	}

	public String getSequenceCode() {
		return this.sequenceCode;
	}
	public void setSequenceCode(String sequenceCode) {
		this.sequenceCode = sequenceCode;
	}

}
