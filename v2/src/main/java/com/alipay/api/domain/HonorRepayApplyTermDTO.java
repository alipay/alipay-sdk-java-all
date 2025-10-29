package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 荣耀还款期次
 *
 * @author auto create
 * @since 1.0, 2025-09-01 16:43:16
 */
public class HonorRepayApplyTermDTO extends AlipayObject {

	private static final long serialVersionUID = 2767993441851629152L;

	/**
	 * 本期还款总额，单位：分
	 */
	@ApiField("term_amount")
	private String termAmount;

	/**
	 * 本期还款利息，单位：分
	 */
	@ApiField("term_interest")
	private String termInterest;

	/**
	 * 期次
	 */
	@ApiField("term_no")
	private Long termNo;

	/**
	 * 本期还款罚息，单位：分
	 */
	@ApiField("term_penalty")
	private String termPenalty;

	/**
	 * 本期还款本金，单位：分
	 */
	@ApiField("term_principal")
	private String termPrincipal;

	public String getTermAmount() {
		return this.termAmount;
	}
	public void setTermAmount(String termAmount) {
		this.termAmount = termAmount;
	}

	public String getTermInterest() {
		return this.termInterest;
	}
	public void setTermInterest(String termInterest) {
		this.termInterest = termInterest;
	}

	public Long getTermNo() {
		return this.termNo;
	}
	public void setTermNo(Long termNo) {
		this.termNo = termNo;
	}

	public String getTermPenalty() {
		return this.termPenalty;
	}
	public void setTermPenalty(String termPenalty) {
		this.termPenalty = termPenalty;
	}

	public String getTermPrincipal() {
		return this.termPrincipal;
	}
	public void setTermPrincipal(String termPrincipal) {
		this.termPrincipal = termPrincipal;
	}

}
