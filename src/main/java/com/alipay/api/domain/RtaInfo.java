package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * rta查询信息
 *
 * @author auto create
 * @since 1.0, 2020-01-03 11:14:59
 */
public class RtaInfo extends AlipayObject {

	private static final long serialVersionUID = 2126475999448758837L;

	/**
	 * 广告投放账户id
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
