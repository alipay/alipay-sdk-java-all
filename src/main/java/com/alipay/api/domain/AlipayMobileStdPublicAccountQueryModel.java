package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 当用户成为商户的关注用户之后，则商户可以通过本接口查询关注者的绑定账户，以便补全异常情况下的单边账户数据。
 *
 * @author auto create
 * @since 1.0, 2016-01-26 15:03:45
 */
public class AlipayMobileStdPublicAccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7547185218673741423L;

	/**
	 * 支付宝用户id
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
