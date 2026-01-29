package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云霄客户-联系人信息
 *
 * @author auto create
 * @since 1.0, 2025-10-23 09:43:47
 */
public class YxContactInfo extends AlipayObject {

	private static final long serialVersionUID = 1379643231818882132L;

	/**
	 * 联系人姓名
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 数据的ID
	 */
	@ApiField("data_id")
	private Long dataId;

	/**
	 * 是否当前客户的默认联系人，N否，Y是
	 */
	@ApiField("default_contact")
	private String defaultContact;

	/**
	 * 手机号或电话号码
	 */
	@ApiField("mobile_phone")
	private String mobilePhone;

	/**
	 * 联系人职务
	 */
	@ApiField("position")
	private String position;

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public Long getDataId() {
		return this.dataId;
	}
	public void setDataId(Long dataId) {
		this.dataId = dataId;
	}

	public String getDefaultContact() {
		return this.defaultContact;
	}
	public void setDefaultContact(String defaultContact) {
		this.defaultContact = defaultContact;
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getPosition() {
		return this.position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

}
