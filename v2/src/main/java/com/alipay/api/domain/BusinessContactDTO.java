package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联系人信息
 *
 * @author auto create
 * @since 1.0, 2023-03-03 17:12:22
 */
public class BusinessContactDTO extends AlipayObject {

	private static final long serialVersionUID = 8277375956798477321L;

	/**
	 * 联系人地址
	 */
	@ApiField("contact_address")
	private BusinessAddressDTO contactAddress;

	/**
	 * 联系人邮箱
	 */
	@ApiField("contact_email")
	private String contactEmail;

	/**
	 * 联系人手机
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 联系人名称
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 座机号码
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 联系人职位
	 */
	@ApiField("contact_position")
	private String contactPosition;

	/**
	 * 联系人类型
	 */
	@ApiField("contact_type")
	private String contactType;

	public BusinessAddressDTO getContactAddress() {
		return this.contactAddress;
	}
	public void setContactAddress(BusinessAddressDTO contactAddress) {
		this.contactAddress = contactAddress;
	}

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

	public String getContactPhone() {
		return this.contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getContactPosition() {
		return this.contactPosition;
	}
	public void setContactPosition(String contactPosition) {
		this.contactPosition = contactPosition;
	}

	public String getContactType() {
		return this.contactType;
	}
	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

}
