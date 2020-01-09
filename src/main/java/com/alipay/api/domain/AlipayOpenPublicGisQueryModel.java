package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取用户地理位置
 *
 * @author auto create
 * @since 1.0, 2018-12-24 10:54:47
 */
public class AlipayOpenPublicGisQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5146837667588759684L;

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
