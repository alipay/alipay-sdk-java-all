package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票关联的账单
 *
 * @author auto create
 * @since 1.0, 2021-09-28 14:28:27
 */
public class InvoiceBillResponseDTO extends AlipayObject {

	private static final long serialVersionUID = 4898516625112167115L;

	/**
	 * 申请单聚合键
	 */
	@ApiField("apply_relative_id")
	private String applyRelativeId;

	/**
	 * 合约号
	 */
	@ApiField("arrangement_no")
	private String arrangementNo;

	/**
	 * 账单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 单据类型
	 */
	@ApiField("bill_type")
	private String billType;

	/**
	 * 商户名称
	 */
	@ApiField("customer_name")
	private String customerName;

	/**
	 * 机构
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 机构名称
	 */
	@ApiField("inst_name")
	private String instName;

	/**
	 * 关联发票受理单应票金额
	 */
	@ApiField("invaccept_receivable_amt")
	private MultiCurrencyMoneyOpenApi invacceptReceivableAmt;

	/**
	 * 关联发票受理单已票金额
	 */
	@ApiField("invaccept_relevant_amt")
	private MultiCurrencyMoneyOpenApi invacceptRelevantAmt;

	/**
	 * 可票金额 (固定不变的，不会根据已票金额变化而变化)*
	 */
	@ApiField("invoice_receivable_amount")
	private MultiCurrencyMoneyOpenApi invoiceReceivableAmount;

	/**
	 * 已票金额（发票中心-发票认证时才会更新）
	 */
	@ApiField("invoice_received_amount")
	private MultiCurrencyMoneyOpenApi invoiceReceivedAmount;

	/**
	 * 已发起付款金额
	 */
	@ApiField("issued_paid_amount")
	private MultiCurrencyMoneyOpenApi issuedPaidAmount;

	/**
	 * 开票号
	 */
	@ApiField("kp_no")
	private String kpNo;

	/**
	 * 已付款金额
	 */
	@ApiField("paid_amount")
	private MultiCurrencyMoneyOpenApi paidAmount;

	/**
	 * 可付款金额
	 */
	@ApiField("payable_amount")
	private MultiCurrencyMoneyOpenApi payableAmount;

	/**
	 * 结算状态
	 */
	@ApiField("settle_status")
	private String settleStatus;

	/**
	 * 关联发票税额
	 */
	@ApiField("tax_amount")
	private MultiCurrencyMoneyOpenApi taxAmount;

	/**
	 * 待付款金额=可付金额-已发起付款金额
	 */
	@ApiField("to_pay_amount")
	private MultiCurrencyMoneyOpenApi toPayAmount;

	/**
	 * 未票金额=应票金额-已票金额
	 */
	@ApiField("un_invoice_received_amount")
	private MultiCurrencyMoneyOpenApi unInvoiceReceivedAmount;

	/**
	 * 已核销金额
	 */
	@ApiField("wroteoff_amount")
	private MultiCurrencyMoneyOpenApi wroteoffAmount;

	public String getApplyRelativeId() {
		return this.applyRelativeId;
	}
	public void setApplyRelativeId(String applyRelativeId) {
		this.applyRelativeId = applyRelativeId;
	}

	public String getArrangementNo() {
		return this.arrangementNo;
	}
	public void setArrangementNo(String arrangementNo) {
		this.arrangementNo = arrangementNo;
	}

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getBillType() {
		return this.billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}

	public String getCustomerName() {
		return this.customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getInstName() {
		return this.instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}

	public MultiCurrencyMoneyOpenApi getInvacceptReceivableAmt() {
		return this.invacceptReceivableAmt;
	}
	public void setInvacceptReceivableAmt(MultiCurrencyMoneyOpenApi invacceptReceivableAmt) {
		this.invacceptReceivableAmt = invacceptReceivableAmt;
	}

	public MultiCurrencyMoneyOpenApi getInvacceptRelevantAmt() {
		return this.invacceptRelevantAmt;
	}
	public void setInvacceptRelevantAmt(MultiCurrencyMoneyOpenApi invacceptRelevantAmt) {
		this.invacceptRelevantAmt = invacceptRelevantAmt;
	}

	public MultiCurrencyMoneyOpenApi getInvoiceReceivableAmount() {
		return this.invoiceReceivableAmount;
	}
	public void setInvoiceReceivableAmount(MultiCurrencyMoneyOpenApi invoiceReceivableAmount) {
		this.invoiceReceivableAmount = invoiceReceivableAmount;
	}

	public MultiCurrencyMoneyOpenApi getInvoiceReceivedAmount() {
		return this.invoiceReceivedAmount;
	}
	public void setInvoiceReceivedAmount(MultiCurrencyMoneyOpenApi invoiceReceivedAmount) {
		this.invoiceReceivedAmount = invoiceReceivedAmount;
	}

	public MultiCurrencyMoneyOpenApi getIssuedPaidAmount() {
		return this.issuedPaidAmount;
	}
	public void setIssuedPaidAmount(MultiCurrencyMoneyOpenApi issuedPaidAmount) {
		this.issuedPaidAmount = issuedPaidAmount;
	}

	public String getKpNo() {
		return this.kpNo;
	}
	public void setKpNo(String kpNo) {
		this.kpNo = kpNo;
	}

	public MultiCurrencyMoneyOpenApi getPaidAmount() {
		return this.paidAmount;
	}
	public void setPaidAmount(MultiCurrencyMoneyOpenApi paidAmount) {
		this.paidAmount = paidAmount;
	}

	public MultiCurrencyMoneyOpenApi getPayableAmount() {
		return this.payableAmount;
	}
	public void setPayableAmount(MultiCurrencyMoneyOpenApi payableAmount) {
		this.payableAmount = payableAmount;
	}

	public String getSettleStatus() {
		return this.settleStatus;
	}
	public void setSettleStatus(String settleStatus) {
		this.settleStatus = settleStatus;
	}

	public MultiCurrencyMoneyOpenApi getTaxAmount() {
		return this.taxAmount;
	}
	public void setTaxAmount(MultiCurrencyMoneyOpenApi taxAmount) {
		this.taxAmount = taxAmount;
	}

	public MultiCurrencyMoneyOpenApi getToPayAmount() {
		return this.toPayAmount;
	}
	public void setToPayAmount(MultiCurrencyMoneyOpenApi toPayAmount) {
		this.toPayAmount = toPayAmount;
	}

	public MultiCurrencyMoneyOpenApi getUnInvoiceReceivedAmount() {
		return this.unInvoiceReceivedAmount;
	}
	public void setUnInvoiceReceivedAmount(MultiCurrencyMoneyOpenApi unInvoiceReceivedAmount) {
		this.unInvoiceReceivedAmount = unInvoiceReceivedAmount;
	}

	public MultiCurrencyMoneyOpenApi getWroteoffAmount() {
		return this.wroteoffAmount;
	}
	public void setWroteoffAmount(MultiCurrencyMoneyOpenApi wroteoffAmount) {
		this.wroteoffAmount = wroteoffAmount;
	}

}
