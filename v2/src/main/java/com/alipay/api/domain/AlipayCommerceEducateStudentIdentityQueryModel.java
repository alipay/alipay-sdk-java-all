package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学生身份授权查询
 *
 * @author auto create
 * @since 1.0, 2023-06-19 20:52:07
 */
public class AlipayCommerceEducateStudentIdentityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6393293675419762357L;

	/**
	 * 蚂蚁统一会员ID
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
