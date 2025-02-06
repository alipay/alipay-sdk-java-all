package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序商品券创建
 *
 * @author auto create
 * @since 1.0, 2024-08-19 21:18:49
 */
public class AlipayMarketingToolActivityAppitemvoucherCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2376349588654396915L;

	/**
	 * 活动基本信息
	 */
	@ApiField("app_item_activity_base_info")
	private AppItemActivityBaseInfo appItemActivityBaseInfo;

	/**
	 * 券可用范围
	 */
	@ApiField("app_item_voucher_available_scope_info")
	private AppItemVoucherAvailableScopeInfo appItemVoucherAvailableScopeInfo;

	/**
	 * 券出资方式
	 */
	@ApiField("app_item_voucher_budget_supply_info")
	private AppItemVoucherBudgetSupplyInfo appItemVoucherBudgetSupplyInfo;

	/**
	 * 引导信息
	 */
	@ApiField("app_item_voucher_customer_guide_info")
	private AppItemVoucherCustomerGuideInfo appItemVoucherCustomerGuideInfo;

	/**
	 * 券优惠信息
	 */
	@ApiField("app_item_voucher_deduct_info")
	private AppItemVoucherDeductInfo appItemVoucherDeductInfo;

	/**
	 * 券展示方式
	 */
	@ApiField("app_item_voucher_display_pattern_info")
	private AppItemVoucherDisplayPatternInfo appItemVoucherDisplayPatternInfo;

	/**
	 * 券发放方式
	 */
	@ApiField("app_item_voucher_send_mode_info")
	private AppItemVoucherSendModeInfo appItemVoucherSendModeInfo;

	/**
	 * 券核销规则
	 */
	@ApiField("app_item_voucher_use_rule_info")
	private AppItemVoucherUseRuleInfo appItemVoucherUseRuleInfo;

	/**
	 * 外部业务单号，用作幂等控制。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public AppItemActivityBaseInfo getAppItemActivityBaseInfo() {
		return this.appItemActivityBaseInfo;
	}
	public void setAppItemActivityBaseInfo(AppItemActivityBaseInfo appItemActivityBaseInfo) {
		this.appItemActivityBaseInfo = appItemActivityBaseInfo;
	}

	public AppItemVoucherAvailableScopeInfo getAppItemVoucherAvailableScopeInfo() {
		return this.appItemVoucherAvailableScopeInfo;
	}
	public void setAppItemVoucherAvailableScopeInfo(AppItemVoucherAvailableScopeInfo appItemVoucherAvailableScopeInfo) {
		this.appItemVoucherAvailableScopeInfo = appItemVoucherAvailableScopeInfo;
	}

	public AppItemVoucherBudgetSupplyInfo getAppItemVoucherBudgetSupplyInfo() {
		return this.appItemVoucherBudgetSupplyInfo;
	}
	public void setAppItemVoucherBudgetSupplyInfo(AppItemVoucherBudgetSupplyInfo appItemVoucherBudgetSupplyInfo) {
		this.appItemVoucherBudgetSupplyInfo = appItemVoucherBudgetSupplyInfo;
	}

	public AppItemVoucherCustomerGuideInfo getAppItemVoucherCustomerGuideInfo() {
		return this.appItemVoucherCustomerGuideInfo;
	}
	public void setAppItemVoucherCustomerGuideInfo(AppItemVoucherCustomerGuideInfo appItemVoucherCustomerGuideInfo) {
		this.appItemVoucherCustomerGuideInfo = appItemVoucherCustomerGuideInfo;
	}

	public AppItemVoucherDeductInfo getAppItemVoucherDeductInfo() {
		return this.appItemVoucherDeductInfo;
	}
	public void setAppItemVoucherDeductInfo(AppItemVoucherDeductInfo appItemVoucherDeductInfo) {
		this.appItemVoucherDeductInfo = appItemVoucherDeductInfo;
	}

	public AppItemVoucherDisplayPatternInfo getAppItemVoucherDisplayPatternInfo() {
		return this.appItemVoucherDisplayPatternInfo;
	}
	public void setAppItemVoucherDisplayPatternInfo(AppItemVoucherDisplayPatternInfo appItemVoucherDisplayPatternInfo) {
		this.appItemVoucherDisplayPatternInfo = appItemVoucherDisplayPatternInfo;
	}

	public AppItemVoucherSendModeInfo getAppItemVoucherSendModeInfo() {
		return this.appItemVoucherSendModeInfo;
	}
	public void setAppItemVoucherSendModeInfo(AppItemVoucherSendModeInfo appItemVoucherSendModeInfo) {
		this.appItemVoucherSendModeInfo = appItemVoucherSendModeInfo;
	}

	public AppItemVoucherUseRuleInfo getAppItemVoucherUseRuleInfo() {
		return this.appItemVoucherUseRuleInfo;
	}
	public void setAppItemVoucherUseRuleInfo(AppItemVoucherUseRuleInfo appItemVoucherUseRuleInfo) {
		this.appItemVoucherUseRuleInfo = appItemVoucherUseRuleInfo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
