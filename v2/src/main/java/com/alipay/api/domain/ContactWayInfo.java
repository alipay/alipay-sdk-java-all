package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联系方式
 *
 * @author auto create
 * @since 1.0, 2024-09-05 11:58:31
 */
public class ContactWayInfo extends AlipayObject {

	private static final long serialVersionUID = 4771716951225162693L;

	/**
	 * 联系方式的类型，枚举
	 */
	@ApiField("contact_type")
	private String contactType;

	/**
	 * 联系方式具体的值
	 */
	@ApiField("contact_value")
	private String contactValue;

	public String getContactType() {
		return this.contactType;
	}
	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public String getContactValue() {
		return this.contactValue;
	}
	public void setContactValue(String contactValue) {
		this.contactValue = contactValue;
	}

}
