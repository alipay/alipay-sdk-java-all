package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ampe设备信息上报
 *
 * @author auto create
 * @since 1.0, 2021-11-17 19:41:14
 */
public class AlipayOpenMiniAmpeDevicedataCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4625842525227169599L;

	/**
	 * 设备信息，jsonString格式，与ampe一致
	 */
	@ApiField("device_data")
	private String deviceData;

	/**
	 * 设备标识
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备产品id
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 通过ampe获取的用户标识
	 */
	@ApiField("user_key")
	private String userKey;

	/**
	 * 从ampe获取的用户路由标识
	 */
	@ApiField("user_route")
	private String userRoute;

	public String getDeviceData() {
		return this.deviceData;
	}
	public void setDeviceData(String deviceData) {
		this.deviceData = deviceData;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getUserKey() {
		return this.userKey;
	}
	public void setUserKey(String userKey) {
		this.userKey = userKey;
	}

	public String getUserRoute() {
		return this.userRoute;
	}
	public void setUserRoute(String userRoute) {
		this.userRoute = userRoute;
	}

}
