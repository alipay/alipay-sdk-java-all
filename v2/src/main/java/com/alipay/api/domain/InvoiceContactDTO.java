package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 入驻工单联系人信息
 *
 * @author auto create
 * @since 1.0, 2020-06-18 20:20:38
 */
public class InvoiceContactDTO extends AlipayObject {

	private static final long serialVersionUID = 1591526746951396344L;

	/**
	 * 联系人地址
	 */
	@ApiField("contact_addr")
	private String contactAddr;

	/**
	 * 联系人邮件
	 */
	@ApiField("contact_mail")
	private String contactMail;

	/**
	 * 联系人电话
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 联系人姓名
	 */
	@ApiField("contact_name")
	private String contactName;

	public String getContactAddr() {
		return this.contactAddr;
	}
	public void setContactAddr(String contactAddr) {
		this.contactAddr = contactAddr;
	}

	public String getContactMail() {
		return this.contactMail;
	}
	public void setContactMail(String contactMail) {
		this.contactMail = contactMail;
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
