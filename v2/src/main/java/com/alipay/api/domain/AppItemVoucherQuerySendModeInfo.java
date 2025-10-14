package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序商品券查询发放信息
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:19
 */
public class AppItemVoucherQuerySendModeInfo extends AlipayObject {

	private static final long serialVersionUID = 8625578155356152739L;

	/**
	 * 券发放信息
	 */
	@ApiField("app_item_voucher_send_mode_info")
	private AppItemVoucherQuerySendRuleInfo appItemVoucherSendModeInfo;

	/**
	 * 发放模式
	 */
	@ApiField("voucher_send_mode")
	private String voucherSendMode;

	public AppItemVoucherQuerySendRuleInfo getAppItemVoucherSendModeInfo() {
		return this.appItemVoucherSendModeInfo;
	}
	public void setAppItemVoucherSendModeInfo(AppItemVoucherQuerySendRuleInfo appItemVoucherSendModeInfo) {
		this.appItemVoucherSendModeInfo = appItemVoucherSendModeInfo;
	}

	public String getVoucherSendMode() {
		return this.voucherSendMode;
	}
	public void setVoucherSendMode(String voucherSendMode) {
		this.voucherSendMode = voucherSendMode;
	}

}
