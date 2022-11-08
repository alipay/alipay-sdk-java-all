package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内部链路删除开发成员
 *
 * @author auto create
 * @since 1.0, 2022-06-30 10:35:43
 */
public class AlipayOpenMiniInnerMembersDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 8352597168871249995L;

	/**
	 * 业务来源
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * 域账号（如传入则删除联系人）
	 */
	@ApiField("domain_account")
	private String domainAccount;

	/**
	 * 登陆支付宝账号
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 业务小程序id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 成员类型
	 */
	@ApiField("type")
	private String type;

	public String getAppOrigin() {
		return this.appOrigin;
	}
	public void setAppOrigin(String appOrigin) {
		this.appOrigin = appOrigin;
	}

	public String getDomainAccount() {
		return this.domainAccount;
	}
	public void setDomainAccount(String domainAccount) {
		this.domainAccount = domainAccount;
	}

	public String getLoginId() {
		return this.loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
