package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学生身份授权查询
 *
 * @author auto create
 * @since 1.0, 2020-05-20 14:18:26
 */
public class AlipayCommerceEducateStudentIdentityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8499784448211583816L;

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
