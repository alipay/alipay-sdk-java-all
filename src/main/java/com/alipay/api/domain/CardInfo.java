package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集卡信息
 *
 * @author auto create
 * @since 1.0, 2016-11-24 22:26:22
 */
public class CardInfo extends AlipayObject {

	private static final long serialVersionUID = 7454789638546233291L;

	/**
	 * 领取时间
	 */
	@ApiField("taken_time")
	private String takenTime;

	/**
	 * 用户名
	 */
	@ApiField("user_name")
	private String userName;

	public String getTakenTime() {
		return this.takenTime;
	}
	public void setTakenTime(String takenTime) {
		this.takenTime = takenTime;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
