package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询阿里车的车辆信息
 *
 * @author auto create
 * @since 1.0, 2019-12-17 12:20:36
 */
public class AliosOpenAutoInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1348773453616491139L;

	/**
	 * 设备token
	 */
	@ApiField("device_token")
	private String deviceToken;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getDeviceToken() {
		return this.deviceToken;
	}
	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
