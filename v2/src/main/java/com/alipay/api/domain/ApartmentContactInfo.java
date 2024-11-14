package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租房公寓的联系人信息
 *
 * @author auto create
 * @since 1.0, 2024-10-30 11:17:20
 */
public class ApartmentContactInfo extends AlipayObject {

	private static final long serialVersionUID = 6884192527411667635L;

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
	 * 商家IM支付宝端内的跳转链接
	 */
	@ApiField("im_url")
	private String imUrl;

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

	public String getImUrl() {
		return this.imUrl;
	}
	public void setImUrl(String imUrl) {
		this.imUrl = imUrl;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
