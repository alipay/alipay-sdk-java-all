package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户提现金额
 *
 * @author auto create
 * @since 1.0, 2022-01-18 09:21:22
 */
public class AlipayCommercePayforprivilegeWithdrawamountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7867913752614724218L;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
