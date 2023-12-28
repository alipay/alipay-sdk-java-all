package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业联系人信息
 *
 * @author auto create
 * @since 1.0, 2016-09-26 13:19:43
 */
public class ContactPersonInfo extends AlipayObject {

	private static final long serialVersionUID = 7711468826447982791L;

	/**
	 * 联系人邮箱地址，入驻申请审核结果会发送至该邮箱
	 */
	@ApiField("contact_email")
	private String contactEmail;

	/**
	 * 联系人手机号，入驻申请结果会通过短信的形式发送至该手机号码
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 企业联系人名称
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 联系人类型，MERCHANT_CONTACT (普通联系人),DATA_RETURN (数据反馈联系人),PROT_CONTACT(客服人员),OBJECTION_HANDLE (异议处理联系人)，如不填默认为MERCHANT_CONTACT
	 */
	@ApiField("contact_type")
	private String contactType;

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

	public String getContactType() {
		return this.contactType;
	}
	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

}
