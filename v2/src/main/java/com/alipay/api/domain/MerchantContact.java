package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户联系人信息，包含联系人名称、手机、邮箱信息。联系人信息将用于接受进件的重要通知，如确认协议等。
 *
 * @author auto create
 * @since 1.0, 2024-12-17 19:47:21
 */
public class MerchantContact extends AlipayObject {

	private static final long serialVersionUID = 3814494334786756184L;

	/**
	 * 联系人邮箱
	 */
	@ApiField("contact_email")
	private String contactEmail;

	/**
	 * 联系人手机号码
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 联系人名称
	 */
	@ApiField("contact_name")
	private String contactName;

	public String getContactEmail() {
		return this.contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactMobile() {
		return this.contactMobile;
	}
	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

}
