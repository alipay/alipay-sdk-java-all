package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询阿里车的车辆信息
 *
 * @author auto create
 * @since 1.0, 2022-11-17 16:28:49
 */
public class AliosOpenAutoInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4144227534388633126L;

	/**
	 * 设备token
	 */
	@ApiField("device_token")
	private String deviceToken;

	/**
	 * 经度
	 */
	@ApiField("open_id")
	private String openId;

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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
