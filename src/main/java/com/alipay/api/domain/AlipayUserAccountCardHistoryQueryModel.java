package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝账户历史查询
 *
 * @author auto create
 * @since 1.0, 2018-11-29 16:40:57
 */
public class AlipayUserAccountCardHistoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1127442572261481835L;

	/**
	 * 用户详情
	 */
	@ApiField("user_details")
	private UserDetails userDetails;

	public UserDetails getUserDetails() {
		return this.userDetails;
	}
	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

}
