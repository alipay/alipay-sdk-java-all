package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 随身贷借据查询返回的分期详情列表对象
 *
 * @author auto create
 * @since 1.0, 2024-12-02 17:42:13
 */
public class LendInstallment extends AlipayObject {

	private static final long serialVersionUID = 3818559627391465828L;

	/**
	 * 分期结束时间
	 */
	@ApiField("installment_end_date")
	private Date installmentEndDate;

	/**
	 * 分期期次
	 */
	@ApiField("installment_no")
	private Long installmentNo;

	/**
	 * 分期结清时间
	 */
	@ApiField("settle_time")
	private Date settleTime;

	/**
	 * 该期次贷款状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 该期剩余应还利息，单位元，保留两位小数
	 */
	@ApiField("unpaid_interest")
	private String unpaidInterest;

	/**
	 * 该期剩余应还罚息
	 */
	@ApiField("unpaid_penalty")
	private String unpaidPenalty;

	/**
	 * 该期剩余应还本金
	 */
	@ApiField("unpaid_principal")
	private String unpaidPrincipal;

	public Date getInstallmentEndDate() {
		return this.installmentEndDate;
	}
	public void setInstallmentEndDate(Date installmentEndDate) {
		this.installmentEndDate = installmentEndDate;
	}

	public Long getInstallmentNo() {
		return this.installmentNo;
	}
	public void setInstallmentNo(Long installmentNo) {
		this.installmentNo = installmentNo;
	}

	public Date getSettleTime() {
		return this.settleTime;
	}
	public void setSettleTime(Date settleTime) {
		this.settleTime = settleTime;
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

}
