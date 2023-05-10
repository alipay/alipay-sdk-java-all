package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改内部小程序成员
 *
 * @author auto create
 * @since 1.0, 2018-12-20 14:22:18
 */
public class AlipayOpenMiniMembersHuobanModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1518785231915667931L;

	/**
	 * 域账号
	 */
	@ApiField("domain_account")
	private String domainAccount;

	/**
	 * 支付宝账号
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 修改前的支付宝账号
	 */
	@ApiField("old_login_id")
	private String oldLoginId;

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

	public String getOldLoginId() {
		return this.oldLoginId;
	}
	public void setOldLoginId(String oldLoginId) {
		this.oldLoginId = oldLoginId;
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
