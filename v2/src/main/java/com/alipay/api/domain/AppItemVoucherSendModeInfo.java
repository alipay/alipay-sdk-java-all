package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券发放信息
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:31
 */
public class AppItemVoucherSendModeInfo extends AlipayObject {

	private static final long serialVersionUID = 3452256949622189777L;

	/**
	 * 券发放规则
	 */
	@ApiField("app_item_voucher_send_rule_info")
	private AppItemVoucherSendRuleInfo appItemVoucherSendRuleInfo;

	/**
	 * 券发放模式
直领模式: DIRECT_SEND_MODE
	 */
	@ApiField("voucher_send_mode")
	private String voucherSendMode;

	public AppItemVoucherSendRuleInfo getAppItemVoucherSendRuleInfo() {
		return this.appItemVoucherSendRuleInfo;
	}
	public void setAppItemVoucherSendRuleInfo(AppItemVoucherSendRuleInfo appItemVoucherSendRuleInfo) {
		this.appItemVoucherSendRuleInfo = appItemVoucherSendRuleInfo;
	}

	public String getVoucherSendMode() {
		return this.voucherSendMode;
	}
	public void setVoucherSendMode(String voucherSendMode) {
		this.voucherSendMode = voucherSendMode;
	}

}
