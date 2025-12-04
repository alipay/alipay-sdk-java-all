package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 付款条款明细
 *
 * @author auto create
 * @since 1.0, 2022-09-30 14:20:14
 */
public class PayContractItemDTO extends AlipayObject {

	private static final long serialVersionUID = 3858747553919532436L;

	/**
	 * 付款条款描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 计划行号会用于发起付款时进行作为幂等字段
	 */
	@ApiField("item_no")
	private String itemNo;

	/**
	 * 后付款:POSTPAY_MONEY,
先付款 :PREPAY_MONEY,
质量保证金 :GUARANTEE_MONEY,
预付款 :ADVANCE_MONEY;
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 是否需要审批，建议必选
	 */
	@ApiField("need_audit")
	private Boolean needAudit;

	/**
	 * 是否有票
	 */
	@ApiField("need_invoice")
	private Boolean needInvoice;

	/**
	 * 付款申请时间
	 */
	@ApiField("pay_apply_date")
	private Date payApplyDate;

	/**
	 * 付款日期类型，
票到日 ：INVOICE_ARV_DATE
供方开票日 ：INVOICE_BILL_DATE
货到日 ：RCV_DATE
无票 ：NONE
	 */
	@ApiField("pay_ref_type")
	private String payRefType;

	/**
	 * 付款期限
	 */
	@ApiField("pay_term")
	private Long payTerm;

	/**
	 * 付款期限类型
工作日-WORKING_DAY
自然日-CALENDAR_DAY
	 */
	@ApiField("pay_term_type")
	private String payTermType;

	/**
	 * 付款金额-元
	 */
	@ApiField("payment_amount")
	private String paymentAmount;

	/**
	 * 付款阶段
	 */
	@ApiField("phase")
	private String phase;

	/**
	 * 条款描述内容
	 */
	@ApiField("terms")
	private String terms;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
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

	public Date getPayApplyDate() {
		return this.payApplyDate;
	}
	public void setPayApplyDate(Date payApplyDate) {
		this.payApplyDate = payApplyDate;
	}

	public String getPayRefType() {
		return this.payRefType;
	}
	public void setPayRefType(String payRefType) {
		this.payRefType = payRefType;
	}

	public Long getPayTerm() {
		return this.payTerm;
	}
	public void setPayTerm(Long payTerm) {
		this.payTerm = payTerm;
	}

	public String getPayTermType() {
		return this.payTermType;
	}
	public void setPayTermType(String payTermType) {
		this.payTermType = payTermType;
	}

	public String getPaymentAmount() {
		return this.paymentAmount;
	}
	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getPhase() {
		return this.phase;
	}
	public void setPhase(String phase) {
		this.phase = phase;
	}

	public String getTerms() {
		return this.terms;
	}
	public void setTerms(String terms) {
		this.terms = terms;
	}

}
