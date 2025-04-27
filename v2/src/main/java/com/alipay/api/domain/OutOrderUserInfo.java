package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 正向创单用户信息
 *
 * @author auto create
 * @since 1.0, 2025-04-15 11:31:51
 */
public class OutOrderUserInfo extends AlipayObject {

	private static final long serialVersionUID = 8557731612132366781L;

	/**
	 * 用户姓名
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * 用户手机
	 */
	@ApiField("user_phone")
	private String userPhone;

	/**
	 * 用户手机类型
PRIVACY---隐私号
ENCRYPT---加密号
	 */
	@ApiField("user_phone_type")
	private String userPhoneType;

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return this.userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserPhoneType() {
		return this.userPhoneType;
	}
	public void setUserPhoneType(String userPhoneType) {
		this.userPhoneType = userPhoneType;
	}

}
