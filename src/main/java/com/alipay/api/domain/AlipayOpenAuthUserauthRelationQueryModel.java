package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 协议授权关系查询
 *
 * @author auto create
 * @since 1.0, 2022-04-22 14:28:30
 */
public class AlipayOpenAuthUserauthRelationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1489255182599119275L;

	/**
	 * 支付宝用户uid
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
