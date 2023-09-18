package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联系人信息
 *
 * @author auto create
 * @since 1.0, 2023-05-29 18:06:00
 */
public class ContactInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7722991611936622731L;

	/**
	 * 联系人姓名
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 联系人手机号
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
