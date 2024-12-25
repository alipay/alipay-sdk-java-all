package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消金BBA可用/剩余金额查询
 *
 * @author auto create
 * @since 1.0, 2023-01-13 14:37:20
 */
public class MyxiaojinFinanceBudgetBbaremainamountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5322654737149945347L;

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
