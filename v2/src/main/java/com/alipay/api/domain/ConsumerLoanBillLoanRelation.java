package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消费贷还款账单借据关系
 *
 * @author auto create
 * @since 1.0, 2025-04-03 10:14:19
 */
public class ConsumerLoanBillLoanRelation extends AlipayObject {

	private static final long serialVersionUID = 6115982939631298514L;

	/**
	 * 机构借据号
	 */
	@ApiField("loan_id")
	private String loanId;

	/**
	 * 当前账单在对应借据里的期号
	 */
	@ApiField("period_no")
	private Long periodNo;

	public String getLoanId() {
		return this.loanId;
	}
	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}

	public Long getPeriodNo() {
		return this.periodNo;
	}
	public void setPeriodNo(Long periodNo) {
		this.periodNo = periodNo;
	}

}
