package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试用
 *
 * @author auto create
 * @since 1.0, 2025-04-10 11:19:05
 */
public class JhUserPageDetailTest extends AlipayObject {

	private static final long serialVersionUID = 6218581753569151714L;

	/**
	 * 支付宝用户的userId。
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
