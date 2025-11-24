package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核销使用人信息
 *
 * @author auto create
 * @since 1.0, 2025-10-21 19:20:59
 */
public class MiniUserInfo extends AlipayObject {

	private static final long serialVersionUID = 4375496235412569595L;

	/**
	 * 使用人联系方式，脱敏展示
	 */
	@ApiField("mobile_phone")
	private String mobilePhone;

	/**
	 * 使用人姓名，脱敏返回
	 */
	@ApiField("name")
	private String name;

	public String getMobilePhone() {
		return this.mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
