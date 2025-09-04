package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 群授权记录模型
 *
 * @author auto create
 * @since 1.0, 2024-06-11 20:47:51
 */
public class GroupAuthorizeVO extends AlipayObject {

	private static final long serialVersionUID = 4376762481223564832L;

	/**
	 * 授权记录id
	 */
	@ApiField("authorize_id")
	private String authorizeId;

	/**
	 * 登录账号，脱敏后的邮箱账号或者手机账号
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识，只有当已授权的数据才会有相关的openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 授权状态，目前只有INIT、AUTHORIZED 两种状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 群授权类型，目前只有 GROUP_INSTANCE_ADMIN(群管理员授权)
	 */
	@ApiField("type")
	private String type;

	/**
	 * 用户user_id，2088开头的16位数字。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户名称，脱敏后的名称
	 */
	@ApiField("user_name")
	private String userName;

	public String getAuthorizeId() {
		return this.authorizeId;
	}
	public void setAuthorizeId(String authorizeId) {
		this.authorizeId = authorizeId;
	}

	public String getLoginId() {
		return this.loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
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
