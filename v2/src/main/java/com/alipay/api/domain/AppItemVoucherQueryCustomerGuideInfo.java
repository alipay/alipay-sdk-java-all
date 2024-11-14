package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 引导查询信息
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:19
 */
public class AppItemVoucherQueryCustomerGuideInfo extends AlipayObject {

	private static final long serialVersionUID = 7592173671383898715L;

	/**
	 * 券核销引导
	 */
	@ApiField("app_item_voucher_use_guide_info")
	private AppItemVoucherQueryUseGuideInfo appItemVoucherUseGuideInfo;

	public AppItemVoucherQueryUseGuideInfo getAppItemVoucherUseGuideInfo() {
		return this.appItemVoucherUseGuideInfo;
	}
	public void setAppItemVoucherUseGuideInfo(AppItemVoucherQueryUseGuideInfo appItemVoucherUseGuideInfo) {
		this.appItemVoucherUseGuideInfo = appItemVoucherUseGuideInfo;
	}

}
