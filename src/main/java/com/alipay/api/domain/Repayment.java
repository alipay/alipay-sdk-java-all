package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户还款计划
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class Repayment extends AlipayObject {

	private static final long serialVersionUID = 1493872112585489295L;

	/**
	 * 某一还款计划下的分期数据
	 */
	@ApiListField("installments")
	@ApiField("installment")
	private List<Installment> installments;

	/**
	 * 用户在合作伙伴处产生的还款计划id
	 */
	@ApiField("repayment_id")
	private String repaymentId;

	public List<Installment> getInstallments() {
		return this.installments;
	}
	public void setInstallments(List<Installment> installments) {
		this.installments = installments;
	}

	public String getRepaymentId() {
		return this.repaymentId;
	}
	public void setRepaymentId(String repaymentId) {
		this.repaymentId = repaymentId;
	}

}
