package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV查询店铺下pos设备信息
 *
 * @author auto create
 * @since 1.0, 2018-02-08 15:34:23
 */
public class KoubeiCateringDeviceShopQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6253145784976874879L;

	/**
	 * 唯一请求id，开放者请确保每次请求的唯一性
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 店铺在口碑的唯一键
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
