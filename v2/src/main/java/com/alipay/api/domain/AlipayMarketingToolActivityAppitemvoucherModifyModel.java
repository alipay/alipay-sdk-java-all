package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改小程序商品券
 *
 * @author auto create
 * @since 1.0, 2024-08-19 21:18:16
 */
public class AlipayMarketingToolActivityAppitemvoucherModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7467592422947486965L;

	/**
	 * 活动基础信息
	 */
	@ApiField("app_item_activity_base_info")
	private AppItemActivityModifyBaseInfo appItemActivityBaseInfo;

	/**
	 * 券可用范围
	 */
	@ApiField("app_item_voucher_available_scope_info")
	private AppItemVoucherModifyAvailableScopeInfo appItemVoucherAvailableScopeInfo;

	/**
	 * 券展示方式
	 */
	@ApiField("app_item_voucher_display_pattern_info")
	private AppItemVoucherModifyDisplayPatternInfo appItemVoucherDisplayPatternInfo;

	/**
	 * 券发放信息
	 */
	@ApiField("app_item_voucher_send_mode_info")
	private AppItemVoucherModifySendModeInfo appItemVoucherSendModeInfo;

	/**
	 * 券核销规则
	 */
	@ApiField("app_item_voucher_use_rule_info")
	private AppItemVoucherModifyUseRuleInfo appItemVoucherUseRuleInfo;

	/**
	 * 外部业务单号，用作幂等控制
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public AppItemActivityModifyBaseInfo getAppItemActivityBaseInfo() {
		return this.appItemActivityBaseInfo;
	}
	public void setAppItemActivityBaseInfo(AppItemActivityModifyBaseInfo appItemActivityBaseInfo) {
		this.appItemActivityBaseInfo = appItemActivityBaseInfo;
	}

	public AppItemVoucherModifyAvailableScopeInfo getAppItemVoucherAvailableScopeInfo() {
		return this.appItemVoucherAvailableScopeInfo;
	}
	public void setAppItemVoucherAvailableScopeInfo(AppItemVoucherModifyAvailableScopeInfo appItemVoucherAvailableScopeInfo) {
		this.appItemVoucherAvailableScopeInfo = appItemVoucherAvailableScopeInfo;
	}

	public AppItemVoucherModifyDisplayPatternInfo getAppItemVoucherDisplayPatternInfo() {
		return this.appItemVoucherDisplayPatternInfo;
	}
	public void setAppItemVoucherDisplayPatternInfo(AppItemVoucherModifyDisplayPatternInfo appItemVoucherDisplayPatternInfo) {
		this.appItemVoucherDisplayPatternInfo = appItemVoucherDisplayPatternInfo;
	}

	public AppItemVoucherModifySendModeInfo getAppItemVoucherSendModeInfo() {
		return this.appItemVoucherSendModeInfo;
	}
	public void setAppItemVoucherSendModeInfo(AppItemVoucherModifySendModeInfo appItemVoucherSendModeInfo) {
		this.appItemVoucherSendModeInfo = appItemVoucherSendModeInfo;
	}

	public AppItemVoucherModifyUseRuleInfo getAppItemVoucherUseRuleInfo() {
		return this.appItemVoucherUseRuleInfo;
	}
	public void setAppItemVoucherUseRuleInfo(AppItemVoucherModifyUseRuleInfo appItemVoucherUseRuleInfo) {
		this.appItemVoucherUseRuleInfo = appItemVoucherUseRuleInfo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
