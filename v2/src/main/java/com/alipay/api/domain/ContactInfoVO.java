package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联系人信息
 *
 * @author auto create
 * @since 1.0, 2023-12-11 00:24:13
 */
public class ContactInfoVO extends AlipayObject {

	private static final long serialVersionUID = 4283359877284892756L;

	/**
	 * 联系人姓名
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 加密内容，创单时由团购插件上传，内容为手机号加密内容，解密方式参考<a href="https://opendocs.alipay.com/mini/api/getphonenumber#%E8%8E%B7%E5%8F%96%E6%89%8B%E6%9C%BA%E5%8F%B7">获取手机号</a>中第五步
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
