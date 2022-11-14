package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取用户地理位置
 *
 * @author auto create
 * @since 1.0, 2022-11-14 11:26:49
 */
public class AlipayOpenPublicGisQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2865696116874883341L;

	/**
	 * 该用户的userId
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
