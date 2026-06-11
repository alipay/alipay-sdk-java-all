package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 景区眼镜设备归还解绑
 *
 * @author auto create
 * @since 1.0, 2026-05-07 17:32:46
 */
public class AlipayCommerceRentGlassesUnbindModel extends AlipayObject {

	private static final long serialVersionUID = 2459488534266326364L;

	/**
	 * 设备SN，眼镜厂商唯一设备号
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 设备类型
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 解绑用户open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 解绑用户user_id
	 */
	@ApiField("user_id")
	private String userId;

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
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
