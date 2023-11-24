package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * BBA可用/剩余金额查询
 *
 * @author auto create
 * @since 1.0, 2021-06-03 15:47:40
 */
public class AlipayBossFncAntbudgetBbaremainamountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3157632644226448991L;

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
