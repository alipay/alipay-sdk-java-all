package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 荣耀待还款信息
 *
 * @author auto create
 * @since 1.0, 2025-09-01 17:26:23
 */
public class HonorRepayInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2769718291276274837L;

	/**
	 * 待还利息，单位：分
	 */
	@ApiField("interest")
	private String interest;

	/**
	 * 待还本金，单位：分
	 */
	@ApiField("principal")
	private String principal;

	/**
	 * 待还总额，单位：分
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getInterest() {
		return this.interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
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
