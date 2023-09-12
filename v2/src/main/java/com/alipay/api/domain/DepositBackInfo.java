package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 银行卡冲退信息
 *
 * @author auto create
 * @since 1.0, 2020-08-13 19:08:50
 */
public class DepositBackInfo extends AlipayObject {

	private static final long serialVersionUID = 7254654912473738486L;

	/**
	 * 银行响应时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("bank_ack_time")
	private String bankAckTime;

	/**
	 * 银行卡冲退金额
	 */
	@ApiField("dback_amount")
	private String dbackAmount;

	/**
	 * 银行卡冲退状态。S-成功，F-失败，P-处理中。银行卡冲退失败，资金自动转入用户支付宝余额。
	 */
	@ApiField("dback_status")
	private String dbackStatus;

	/**
	 * 预估银行到账时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("est_bank_receipt_time")
	private String estBankReceiptTime;

	/**
	 * 是否存在银行卡冲退信息。
	 */
	@ApiField("has_deposit_back")
	private String hasDepositBack;

	public String getBankAckTime() {
		return this.bankAckTime;
	}
	public void setBankAckTime(String bankAckTime) {
		this.bankAckTime = bankAckTime;
	}

	public String getDbackAmount() {
		return this.dbackAmount;
	}
	public void setDbackAmount(String dbackAmount) {
		this.dbackAmount = dbackAmount;
	}

	public String getDbackStatus() {
		return this.dbackStatus;
	}
	public void setDbackStatus(String dbackStatus) {
		this.dbackStatus = dbackStatus;
	}

	public String getEstBankReceiptTime() {
		return this.estBankReceiptTime;
	}
	public void setEstBankReceiptTime(String estBankReceiptTime) {
		this.estBankReceiptTime = estBankReceiptTime;
	}

	public String getHasDepositBack() {
		return this.hasDepositBack;
	}
	public void setHasDepositBack(String hasDepositBack) {
		this.hasDepositBack = hasDepositBack;
	}

}
