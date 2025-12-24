package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分期账单合并
 *
 * @author auto create
 * @since 1.0, 2024-12-02 17:42:07
 */
public class MergedInstallmentBill extends AlipayObject {

	private static final long serialVersionUID = 8626766567799925885L;

	/**
	 * 会计日
	 */
	@ApiField("accounting_date")
	private Date accountingDate;

	/**
	 * 合并账单的还款日。到期、未来期的时候需要返回（格式yyyy-MM-dd HH:mm:ss）
	 */
	@ApiField("installment_end_date")
	private Date installmentEndDate;

	/**
	 * 应还利息，单位元，保留两位小数
	 */
	@ApiField("unpaid_interest")
	private String unpaidInterest;

	/**
	 * 应还罚息，单位元，保留2位小数
	 */
	@ApiField("unpaid_penalty")
	private String unpaidPenalty;

	/**
	 * 应还本金，单位元，保留小数点后两位
	 */
	@ApiField("unpaid_principal")
	private String unpaidPrincipal;

	/**
	 * 应还总金额，单位元，保留小数点后两位
	 */
	@ApiField("unpaid_total_amount")
	private String unpaidTotalAmount;

	public Date getAccountingDate() {
		return this.accountingDate;
	}
	public void setAccountingDate(Date accountingDate) {
		this.accountingDate = accountingDate;
	}

	public Date getInstallmentEndDate() {
		return this.installmentEndDate;
	}
	public void setInstallmentEndDate(Date installmentEndDate) {
		this.installmentEndDate = installmentEndDate;
	}

	public String getUnpaidInterest() {
		return this.unpaidInterest;
	}
	public void setUnpaidInterest(String unpaidInterest) {
		this.unpaidInterest = unpaidInterest;
	}

	public String getUnpaidPenalty() {
		return this.unpaidPenalty;
	}
	public void setUnpaidPenalty(String unpaidPenalty) {
		this.unpaidPenalty = unpaidPenalty;
	}

	public String getUnpaidPrincipal() {
		return this.unpaidPrincipal;
	}
	public void setUnpaidPrincipal(String unpaidPrincipal) {
		this.unpaidPrincipal = unpaidPrincipal;
	}

	public String getUnpaidTotalAmount() {
		return this.unpaidTotalAmount;
	}
	public void setUnpaidTotalAmount(String unpaidTotalAmount) {
		this.unpaidTotalAmount = unpaidTotalAmount;
	}

}
