package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租房公寓的联系人信息
 *
 * @author auto create
 * @since 1.0, 2025-07-14 11:04:32
 */
public class ApartmentContactInfo extends AlipayObject {

	private static final long serialVersionUID = 1484912515654257267L;

	/**
	 * 联系人支付宝账号
	 */
	@ApiField("contact_alipay_account")
	private String contactAlipayAccount;

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
	 * 开通留资方式
	 */
	@ApiListField("enabled_lead_channels")
	@ApiField("string")
	private List<String> enabledLeadChannels;

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

	public String getContactAlipayAccount() {
		return this.contactAlipayAccount;
	}
	public void setContactAlipayAccount(String contactAlipayAccount) {
		this.contactAlipayAccount = contactAlipayAccount;
	}

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

	public List<String> getEnabledLeadChannels() {
		return this.enabledLeadChannels;
	}
	public void setEnabledLeadChannels(List<String> enabledLeadChannels) {
		this.enabledLeadChannels = enabledLeadChannels;
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
