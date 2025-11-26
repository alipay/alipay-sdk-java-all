package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 包裹授权关系
 *
 * @author auto create
 * @since 1.0, 2022-11-18 11:07:15
 */
public class PkgAuthRelation extends AlipayObject {

	private static final long serialVersionUID = 6665361915465122935L;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 支付宝uid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 家人称谓
	 */
	@ApiField("role")
	private String role;

	/**
	 * 支付宝uid
	 */
	@ApiField("user_id")
	private String userId;

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
