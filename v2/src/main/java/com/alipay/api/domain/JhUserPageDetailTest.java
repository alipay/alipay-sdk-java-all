package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试用
 *
 * @author auto create
 * @since 1.0, 2025-04-23 13:17:27
 */
public class JhUserPageDetailTest extends AlipayObject {

	private static final long serialVersionUID = 3197852495647196262L;

	/**
	 * 状态
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
