package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-18 11:32:56
 */
public class RepaymentInfo extends AlipayObject {

	private static final long serialVersionUID = 4723651225644174248L;

	/**
	 * 回款金额，单位为元，精确到小数点后两位
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 回款失败原因，仅 repayment_status = FAIL 时填写
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * 回款时间，格式 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_pay")
	private String gmtPay;

	/**
	 * 外部平台全局唯一流水号，扣款咨询阶段外部平台返回
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 预付回款业务的收款钱包编号
	 */
	@ApiField("payee_wallet_id")
	private String payeeWalletId;

	/**
	 * 预付回款业务的回款方钱包编号，对应专户发薪收款钱包编号
	 */
	@ApiField("payer_wallet_id")
	private String payerWalletId;

	/**
	 * 回款状态
	 */
	@ApiField("repayment_status")
	private String repaymentStatus;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public String getGmtPay() {
		return this.gmtPay;
	}
	public void setGmtPay(String gmtPay) {
		this.gmtPay = gmtPay;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getPayeeWalletId() {
		return this.payeeWalletId;
	}
	public void setPayeeWalletId(String payeeWalletId) {
		this.payeeWalletId = payeeWalletId;
	}

	public String getPayerWalletId() {
		return this.payerWalletId;
	}
	public void setPayerWalletId(String payerWalletId) {
		this.payerWalletId = payerWalletId;
	}

	public String getRepaymentStatus() {
		return this.repaymentStatus;
	}
	public void setRepaymentStatus(String repaymentStatus) {
		this.repaymentStatus = repaymentStatus;
	}

}
