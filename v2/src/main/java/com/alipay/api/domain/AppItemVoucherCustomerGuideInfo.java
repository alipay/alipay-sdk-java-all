package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 引导信息
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:31
 */
public class AppItemVoucherCustomerGuideInfo extends AlipayObject {

	private static final long serialVersionUID = 4783857958396552745L;

	/**
	 * 券核销引导
	 */
	@ApiField("app_item_voucher_use_guide_info")
	private AppItemVoucherUseGuideInfo appItemVoucherUseGuideInfo;

	public AppItemVoucherUseGuideInfo getAppItemVoucherUseGuideInfo() {
		return this.appItemVoucherUseGuideInfo;
	}
	public void setAppItemVoucherUseGuideInfo(AppItemVoucherUseGuideInfo appItemVoucherUseGuideInfo) {
		this.appItemVoucherUseGuideInfo = appItemVoucherUseGuideInfo;
	}

}
