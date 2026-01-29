package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券核销规则
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:31
 */
public class AppItemVoucherUseRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 7738238434917245777L;

	/**
	 * 券核销时间
	 */
	@ApiField("app_item_voucher_use_time_info")
	private AppItemVoucherUseTimeInfo appItemVoucherUseTimeInfo;

	public AppItemVoucherUseTimeInfo getAppItemVoucherUseTimeInfo() {
		return this.appItemVoucherUseTimeInfo;
	}
	public void setAppItemVoucherUseTimeInfo(AppItemVoucherUseTimeInfo appItemVoucherUseTimeInfo) {
		this.appItemVoucherUseTimeInfo = appItemVoucherUseTimeInfo;
	}

}
