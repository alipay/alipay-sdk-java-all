package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用支付还款视图
 *
 * @author auto create
 * @since 1.0, 2019-07-12 14:25:37
 */
public class CreditPayRepayVO extends AlipayObject {

	private static final long serialVersionUID = 2334919599848611669L;

	/**
	 * 首期合并天数，如果距离本月还款日不足首期合并天数，将推迟到下个月还款
	 */
	@ApiField("first_merge_day")
	private String firstMergeDay;

	/**
	 * 统一还款日，每个月的哪一天还
	 */
	@ApiField("repay_day")
	private String repayDay;

	/**
	 * 还款文案
	 */
	@ApiField("repay_desc")
	private String repayDesc;

	/**
	 * 1=EQUAL_LOAN_PAYMENT=等额本息,2=EQUAL_PRIN_PAYMENT=等额本金,3=PAY_INT_ON_SHCED_PAY_PRIN_AT_DUE_DAY=组合还款,4=MIX_PAYMENT=组合还款,6=DUE_PRIN_PLUS_INT=一次性到期还本付息,7=AVG_CAP_PLUS_INT_BY_TERM=固定利息等额分期,8=EQUAL_PRIN_EQUAL_PAYMENT=等本等费
	 */
	@ApiField("repay_mode")
	private String repayMode;

	public String getFirstMergeDay() {
		return this.firstMergeDay;
	}
	public void setFirstMergeDay(String firstMergeDay) {
		this.firstMergeDay = firstMergeDay;
	}

	public String getRepayDay() {
		return this.repayDay;
	}
	public void setRepayDay(String repayDay) {
		this.repayDay = repayDay;
	}

	public String getRepayDesc() {
		return this.repayDesc;
	}
	public void setRepayDesc(String repayDesc) {
		this.repayDesc = repayDesc;
	}

	public String getRepayMode() {
		return this.repayMode;
	}
	public void setRepayMode(String repayMode) {
		this.repayMode = repayMode;
	}

}
