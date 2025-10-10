package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 分期账单
 *
 * @author auto create
 * @since 1.0, 2024-12-02 17:42:07
 */
public class InstallmentBill extends AlipayObject {

	private static final long serialVersionUID = 6118144747563255627L;

	/**
	 * 合并分期到期日
	 */
	@ApiField("installment_end_date")
	private Date installmentEndDate;

	/**
	 * 分期信息
	 */
	@ApiListField("installment_list")
	@ApiField("installment_v_o")
	private List<InstallmentVO> installmentList;

	/**
	 * 分期状态，NEW - 正常 OVERDUE - 逾期 SETTLED - 结清
	 */
	@ApiField("status")
	private String status;

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
	 * 应还本金
	 */
	@ApiField("unpaid_principal")
	private String unpaidPrincipal;

	/**
	 * 应还总金额，单位元，保留小数点后两位
	 */
	@ApiField("unpaid_total_amount")
	private String unpaidTotalAmount;

	public Date getInstallmentEndDate() {
		return this.installmentEndDate;
	}
	public void setInstallmentEndDate(Date installmentEndDate) {
		this.installmentEndDate = installmentEndDate;
	}

	public List<InstallmentVO> getInstallmentList() {
		return this.installmentList;
	}
	public void setInstallmentList(List<InstallmentVO> installmentList) {
		this.installmentList = installmentList;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
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
