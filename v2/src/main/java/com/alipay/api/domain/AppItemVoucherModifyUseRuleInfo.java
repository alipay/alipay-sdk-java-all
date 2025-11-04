package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序商品券修改核销信息
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:36
 */
public class AppItemVoucherModifyUseRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 2275663136375956886L;

	/**
	 * 核销时间
	 */
	@ApiField("app_item_voucher_use_time_info")
	private AppItemVoucherModifyUseTimeInfo appItemVoucherUseTimeInfo;

	public AppItemVoucherModifyUseTimeInfo getAppItemVoucherUseTimeInfo() {
		return this.appItemVoucherUseTimeInfo;
	}
	public void setAppItemVoucherUseTimeInfo(AppItemVoucherModifyUseTimeInfo appItemVoucherUseTimeInfo) {
		this.appItemVoucherUseTimeInfo = appItemVoucherUseTimeInfo;
	}

}
