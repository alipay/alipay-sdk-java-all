package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 添加群授权记录
 *
 * @author auto create
 * @since 1.0, 2024-09-11 15:36:38
 */
public class AlipayMerchantGroupAuthorizeAddModel extends AlipayObject {

	private static final long serialVersionUID = 5189189522298698982L;

	/**
	 * 支付宝登录账号，邮箱号或者手机号
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 授权类型，目前只有 GROUP_INSTANCE_ADMIN(支付宝粉丝群管权限的授权类型)
	 */
	@ApiField("type")
	private String type;

	/**
	 * 用户名称
	 */
	@ApiField("user_name")
	private String userName;

	public String getLoginId() {
		return this.loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
