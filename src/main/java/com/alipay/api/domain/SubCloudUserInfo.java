package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑子账号数据列表
 *
 * @author auto create
 * @since 1.0, 2018-11-16 21:41:04
 */
public class SubCloudUserInfo extends AlipayObject {

	private static final long serialVersionUID = 2394525545145429145L;

	/**
	 * 口碑子账号ID
	 */
	@ApiField("sub_user_id")
	private String subUserId;

	/**
	 * 口碑子账号名称
	 */
	@ApiField("sub_user_name")
	private String subUserName;

	/**
	 * 口碑子账号显示名
	 */
	@ApiField("sub_user_show_name")
	private String subUserShowName;

	/**
	 * 口碑主账号ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 口碑主账号名称
	 */
	@ApiField("user_name")
	private String userName;

	public String getSubUserId() {
		return this.subUserId;
	}
	public void setSubUserId(String subUserId) {
		this.subUserId = subUserId;
	}

	public String getSubUserName() {
		return this.subUserName;
	}
	public void setSubUserName(String subUserName) {
		this.subUserName = subUserName;
	}

	public String getSubUserShowName() {
		return this.subUserShowName;
	}
	public void setSubUserShowName(String subUserShowName) {
		this.subUserShowName = subUserShowName;
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

}
