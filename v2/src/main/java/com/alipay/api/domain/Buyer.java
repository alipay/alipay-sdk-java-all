package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 买家信息
 *
 * @author auto create
 * @since 1.0, 2025-05-27 14:56:23
 */
public class Buyer extends AlipayObject {

	private static final long serialVersionUID = 8848932421538394633L;

	/**
	 * 邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 描述
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
