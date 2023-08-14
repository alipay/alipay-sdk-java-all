package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部账号绑定预咨询
 *
 * @author auto create
 * @since 1.0, 2023-08-01 15:51:50
 */
public class AlipayCloudCloudbaseExternalaccountBindPreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 5358221938171961647L;

	/**
	 * 服务商用户账号，如邮箱地址、手机号等
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 服务商用户账号名称
	 */
	@ApiField("account_name")
	private String accountName;

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

}
