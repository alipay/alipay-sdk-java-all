package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户授权查询
 *
 * @author auto create
 * @since 1.0, 2024-03-26 13:57:05
 */
public class AlipayEbppInvoiceUserAuthQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1231371939196657617L;

	/**
	 * 用户手机号
	 */
	@ApiField("mobile_phone")
	private String mobilePhone;

	/**
	 * 用户开票邮箱
	 */
	@ApiField("user_email")
	private String userEmail;

	public String getMobilePhone() {
		return this.mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getUserEmail() {
		return this.userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

}
