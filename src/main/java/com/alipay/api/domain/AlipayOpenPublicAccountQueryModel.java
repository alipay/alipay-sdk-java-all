package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询绑定商户会员号
 *
 * @author auto create
 * @since 1.0, 2021-06-23 10:46:13
 */
public class AlipayOpenPublicAccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3784414682834773133L;

	/**
	 * 用户的支付宝用户号，2088开头。
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
