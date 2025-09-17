package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品修改信息
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:36
 */
public class VoucherAvailableModifyAppItemInfo extends AlipayObject {

	private static final long serialVersionUID = 5493162928486629148L;

	/**
	 * 外部商品信息
	 */
	@ApiField("app_item_out_item_info")
	private AppItemModifyOutItemInfo appItemOutItemInfo;

	/**
	 * 需要查询优惠信息的商品支付宝平台侧ID
	 */
	@ApiField("item_id")
	private String itemId;

	public AppItemModifyOutItemInfo getAppItemOutItemInfo() {
		return this.appItemOutItemInfo;
	}
	public void setAppItemOutItemInfo(AppItemModifyOutItemInfo appItemOutItemInfo) {
		this.appItemOutItemInfo = appItemOutItemInfo;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

}
