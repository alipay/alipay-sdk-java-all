package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 付款计划行信息
 *
 * @author auto create
 * @since 1.0, 2023-09-15 09:58:58
 */
public class PaymentPlanItemDTO extends AlipayObject {

	private static final long serialVersionUID = 7749919755333431944L;

	/**
	 * 废弃 当前字段已废弃(不支持json字段的信息透出)
	 */
	@ApiField("ext")
	@Deprecated
	private String ext;

	/**
	 * 本条款的摘要信息
	 */
	@ApiField("item_digest_cn")
	private String itemDigestCn;

	/**
	 * 本条款的摘要信息 英文
	 */
	@ApiField("item_digest_en")
	private String itemDigestEn;

	/**
	 * 条款行类型
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 是否有票
	 */
	@ApiField("need_invoice")
	private String needInvoice;

	/**
	 * 付款申请日期
	 */
	@ApiField("pay_apply_date")
	private Date payApplyDate;

	/**
	 * 付款参照类型
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
	 */
	@ApiField("pay_term_type")
	private String payTermType;

	/**
	 * 付款金额
	 */
	@ApiField("payment_amount")
	private String paymentAmount;

	/**
	 * 付款比例
	 */
	@ApiField("payment_percent")
	private String paymentPercent;

	/**
	 * 条款明细行ID
	 */
	@ApiField("payment_plan_item_id")
	private String paymentPlanItemId;

	/**
	 * 阶段
	 */
	@ApiField("phase")
	private Long phase;

	/**
	 * 条款内容
	 */
	@ApiField("terms")
	private String terms;

	public String getExt() {
		return this.ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getItemDigestCn() {
		return this.itemDigestCn;
	}
	public void setItemDigestCn(String itemDigestCn) {
		this.itemDigestCn = itemDigestCn;
	}

	public String getItemDigestEn() {
		return this.itemDigestEn;
	}
	public void setItemDigestEn(String itemDigestEn) {
		this.itemDigestEn = itemDigestEn;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getNeedInvoice() {
		return this.needInvoice;
	}
	public void setNeedInvoice(String needInvoice) {
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

	public String getPaymentPercent() {
		return this.paymentPercent;
	}
	public void setPaymentPercent(String paymentPercent) {
		this.paymentPercent = paymentPercent;
	}

	public String getPaymentPlanItemId() {
		return this.paymentPlanItemId;
	}
	public void setPaymentPlanItemId(String paymentPlanItemId) {
		this.paymentPlanItemId = paymentPlanItemId;
	}

	public Long getPhase() {
		return this.phase;
	}
	public void setPhase(Long phase) {
		this.phase = phase;
	}

	public String getTerms() {
		return this.terms;
	}
	public void setTerms(String terms) {
		this.terms = terms;
	}

}
