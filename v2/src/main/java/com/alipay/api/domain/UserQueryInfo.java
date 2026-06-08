package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户信息
 *
 * @author auto create
 * @since 1.0, 2026-05-25 15:42:30
 */
public class UserQueryInfo extends AlipayObject {

	private static final long serialVersionUID = 6479132675998177629L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝登录账户的手机号,非患者手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * saas的虚拟uid
	 */
	@ApiField("virtual_uid")
	private String virtualUid;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVirtualUid() {
		return this.virtualUid;
	}
	public void setVirtualUid(String virtualUid) {
		this.virtualUid = virtualUid;
	}

}
