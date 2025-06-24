package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AppItemActivityQueryBaseInfo;
import com.alipay.api.domain.AppItemVoucherQueryBudgetSupplyInfo;
import com.alipay.api.domain.AppItemVoucherQueryCustomerGuideInfo;
import com.alipay.api.domain.AppItemVoucherQueryDeductInfo;
import com.alipay.api.domain.AppItemVoucherQueryDisplayPatternInfo;
import com.alipay.api.domain.AppItemVoucherQuerySendModeInfo;
import com.alipay.api.domain.AppItemVoucherQueryUseRuleInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.activity.appitemvoucher.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-16 15:22:07
 */
public class AlipayMarketingToolActivityAppitemvoucherQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6463817734136348969L;

	/** 
	 * 活动基础信息
	 */
	@ApiField("app_item_activity_base_info")
	private AppItemActivityQueryBaseInfo appItemActivityBaseInfo;

	/** 
	 * 券出资方式
	 */
	@ApiField("app_item_voucher_budget_supply_info")
	private AppItemVoucherQueryBudgetSupplyInfo appItemVoucherBudgetSupplyInfo;

	/** 
	 * 引导信息
	 */
	@ApiField("app_item_voucher_customer_guide_info")
	private AppItemVoucherQueryCustomerGuideInfo appItemVoucherCustomerGuideInfo;

	/** 
	 * 券优惠信息
	 */
	@ApiField("app_item_voucher_deduct_info")
	private AppItemVoucherQueryDeductInfo appItemVoucherDeductInfo;

	/** 
	 * 券展示信息
	 */
	@ApiField("app_item_voucher_display_pattern_info")
	private AppItemVoucherQueryDisplayPatternInfo appItemVoucherDisplayPatternInfo;

	/** 
	 * 券发放信息
	 */
	@ApiField("app_item_voucher_send_mode_info")
	private AppItemVoucherQuerySendModeInfo appItemVoucherSendModeInfo;

	/** 
	 * 券核销规则
	 */
	@ApiField("app_item_voucher_use_rule_info")
	private AppItemVoucherQueryUseRuleInfo appItemVoucherUseRuleInfo;

	public void setAppItemActivityBaseInfo(AppItemActivityQueryBaseInfo appItemActivityBaseInfo) {
		this.appItemActivityBaseInfo = appItemActivityBaseInfo;
	}
	public AppItemActivityQueryBaseInfo getAppItemActivityBaseInfo( ) {
		return this.appItemActivityBaseInfo;
	}

	public void setAppItemVoucherBudgetSupplyInfo(AppItemVoucherQueryBudgetSupplyInfo appItemVoucherBudgetSupplyInfo) {
		this.appItemVoucherBudgetSupplyInfo = appItemVoucherBudgetSupplyInfo;
	}
	public AppItemVoucherQueryBudgetSupplyInfo getAppItemVoucherBudgetSupplyInfo( ) {
		return this.appItemVoucherBudgetSupplyInfo;
	}

	public void setAppItemVoucherCustomerGuideInfo(AppItemVoucherQueryCustomerGuideInfo appItemVoucherCustomerGuideInfo) {
		this.appItemVoucherCustomerGuideInfo = appItemVoucherCustomerGuideInfo;
	}
	public AppItemVoucherQueryCustomerGuideInfo getAppItemVoucherCustomerGuideInfo( ) {
		return this.appItemVoucherCustomerGuideInfo;
	}

	public void setAppItemVoucherDeductInfo(AppItemVoucherQueryDeductInfo appItemVoucherDeductInfo) {
		this.appItemVoucherDeductInfo = appItemVoucherDeductInfo;
	}
	public AppItemVoucherQueryDeductInfo getAppItemVoucherDeductInfo( ) {
		return this.appItemVoucherDeductInfo;
	}

	public void setAppItemVoucherDisplayPatternInfo(AppItemVoucherQueryDisplayPatternInfo appItemVoucherDisplayPatternInfo) {
		this.appItemVoucherDisplayPatternInfo = appItemVoucherDisplayPatternInfo;
	}
	public AppItemVoucherQueryDisplayPatternInfo getAppItemVoucherDisplayPatternInfo( ) {
		return this.appItemVoucherDisplayPatternInfo;
	}

	public void setAppItemVoucherSendModeInfo(AppItemVoucherQuerySendModeInfo appItemVoucherSendModeInfo) {
		this.appItemVoucherSendModeInfo = appItemVoucherSendModeInfo;
	}
	public AppItemVoucherQuerySendModeInfo getAppItemVoucherSendModeInfo( ) {
		return this.appItemVoucherSendModeInfo;
	}

	public void setAppItemVoucherUseRuleInfo(AppItemVoucherQueryUseRuleInfo appItemVoucherUseRuleInfo) {
		this.appItemVoucherUseRuleInfo = appItemVoucherUseRuleInfo;
	}
	public AppItemVoucherQueryUseRuleInfo getAppItemVoucherUseRuleInfo( ) {
		return this.appItemVoucherUseRuleInfo;
	}

}
