package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询绑定商户会员号
 *
 * @author auto create
 * @since 1.0, 2016-08-10 17:28:37
 */
public class AlipayOpenPublicAccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1755221394598551883L;

	/**
	 * 支付宝账号userid，2088开头长度为16位的字符串
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
