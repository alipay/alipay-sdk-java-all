package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户关联的场景列表
 *
 * @author auto create
 * @since 1.0, 2021-09-22 17:41:09
 */
public class AlipayOpenMiniAmpeUsersceneQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2336791454933817468L;

	/**
	 * 设备标识
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 产品id
	 */
	@ApiField("product_id")
	private Long productId;

	/**
	 * 通过ampe获取的用户标识
	 */
	@ApiField("user_key")
	private String userKey;

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

}
