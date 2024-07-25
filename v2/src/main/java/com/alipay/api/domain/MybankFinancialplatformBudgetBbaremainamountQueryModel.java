package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 网商BBA可用/剩余金额查询
 *
 * @author auto create
 * @since 1.0, 2023-02-08 12:44:04
 */
public class MybankFinancialplatformBudgetBbaremainamountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2654745935668897734L;

	/**
	 * 业务预算申请Code
	 */
	@ApiField("biz_budget_apply_code")
	private String bizBudgetApplyCode;

	public String getBizBudgetApplyCode() {
		return this.bizBudgetApplyCode;
	}
	public void setBizBudgetApplyCode(String bizBudgetApplyCode) {
		this.bizBudgetApplyCode = bizBudgetApplyCode;
	}

}
