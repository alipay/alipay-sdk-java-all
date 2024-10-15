package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 三方平台代理签约接口中的联系人对象
 *
 * @author auto create
 * @since 1.0, 2023-09-05 10:32:16
 */
public class ContactModel extends AlipayObject {

	private static final long serialVersionUID = 5476298787523981971L;

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
