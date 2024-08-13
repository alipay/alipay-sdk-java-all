package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券可用商品
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:31
 */
public class VoucherAvailableAppItemInfo extends AlipayObject {

	private static final long serialVersionUID = 6117299384321974597L;

	/**
	 * 外部商品信息
	 */
	@ApiField("app_item_out_item_info")
	private AppItemOutItemInfo appItemOutItemInfo;

	/**
	 * 需要查询优惠信息的商品支付宝平台侧ID
	 */
	@ApiField("item_id")
	private String itemId;

	public AppItemOutItemInfo getAppItemOutItemInfo() {
		return this.appItemOutItemInfo;
	}
	public void setAppItemOutItemInfo(AppItemOutItemInfo appItemOutItemInfo) {
		this.appItemOutItemInfo = appItemOutItemInfo;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

}
