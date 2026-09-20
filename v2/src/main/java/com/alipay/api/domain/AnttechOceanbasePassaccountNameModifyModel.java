package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改用户登录账号绑定的联系方式
 *
 * @author auto create
 * @since 1.0, 2026-09-07 14:57:47
 */
public class AnttechOceanbasePassaccountNameModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2459288727433454422L;

	/**
	 * 账号类型
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 账号名称
	 */
	@ApiField("new_account_name")
	private String newAccountName;

	/**
	 * OceanBase Cloud的用户Id，可从个人中心获取
	 */
	@ApiField("passport_id")
	private String passportId;

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getNewAccountName() {
		return this.newAccountName;
	}
	public void setNewAccountName(String newAccountName) {
		this.newAccountName = newAccountName;
	}

	public String getPassportId() {
		return this.passportId;
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

}
