package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PreRepayPlanTermVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.budget.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayPcreditLoanBudgetQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7578598595729612478L;

	/** 
	 * 贷前还款分期计划列表
	 */
	@ApiListField("pre_repay_plan_term_list")
	@ApiField("pre_repay_plan_term_v_o")
	private List<PreRepayPlanTermVO> preRepayPlanTermList;

	/** 
	 * 应还总额=应还本金+应还利息
	 */
	@ApiField("repay_amt_total")
	private String repayAmtTotal;

	/** 
	 * 应还利息总额
	 */
	@ApiField("repay_int_amt_total")
	private String repayIntAmtTotal;

	/** 
	 * 应还本金总额
	 */
	@ApiField("repay_prin_amt_total")
	private String repayPrinAmtTotal;

	public void setPreRepayPlanTermList(List<PreRepayPlanTermVO> preRepayPlanTermList) {
		this.preRepayPlanTermList = preRepayPlanTermList;
	}
	public List<PreRepayPlanTermVO> getPreRepayPlanTermList( ) {
		return this.preRepayPlanTermList;
	}

	public void setRepayAmtTotal(String repayAmtTotal) {
		this.repayAmtTotal = repayAmtTotal;
	}
	public String getRepayAmtTotal( ) {
		return this.repayAmtTotal;
	}

	public void setRepayIntAmtTotal(String repayIntAmtTotal) {
		this.repayIntAmtTotal = repayIntAmtTotal;
	}
	public String getRepayIntAmtTotal( ) {
		return this.repayIntAmtTotal;
	}

	public void setRepayPrinAmtTotal(String repayPrinAmtTotal) {
		this.repayPrinAmtTotal = repayPrinAmtTotal;
	}
	public String getRepayPrinAmtTotal( ) {
		return this.repayPrinAmtTotal;
	}

}
