package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 付款条款
 *
 * @author auto create
 * @since 1.0, 2022-10-10 11:17:46
 */
public class PayContractItemApplyDTO extends AlipayObject {

	private static final long serialVersionUID = 8392266838428179381L;

	/**
	 * 已收票金额
	 */
	@ApiField("invoice_received_amount")
	private MultiCurrencyMoneyOpenApi invoiceReceivedAmount;

	/**
	 * 已发起付款金额
	 */
	@ApiField("issued_amount")
	private MultiCurrencyMoneyOpenApi issuedAmount;

	/**
	 * 付款条款行号
	 */
	@ApiField("item_no")
	private String itemNo;

	/**
	 * 条款行类型
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 此付款条款是否需要审批
	 */
	@ApiField("need_audit")
	private Boolean needAudit;

	/**
	 * 是否有票
	 */
	@ApiField("need_invoice")
	private Boolean needInvoice;

	/**
	 * 已付金额
	 */
	@ApiField("paid_amount")
	private MultiCurrencyMoneyOpenApi paidAmount;

	/**
	 * 付款参照类型
	 */
	@ApiField("pay_ref_type")
	private String payRefType;

	/**
	 * 付款期限
	 */
	@ApiField("pay_term")
	private String payTerm;

	/**
	 * 付款期限类型
	 */
	@ApiField("pay_term_type")
	private String payTermType;

	/**
	 * 付款条款申请的可付金额-不变
	 */
	@ApiField("payable_amount")
	private MultiCurrencyMoneyOpenApi payableAmount;

	/**
	 * 付款金额
	 */
	@ApiField("payment_amount")
	private String paymentAmount;

	/**
	 * 条款类型
	 */
	@ApiField("payment_type")
	private String paymentType;

	/**
	 * 阶段
	 */
	@ApiField("phase")
	private Long phase;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 条款内容
	 */
	@ApiField("terms")
	private String terms;

	public MultiCurrencyMoneyOpenApi getInvoiceReceivedAmount() {
		return this.invoiceReceivedAmount;
	}
	public void setInvoiceReceivedAmount(MultiCurrencyMoneyOpenApi invoiceReceivedAmount) {
		this.invoiceReceivedAmount = invoiceReceivedAmount;
	}

	public MultiCurrencyMoneyOpenApi getIssuedAmount() {
		return this.issuedAmount;
	}
	public void setIssuedAmount(MultiCurrencyMoneyOpenApi issuedAmount) {
		this.issuedAmount = issuedAmount;
	}

	public String getItemNo() {
		return this.itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public Boolean getNeedAudit() {
		return this.needAudit;
	}
	public void setNeedAudit(Boolean needAudit) {
		this.needAudit = needAudit;
	}

	public Boolean getNeedInvoice() {
		return this.needInvoice;
	}
	public void setNeedInvoice(Boolean needInvoice) {
		this.needInvoice = needInvoice;
	}

	public MultiCurrencyMoneyOpenApi getPaidAmount() {
		return this.paidAmount;
	}
	public void setPaidAmount(MultiCurrencyMoneyOpenApi paidAmount) {
		this.paidAmount = paidAmount;
	}

	public String getPayRefType() {
		return this.payRefType;
	}
	public void setPayRefType(String payRefType) {
		this.payRefType = payRefType;
	}

	public String getPayTerm() {
		return this.payTerm;
	}
	public void setPayTerm(String payTerm) {
		this.payTerm = payTerm;
	}

	public String getPayTermType() {
		return this.payTermType;
	}
	public void setPayTermType(String payTermType) {
		this.payTermType = payTermType;
	}

	public MultiCurrencyMoneyOpenApi getPayableAmount() {
		return this.payableAmount;
	}
	public void setPayableAmount(MultiCurrencyMoneyOpenApi payableAmount) {
		this.payableAmount = payableAmount;
	}

	public String getPaymentAmount() {
		return this.paymentAmount;
	}
	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getPaymentType() {
		return this.paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public Long getPhase() {
		return this.phase;
	}
	public void setPhase(Long phase) {
		this.phase = phase;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTerms() {
		return this.terms;
	}
	public void setTerms(String terms) {
		this.terms = terms;
	}

}
