package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户企业列表
 *
 * @author auto create
 * @since 1.0, 2022-09-07 15:35:43
 */
public class AlipayCommerceEcUserEnterpriseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7623129671272981573L;

	/**
	 * 用户id
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
