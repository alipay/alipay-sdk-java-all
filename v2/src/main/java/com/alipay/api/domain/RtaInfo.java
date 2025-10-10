package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * rta查询信息
 *
 * @author auto create
 * @since 1.0, 2023-08-28 13:48:46
 */
public class RtaInfo extends AlipayObject {

	private static final long serialVersionUID = 1592489571211245639L;

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
