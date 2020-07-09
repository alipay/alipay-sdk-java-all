package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询是否开通森林
 *
 * @author auto create
 * @since 1.0, 2020-03-11 23:38:30
 */
public class AlipayUserCharityForestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4184378746423425539L;

	/**
	 * 用户的支付宝账户ID
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
