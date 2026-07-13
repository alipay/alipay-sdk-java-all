package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联系人信息
 *
 * @author auto create
 * @since 1.0, 2026-03-24 16:11:54
 */
public class EscrowContactInfo extends AlipayObject {

	private static final long serialVersionUID = 6245777955474754161L;

	/**
	 * 联系人邮箱
	 */
	@ApiField("contact_email")
	private String contactEmail;

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

	/**
	 * 联系人详细地址
	 */
	@ApiField("detail_address")
	private String detailAddress;

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

	public String getDetailAddress() {
		return this.detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}

}
