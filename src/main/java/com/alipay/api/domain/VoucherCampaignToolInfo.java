package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券营销工具结构体
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class VoucherCampaignToolInfo extends AlipayObject {

	private static final long serialVersionUID = 4278193151668331619L;

	/**
	 * 预算信息
	 */
	@ApiField("budget_info")
	private BudgetInfo budgetInfo;

	/**
	 * 获取规则
	 */
	@ApiField("get_rule")
	private GetRuleInfo getRule;

	/**
	 * 券信息
	 */
	@ApiField("voucher_info")
	private VoucherInfo voucherInfo;

	public BudgetInfo getBudgetInfo() {
		return this.budgetInfo;
	}
	public void setBudgetInfo(BudgetInfo budgetInfo) {
		this.budgetInfo = budgetInfo;
	}

	public GetRuleInfo getGetRule() {
		return this.getRule;
	}
	public void setGetRule(GetRuleInfo getRule) {
		this.getRule = getRule;
	}

	public VoucherInfo getVoucherInfo() {
		return this.voucherInfo;
	}
	public void setVoucherInfo(VoucherInfo voucherInfo) {
		this.voucherInfo = voucherInfo;
	}

}
