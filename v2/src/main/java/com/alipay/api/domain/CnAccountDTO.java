package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 主站账号DTO对象
 *
 * @author auto create
 * @since 1.0, 2023-12-04 14:31:34
 */
public class CnAccountDTO extends AlipayObject {

	private static final long serialVersionUID = 2653686929623865328L;

	/**
	 * 跨境游营销机构Id
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 营销机构账号名
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
