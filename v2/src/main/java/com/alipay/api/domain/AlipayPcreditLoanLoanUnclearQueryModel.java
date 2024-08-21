package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询待还账单
 *
 * @author auto create
 * @since 1.0, 2018-11-14 14:27:40
 */
public class AlipayPcreditLoanLoanUnclearQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5653969426578745814L;

	/**
	 * 预算类型，取值{CLEAR, OVD_AND_CURRENT}：CLEAR-结清预算, OVD_AND_CURRENT-逾期和当期预算
	 */
	@ApiField("budget_type")
	private String budgetType;

	/**
	 * 代表了一次请求，作为业务幂等性控制
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public String getBudgetType() {
		return this.budgetType;
	}
	public void setBudgetType(String budgetType) {
		this.budgetType = budgetType;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}
