package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内部小程序删除成员
 *
 * @author auto create
 * @since 1.0, 2019-09-09 15:29:41
 */
public class AlipayOpenMiniMembersHuobanDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 7512695497736688534L;

	/**
	 * 用户域账号
	 */
	@ApiField("domain_account")
	private String domainAccount;

	/**
	 * 支付宝账号
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 小程序ID
	 */
	@ApiField("operate_app_id")
	private String operateAppId;

	/**
	 * 成员角色
	 */
	@ApiField("type")
	private String type;

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

	public String getOperateAppId() {
		return this.operateAppId;
	}
	public void setOperateAppId(String operateAppId) {
		this.operateAppId = operateAppId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
