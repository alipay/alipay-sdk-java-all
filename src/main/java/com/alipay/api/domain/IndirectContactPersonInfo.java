package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联系人信息
 *
 * @author auto create
 * @since 1.0, 2022-09-01 19:25:39
 */
public class IndirectContactPersonInfo extends AlipayObject {

	private static final long serialVersionUID = 2713591186424527925L;

	/**
	 * 联系人身份证号
	 */
	@ApiField("contact_card_no")
	private String contactCardNo;

	/**
	 * 联系人姓名
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 联系人手机
	 */
	@ApiField("contact_phone_no")
	private String contactPhoneNo;

	public String getContactCardNo() {
		return this.contactCardNo;
	}
	public void setContactCardNo(String contactCardNo) {
		this.contactCardNo = contactCardNo;
	}

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactPhoneNo() {
		return this.contactPhoneNo;
	}
	public void setContactPhoneNo(String contactPhoneNo) {
		this.contactPhoneNo = contactPhoneNo;
	}

}
