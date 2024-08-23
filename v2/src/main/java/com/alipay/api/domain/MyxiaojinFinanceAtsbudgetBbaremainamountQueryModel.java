package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ats消金BBA可用/剩余金额查询
 *
 * @author auto create
 * @since 1.0, 2023-04-11 09:42:55
 */
public class MyxiaojinFinanceAtsbudgetBbaremainamountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8789459979335123768L;

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
