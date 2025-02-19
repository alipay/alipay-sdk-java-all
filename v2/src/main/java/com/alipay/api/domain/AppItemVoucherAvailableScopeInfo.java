package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券可用范围
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:31
 */
public class AppItemVoucherAvailableScopeInfo extends AlipayObject {

	private static final long serialVersionUID = 2865213343449872281L;

	/**
	 * 券可用商品
	 */
	@ApiListField("app_item_voucher_available_info_list")
	@ApiField("voucher_available_app_item_info")
	private List<VoucherAvailableAppItemInfo> appItemVoucherAvailableInfoList;

	public List<VoucherAvailableAppItemInfo> getAppItemVoucherAvailableInfoList() {
		return this.appItemVoucherAvailableInfoList;
	}
	public void setAppItemVoucherAvailableInfoList(List<VoucherAvailableAppItemInfo> appItemVoucherAvailableInfoList) {
		this.appItemVoucherAvailableInfoList = appItemVoucherAvailableInfoList;
	}

}
