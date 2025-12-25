package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 对账单汇总
 *
 * @author auto create
 * @since 1.0, 2024-08-27 16:53:57
 */
public class RentPayQueryBillListResponse extends AlipayObject {

	private static final long serialVersionUID = 6446759484218788467L;

	/**
	 * 账户编号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 收款银行名称
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * 银行收款账号
	 */
	@ApiField("bank_no")
	private String bankNo;

	/**
	 * 付款批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 批次汇总金额（单位元）
	 */
	@ApiField("batch_total_amount")
	private String batchTotalAmount;

	/**
	 * 提示信息
	 */
	@ApiField("description")
	private String description;

	/**
	 * 付款日期，日期格式都是yyyy-mm-dd
	 */
	@ApiField("payment_date")
	private String paymentDate;

	/**
	 * 银行结算流水号
	 */
	@ApiField("settle_serial_no")
	private String settleSerialNo;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getBankName() {
		return this.bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankNo() {
		return this.bankNo;
	}
	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getBatchTotalAmount() {
		return this.batchTotalAmount;
	}
	public void setBatchTotalAmount(String batchTotalAmount) {
		this.batchTotalAmount = batchTotalAmount;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getPaymentDate() {
		return this.paymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getSettleSerialNo() {
		return this.settleSerialNo;
	}
	public void setSettleSerialNo(String settleSerialNo) {
		this.settleSerialNo = settleSerialNo;
	}

}
