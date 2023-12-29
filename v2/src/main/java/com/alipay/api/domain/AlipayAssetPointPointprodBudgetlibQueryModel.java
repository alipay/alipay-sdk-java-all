package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集分宝预算库查询
 *
 * @author auto create
 * @since 1.0, 2022-10-12 19:35:23
 */
public class AlipayAssetPointPointprodBudgetlibQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4829558946581186726L;

	/**
	 * 预算库编码
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
