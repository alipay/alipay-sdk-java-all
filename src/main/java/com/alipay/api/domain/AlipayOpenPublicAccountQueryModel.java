package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询绑定商户会员号
 *
 * @author auto create
 * @since 1.0, 2022-11-13 16:23:02
 */
public class AlipayOpenPublicAccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8696783192489348443L;

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
