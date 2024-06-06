package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ApplePay风控数据
 *
 * @author auto create
 * @since 1.0, 2020-02-19 16:35:10
 */
public class FraudData extends AlipayObject {

	private static final long serialVersionUID = 5581568442187319625L;

	/**
	 * 设备id
	 */
	@ApiField("device_identifier")
	private String deviceIdentifier;

	/**
	 * 用户id
	 */
	@ApiField("user_identifier")
	private String userIdentifier;

	public String getDeviceIdentifier() {
		return this.deviceIdentifier;
	}
	public void setDeviceIdentifier(String deviceIdentifier) {
		this.deviceIdentifier = deviceIdentifier;
	}

	public String getUserIdentifier() {
		return this.userIdentifier;
	}
	public void setUserIdentifier(String userIdentifier) {
		this.userIdentifier = userIdentifier;
	}

}
