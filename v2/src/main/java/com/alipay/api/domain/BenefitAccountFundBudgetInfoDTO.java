package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益账户出入金渠道的资金和预算统计信息
 *
 * @author auto create
 * @since 1.0, 2026-09-24 16:28:18
 */
public class BenefitAccountFundBudgetInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 6372855126683362577L;

	/**
	 * 退回预算，实际可能未退资金，单位：元
	 */
	@ApiField("back_budget")
	private String backBudget;

	/**
	 * 退回资金，单位：元
	 */
	@ApiField("back_cash")
	private String backCash;

	/**
	 * 追加预算总额，实际可能没有真实入金；单位：元
	 */
	@ApiField("in_budget")
	private String inBudget;

	/**
	 * 入金金额，真实追加的资金，单位：元
	 */
	@ApiField("in_cash")
	private String inCash;

	public String getBackBudget() {
		return this.backBudget;
	}
	public void setBackBudget(String backBudget) {
		this.backBudget = backBudget;
	}

	public String getBackCash() {
		return this.backCash;
	}
	public void setBackCash(String backCash) {
		this.backCash = backCash;
	}

	public String getInBudget() {
		return this.inBudget;
	}
	public void setInBudget(String inBudget) {
		this.inBudget = inBudget;
	}

	public String getInCash() {
		return this.inCash;
	}
	public void setInCash(String inCash) {
		this.inCash = inCash;
	}

}
