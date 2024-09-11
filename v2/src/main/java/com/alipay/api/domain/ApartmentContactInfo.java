package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租房公寓的联系人信息
 *
 * @author auto create
 * @since 1.0, 2024-09-09 11:33:23
 */
public class ApartmentContactInfo extends AlipayObject {

	private static final long serialVersionUID = 5362158595747785469L;

	/**
	 * 联系人姓名
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 联系人的头像地址
	 */
	@ApiField("contact_profile_pic")
	private String contactProfilePic;

	/**
	 * 联系人的电话号码
	 */
	@ApiField("mobile")
	private String mobile;

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactProfilePic() {
		return this.contactProfilePic;
	}
	public void setContactProfilePic(String contactProfilePic) {
		this.contactProfilePic = contactProfilePic;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
