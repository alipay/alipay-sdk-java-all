package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 教育行业认证信息查询
 *
 * @author auto create
 * @since 1.0, 2019-01-29 14:18:00
 */
public class AlipayCommerceEducateCertifiedInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5644296721886641396L;

	/**
	 * 支付宝用户ID
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
