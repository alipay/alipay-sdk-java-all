package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询付款申请
 *
 * @author auto create
 * @since 1.0, 2021-10-13 18:04:29
 */
public class PaymentApplyResponseDTO extends AlipayObject {

	private static final long serialVersionUID = 6169814188459881961L;

	/**
	 * 申请单号
	 */
	@ApiField("apply_relative_id")
	private String applyRelativeId;

	/**
	 * 合约号
	 */
	@ApiField("arrangement_no")
	private String arrangementNo;

	/**
	 * 单据类型
	 */
	@ApiField("bill_type")
	private String billType;

	/**
	 * 供应商名称
	 */
	@ApiField("customer_name")
	private String customerName;

	/**
	 * 是否是质量保证金额
	 */
	@ApiField("guarantee_noney")
	private String guaranteeNoney;

	/**
	 * OU代码
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * OU名称
	 */
	@ApiField("inst_name")
	private String instName;

	/**
	 * 应票金额
	 */
	@ApiField("invaccept_receivable_amt")
	private MultiCurrencyMoneyOpenApi invacceptReceivableAmt;

	/**
	 * 关联发票受理单，已票金额
	 */
	@ApiField("invaccept_relevant_amt")
	private MultiCurrencyMoneyOpenApi invacceptRelevantAmt;

	/**
	 * 可票金额 (固定不变的，不会根据已票金额变化而变化)
	 */
	@ApiField("invoice_receivable_amount")
	private MultiCurrencyMoneyOpenApi invoiceReceivableAmount;

	/**
	 * 已认证金额
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
	 * 付款描述
	 */
	@ApiField("pay_contract_desc")
	private String payContractDesc;

	/**
	 * 付款条款行ID
	 */
	@ApiField("pay_contract_item_no")
	private String payContractItemNo;

	/**
	 * 可付款金额
	 */
	@ApiField("payable_amount")
	private MultiCurrencyMoneyOpenApi payableAmount;

	/**
	 * RT号
	 */
	@ApiField("rt_no")
	private String rtNo;

	/**
	 * 状态：已结算、未结算、部分结算
	 */
	@ApiField("settle_status")
	private String settleStatus;

	/**
	 * 来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 付款阶段
	 */
	@ApiField("stage")
	private String stage;

	/**
	 * 开票资料-账号
	 */
	@ApiField("tax_account_no")
	private String taxAccountNo;

	/**
	 * 开票资料-地址
	 */
	@ApiField("tax_address")
	private String taxAddress;

	/**
	 * 发票税额
	 */
	@ApiField("tax_amount")
	private MultiCurrencyMoneyOpenApi taxAmount;

	/**
	 * 开票资料-银行
	 */
	@ApiField("tax_bank_name")
	private String taxBankName;

	/**
	 * 开票资料-名称
	 */
	@ApiField("tax_invoice_title")
	private String taxInvoiceTitle;

	/**
	 * 开票资料-电话
	 */
	@ApiField("tax_phone_no")
	private String taxPhoneNo;

	/**
	 * 税率
	 */
	@ApiField("tax_rate")
	private String taxRate;

	/**
	 * 开票资料-税号
	 */
	@ApiField("tax_tax_no")
	private String taxTaxNo;

	/**
	 * 开票资料-类型
	 */
	@ApiField("tax_type")
	private String taxType;

	/**
	 * 开票资料-类型名称
	 */
	@ApiField("tax_type_desc")
	private String taxTypeDesc;

	/**
	 * 待付款金额=可付金额-已发起付款金额
	 */
	@ApiField("to_pay_amount")
	private MultiCurrencyMoneyOpenApi toPayAmount;

	/**
	 * 未确认金额=已票金额-已认证
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

	public String getGuaranteeNoney() {
		return this.guaranteeNoney;
	}
	public void setGuaranteeNoney(String guaranteeNoney) {
		this.guaranteeNoney = guaranteeNoney;
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

	public String getPayContractDesc() {
		return this.payContractDesc;
	}
	public void setPayContractDesc(String payContractDesc) {
		this.payContractDesc = payContractDesc;
	}

	public String getPayContractItemNo() {
		return this.payContractItemNo;
	}
	public void setPayContractItemNo(String payContractItemNo) {
		this.payContractItemNo = payContractItemNo;
	}

	public MultiCurrencyMoneyOpenApi getPayableAmount() {
		return this.payableAmount;
	}
	public void setPayableAmount(MultiCurrencyMoneyOpenApi payableAmount) {
		this.payableAmount = payableAmount;
	}

	public String getRtNo() {
		return this.rtNo;
	}
	public void setRtNo(String rtNo) {
		this.rtNo = rtNo;
	}

	public String getSettleStatus() {
		return this.settleStatus;
	}
	public void setSettleStatus(String settleStatus) {
		this.settleStatus = settleStatus;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getStage() {
		return this.stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getTaxAccountNo() {
		return this.taxAccountNo;
	}
	public void setTaxAccountNo(String taxAccountNo) {
		this.taxAccountNo = taxAccountNo;
	}

	public String getTaxAddress() {
		return this.taxAddress;
	}
	public void setTaxAddress(String taxAddress) {
		this.taxAddress = taxAddress;
	}

	public MultiCurrencyMoneyOpenApi getTaxAmount() {
		return this.taxAmount;
	}
	public void setTaxAmount(MultiCurrencyMoneyOpenApi taxAmount) {
		this.taxAmount = taxAmount;
	}

	public String getTaxBankName() {
		return this.taxBankName;
	}
	public void setTaxBankName(String taxBankName) {
		this.taxBankName = taxBankName;
	}

	public String getTaxInvoiceTitle() {
		return this.taxInvoiceTitle;
	}
	public void setTaxInvoiceTitle(String taxInvoiceTitle) {
		this.taxInvoiceTitle = taxInvoiceTitle;
	}

	public String getTaxPhoneNo() {
		return this.taxPhoneNo;
	}
	public void setTaxPhoneNo(String taxPhoneNo) {
		this.taxPhoneNo = taxPhoneNo;
	}

	public String getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

	public String getTaxTaxNo() {
		return this.taxTaxNo;
	}
	public void setTaxTaxNo(String taxTaxNo) {
		this.taxTaxNo = taxTaxNo;
	}

	public String getTaxType() {
		return this.taxType;
	}
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	public String getTaxTypeDesc() {
		return this.taxTypeDesc;
	}
	public void setTaxTypeDesc(String taxTypeDesc) {
		this.taxTypeDesc = taxTypeDesc;
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
