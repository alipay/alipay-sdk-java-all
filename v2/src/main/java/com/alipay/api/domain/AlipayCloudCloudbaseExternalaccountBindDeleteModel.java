package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账号解绑
 *
 * @author auto create
 * @since 1.0, 2023-08-08 18:37:47
 */
public class AlipayCloudCloudbaseExternalaccountBindDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1214439192478529485L;

	/**
	 * 服务商账号ID
	 */
	@ApiField("account_id")
	private String accountId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

}
