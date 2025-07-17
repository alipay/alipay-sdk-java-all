package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券核销规则查询
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:19
 */
public class AppItemVoucherQueryUseRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 7822753265191259456L;

	/**
	 * 券核销时间
	 */
	@ApiField("app_item_voucher_use_time_info")
	private AppItemVoucherQueryUseTimeInfo appItemVoucherUseTimeInfo;

	public AppItemVoucherQueryUseTimeInfo getAppItemVoucherUseTimeInfo() {
		return this.appItemVoucherUseTimeInfo;
	}
	public void setAppItemVoucherUseTimeInfo(AppItemVoucherQueryUseTimeInfo appItemVoucherUseTimeInfo) {
		this.appItemVoucherUseTimeInfo = appItemVoucherUseTimeInfo;
	}

}
