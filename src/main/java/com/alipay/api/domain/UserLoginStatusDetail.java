package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑云登录子账号状态的详细信息
 *
 * @author auto create
 * @since 1.0, 2018-11-16 21:41:17
 */
public class UserLoginStatusDetail extends AlipayObject {

	private static final long serialVersionUID = 8391394845629912916L;

	/**
	 * 口碑云子账号联系人邮箱
	 */
	@ApiField("contact_email")
	private String contactEmail;

	/**
	 * 口碑云子账号联系人名称
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 口碑云子账号联系人联系方式
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 口碑云子账号id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 口碑云子账号名称
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * 口碑云子账户显示名
	 */
	@ApiField("user_show_name")
	private String userShowName;

	public String getContactEmail() {
		return this.contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserShowName() {
		return this.userShowName;
	}
	public void setUserShowName(String userShowName) {
		this.userShowName = userShowName;
	}

}
