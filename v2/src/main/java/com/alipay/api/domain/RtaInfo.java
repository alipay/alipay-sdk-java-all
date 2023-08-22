package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * rta查询信息
 *
 * @author auto create
 * @since 1.0, 2023-08-22 14:29:11
 */
public class RtaInfo extends AlipayObject {

	private static final long serialVersionUID = 1352895824887878669L;

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
