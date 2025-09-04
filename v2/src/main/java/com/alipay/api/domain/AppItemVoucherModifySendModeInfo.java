package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序商品券修改发放模型
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:36
 */
public class AppItemVoucherModifySendModeInfo extends AlipayObject {

	private static final long serialVersionUID = 8421646254817926271L;

	/**
	 * 券发放规则
	 */
	@ApiField("app_item_voucher_send_rule_info")
	private AppItemVoucherModifySendRuleInfo appItemVoucherSendRuleInfo;

	public AppItemVoucherModifySendRuleInfo getAppItemVoucherSendRuleInfo() {
		return this.appItemVoucherSendRuleInfo;
	}
	public void setAppItemVoucherSendRuleInfo(AppItemVoucherModifySendRuleInfo appItemVoucherSendRuleInfo) {
		this.appItemVoucherSendRuleInfo = appItemVoucherSendRuleInfo;
	}

}
