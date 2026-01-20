package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 派单联系人
 *
 * @author auto create
 * @since 1.0, 2025-03-20 11:01:29
 */
public class SendOrderContactInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8481283141963533396L;

	/**
	 * 联系人姓名
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 联系人号码
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
