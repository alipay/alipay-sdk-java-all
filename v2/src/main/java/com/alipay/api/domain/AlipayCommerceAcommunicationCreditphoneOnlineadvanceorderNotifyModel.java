package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用购在线提前结清测算单结果通知
 *
 * @author auto create
 * @since 1.0, 2026-04-15 20:57:45
 */
public class AlipayCommerceAcommunicationCreditphoneOnlineadvanceorderNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 2695841769668447696L;

	/**
	 * 支付宝在线提前结清测算单号
	 */
	@ApiField("alipay_online_advance_pay_order_no")
	private String alipayOnlineAdvancePayOrderNo;

	/**
	 * 减免金额，单位元
	 */
	@ApiField("deduction_amount")
	private String deductionAmount;

	/**
	 * 无测算结果原因
	 */
	@ApiField("evaluate_fail_reason")
	private String evaluateFailReason;

	/**
	 * 是否有测算结果
	 */
	@ApiField("evaluate_success")
	private Boolean evaluateSuccess;

	/**
	 * 罚息，单位 元
	 */
	@ApiField("fine_interest")
	private String fineInterest;

	/**
	 * 手续费，单位 元
	 */
	@ApiField("handling_fee")
	private String handlingFee;

	/**
	 * 机构侧测算单号
	 */
	@ApiField("inst_pay_order_no")
	private String instPayOrderNo;

	/**
	 * 应还利息，单位 元
	 */
	@ApiField("interest")
	private String interest;

	/**
	 * 开放下次测算时间
	 */
	@ApiField("next_retry_time")
	private Date nextRetryTime;

	/**
	 * 支付链接，一般是支付宝小程序链接
	 */
	@ApiField("pay_link_url")
	private String payLinkUrl;

	/**
	 * 应还本金，单位 元
	 */
	@ApiField("principal")
	private String principal;

	/**
	 * 应还总额，单位 元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getAlipayOnlineAdvancePayOrderNo() {
		return this.alipayOnlineAdvancePayOrderNo;
	}
	public void setAlipayOnlineAdvancePayOrderNo(String alipayOnlineAdvancePayOrderNo) {
		this.alipayOnlineAdvancePayOrderNo = alipayOnlineAdvancePayOrderNo;
	}

	public String getDeductionAmount() {
		return this.deductionAmount;
	}
	public void setDeductionAmount(String deductionAmount) {
		this.deductionAmount = deductionAmount;
	}

	public String getEvaluateFailReason() {
		return this.evaluateFailReason;
	}
	public void setEvaluateFailReason(String evaluateFailReason) {
		this.evaluateFailReason = evaluateFailReason;
	}

	public Boolean getEvaluateSuccess() {
		return this.evaluateSuccess;
	}
	public void setEvaluateSuccess(Boolean evaluateSuccess) {
		this.evaluateSuccess = evaluateSuccess;
	}

	public String getFineInterest() {
		return this.fineInterest;
	}
	public void setFineInterest(String fineInterest) {
		this.fineInterest = fineInterest;
	}

	public String getHandlingFee() {
		return this.handlingFee;
	}
	public void setHandlingFee(String handlingFee) {
		this.handlingFee = handlingFee;
	}

	public String getInstPayOrderNo() {
		return this.instPayOrderNo;
	}
	public void setInstPayOrderNo(String instPayOrderNo) {
		this.instPayOrderNo = instPayOrderNo;
	}

	public String getInterest() {
		return this.interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}

	public Date getNextRetryTime() {
		return this.nextRetryTime;
	}
	public void setNextRetryTime(Date nextRetryTime) {
		this.nextRetryTime = nextRetryTime;
	}

	public String getPayLinkUrl() {
		return this.payLinkUrl;
	}
	public void setPayLinkUrl(String payLinkUrl) {
		this.payLinkUrl = payLinkUrl;
	}

	public String getPrincipal() {
		return this.principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
