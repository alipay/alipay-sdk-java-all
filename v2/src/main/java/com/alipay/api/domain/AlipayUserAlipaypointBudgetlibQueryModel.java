package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询集分宝预算库详情
 *
 * @author auto create
 * @since 1.0, 2024-01-16 10:57:11
 */
public class AlipayUserAlipaypointBudgetlibQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1696976141154732723L;

	/**
	 * 集分宝预算库编码
	 */
	@ApiField("budget_code")
	private String budgetCode;

	public String getBudgetCode() {
		return this.budgetCode;
	}
	public void setBudgetCode(String budgetCode) {
		this.budgetCode = budgetCode;
	}

}
