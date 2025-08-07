package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品使用范围信息
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:36
 */
public class AppItemVoucherModifyAvailableScopeInfo extends AlipayObject {

	private static final long serialVersionUID = 4549448296311435367L;

	/**
	 * 券可用商品
	 */
	@ApiListField("app_item_voucher_available_info_list")
	@ApiField("voucher_available_modify_app_item_info")
	private List<VoucherAvailableModifyAppItemInfo> appItemVoucherAvailableInfoList;

	public List<VoucherAvailableModifyAppItemInfo> getAppItemVoucherAvailableInfoList() {
		return this.appItemVoucherAvailableInfoList;
	}
	public void setAppItemVoucherAvailableInfoList(List<VoucherAvailableModifyAppItemInfo> appItemVoucherAvailableInfoList) {
		this.appItemVoucherAvailableInfoList = appItemVoucherAvailableInfoList;
	}

}
