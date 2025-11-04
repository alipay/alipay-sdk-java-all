package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 借款记录
 *
 * @author auto create
 * @since 1.0, 2025-09-01 17:06:18
 */
public class HonorLoanRecordDTO extends AlipayObject {

	private static final long serialVersionUID = 8641244814675564843L;

	/**
	 * 借款申请日期（用户申请时间）, yyyyMMdd
	 */
	@ApiField("apply_date")
	private String applyDate;

	/**
	 * 荣耀侧借款申请订单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 借款申请时间，毫秒
	 */
	@ApiField("apply_time")
	private Long applyTime;

	/**
	 * 借款金额，单位：分
	 */
	@ApiField("loan_amount")
	private String loanAmount;

	/**
	 * 蚂蚁侧借款订单单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 借款状态，1-申请中，2-正常还款中，3-已逾期，4-已结清，5-借款失败
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 借款期数
	 */
	@ApiField("total_term")
	private Long totalTerm;

	public String getApplyDate() {
		return this.applyDate;
	}
	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public Long getApplyTime() {
		return this.applyTime;
	}
	public void setApplyTime(Long applyTime) {
		this.applyTime = applyTime;
	}

	public String getLoanAmount() {
		return this.loanAmount;
	}
	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getTotalTerm() {
		return this.totalTerm;
	}
	public void setTotalTerm(Long totalTerm) {
		this.totalTerm = totalTerm;
	}

}
