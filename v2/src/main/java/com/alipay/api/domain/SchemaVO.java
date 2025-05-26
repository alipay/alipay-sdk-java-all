package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 贷款产品方案
 *
 * @author auto create
 * @since 1.0, 2018-11-13 19:45:48
 */
public class SchemaVO extends AlipayObject {

	private static final long serialVersionUID = 3891722315485396666L;

	/**
	 * 风险日利率
	 */
	@ApiField("daily_risk_int_rate")
	private String dailyRiskIntRate;

	/**
	 * 最大申请金额
	 */
	@ApiField("max_apply_amt")
	private String maxApplyAmt;

	/**
	 * 最小申请金额
	 */
	@ApiField("min_apply_amt")
	private String minApplyAmt;

	/**
	 * 支持的还款方式列表，取值{1, 3, 6}：1-等额本息; 3-按期付息到期还本;  6-到期一次性还本付息;
	 */
	@ApiListField("repay_mode_list")
	@ApiField("string")
	private List<String> repayModeList;

	/**
	 * 支持的还款期限列表
	 */
	@ApiListField("term_list")
	@ApiField("loan_term")
	private List<LoanTerm> termList;

	public String getDailyRiskIntRate() {
		return this.dailyRiskIntRate;
	}
	public void setDailyRiskIntRate(String dailyRiskIntRate) {
		this.dailyRiskIntRate = dailyRiskIntRate;
	}

	public String getMaxApplyAmt() {
		return this.maxApplyAmt;
	}
	public void setMaxApplyAmt(String maxApplyAmt) {
		this.maxApplyAmt = maxApplyAmt;
	}

	public String getMinApplyAmt() {
		return this.minApplyAmt;
	}
	public void setMinApplyAmt(String minApplyAmt) {
		this.minApplyAmt = minApplyAmt;
	}

	public List<String> getRepayModeList() {
		return this.repayModeList;
	}
	public void setRepayModeList(List<String> repayModeList) {
		this.repayModeList = repayModeList;
	}

	public List<LoanTerm> getTermList() {
		return this.termList;
	}
	public void setTermList(List<LoanTerm> termList) {
		this.termList = termList;
	}

}
