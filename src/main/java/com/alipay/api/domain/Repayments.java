package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 还款计划
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class Repayments extends AlipayObject {

	private static final long serialVersionUID = 6112179584455691115L;

	/**
	 * 还款计划
	 */
	@ApiListField("installments")
	@ApiField("installments")
	private List<Installments> installments;

	/**
	 * 还款计划id
	 */
	@ApiField("repayment_id")
	private String repaymentId;

	public List<Installments> getInstallments() {
		return this.installments;
	}
	public void setInstallments(List<Installments> installments) {
		this.installments = installments;
	}

	public String getRepaymentId() {
		return this.repaymentId;
	}
	public void setRepaymentId(String repaymentId) {
		this.repaymentId = repaymentId;
	}

}
