package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AMPE设备信息上报权限查询
 *
 * @author auto create
 * @since 1.0, 2021-08-25 11:11:03
 */
public class AlipayOpenMiniAmpeCollectrightQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3861375553267242998L;

	/**
	 * 设备编号
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备产品id
	 */
	@ApiField("product_id")
	private Long productId;

	/**
	 * 从ampe获取的用户标识
	 */
	@ApiField("user_key")
	private String userKey;

	/**
	 * 用户路由标识，从ampe处获取
	 */
	@ApiField("user_route")
	private String userRoute;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public Long getProductId() {
		return this.productId;
	}
	public void setProductId(Long productId) {
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
