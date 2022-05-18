package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 解除协议授权关系
 *
 * @author auto create
 * @since 1.0, 2022-04-22 14:28:48
 */
public class AlipayOpenAuthUserauthRelationCancelModel extends AlipayObject {

	private static final long serialVersionUID = 3412996457646522619L;

	/**
	 * 用户支付宝uid
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
