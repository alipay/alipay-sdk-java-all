package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动预算信息
 *
 * @author auto create
 * @since 1.0, 2023-06-20 18:17:32
 */
public class DtBankBudgetInfo extends AlipayObject {

	private static final long serialVersionUID = 3381619681983461887L;

	/**
	 * 活动预算配置信息
	 */
	@ApiField("budget_config_info")
	private DtBankBudgetConfigInfo budgetConfigInfo;

	/**
	 * 活动预算实时信息，发布之后的活动有值，已创建未发布的活动为空
	 */
	@ApiField("budget_real_time_info")
	private DtBankBudgetRealTimeInfo budgetRealTimeInfo;

	public DtBankBudgetConfigInfo getBudgetConfigInfo() {
		return this.budgetConfigInfo;
	}
	public void setBudgetConfigInfo(DtBankBudgetConfigInfo budgetConfigInfo) {
		this.budgetConfigInfo = budgetConfigInfo;
	}

	public DtBankBudgetRealTimeInfo getBudgetRealTimeInfo() {
		return this.budgetRealTimeInfo;
	}
	public void setBudgetRealTimeInfo(DtBankBudgetRealTimeInfo budgetRealTimeInfo) {
		this.budgetRealTimeInfo = budgetRealTimeInfo;
	}

}
