package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联系人信息
 *
 * @author auto create
 * @since 1.0, 2023-05-30 15:29:30
 */
public class ContactInfoVO extends AlipayObject {

	private static final long serialVersionUID = 2572344383384674666L;

	/**
	 * 联系人姓名
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 联系人信息加密内容
	 */
	@ApiField("encryption_content")
	private String encryptionContent;

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

	public String getEncryptionContent() {
		return this.encryptionContent;
	}
	public void setEncryptionContent(String encryptionContent) {
		this.encryptionContent = encryptionContent;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
