package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询门店下设备列表
 *
 * @author auto create
 * @since 1.0, 2022-10-18 11:18:22
 */
public class KoubeiMerchantKbdeviceDevicesBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2853727791424795726L;

	/**
	 * 需要筛选的设备类型。目前仅支持 FOOD_DISPENSER （取餐柜）类型的设备查询，必须填写FOOD_DISPENSER。
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
