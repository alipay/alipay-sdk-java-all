package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 秉哲测试
 *
 * @author auto create
 * @since 1.0, 2016-10-12 11:51:48
 */
public class AlipayOpenAppBingzheTestModel extends AlipayObject {

	private static final long serialVersionUID = 5474417623241233333L;

	/**
	 * 用户ID
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
