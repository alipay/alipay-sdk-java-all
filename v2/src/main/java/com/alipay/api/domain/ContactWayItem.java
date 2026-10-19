package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-10 16:06:23
 */
public class ContactWayItem extends AlipayObject {

	private static final long serialVersionUID = 2145538431644282513L;

	/**
	 * 联系方式，手机号，邮箱地址等
	 */
	@ApiField("contact_value")
	private String contactValue;

	/**
	 * 联系类型
	 */
	@ApiField("contect_type")
	private String contectType;

	public String getContactValue() {
		return this.contactValue;
	}
	public void setContactValue(String contactValue) {
		this.contactValue = contactValue;
	}

	public String getContectType() {
		return this.contectType;
	}
	public void setContectType(String contectType) {
		this.contectType = contectType;
	}

}
