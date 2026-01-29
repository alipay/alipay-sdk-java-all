package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信登企业用户
 *
 * @author auto create
 * @since 1.0, 2025-08-04 15:43:46
 */
public class AlipayIserviceIsresourceEnterpriseuserAuthModel extends AlipayObject {

	private static final long serialVersionUID = 2388216146821265536L;

	/**
	 * 根据登录渠道不同，填写不同的账号
	 */
	@ApiField("auth_account")
	private String authAccount;

	/**
	 * 登录渠道，如手机、邮箱、用户ID等
	 */
	@ApiField("auth_channel")
	private String authChannel;

	/**
	 * 星云的租户ID
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getAuthAccount() {
		return this.authAccount;
	}
	public void setAuthAccount(String authAccount) {
		this.authAccount = authAccount;
	}

	public String getAuthChannel() {
		return this.authChannel;
	}
	public void setAuthChannel(String authChannel) {
		this.authChannel = authChannel;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
