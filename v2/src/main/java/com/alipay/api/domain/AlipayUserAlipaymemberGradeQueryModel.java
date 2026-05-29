package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户等级
 *
 * @author auto create
 * @since 1.0, 2026-03-23 20:13:34
 */
public class AlipayUserAlipaymemberGradeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5448158866961717747L;

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
