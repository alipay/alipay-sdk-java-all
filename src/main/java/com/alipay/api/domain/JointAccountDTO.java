package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 共同账户基本信息
 *
 * @author auto create
 * @since 1.0, 2021-01-25 21:13:16
 */
public class JointAccountDTO extends AlipayObject {

	private static final long serialVersionUID = 3266472967954193243L;

	/**
	 * 共同账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 共同账户账本名称
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 账本创建人会员号
	 */
	@ApiField("user_id")
	private String userId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
