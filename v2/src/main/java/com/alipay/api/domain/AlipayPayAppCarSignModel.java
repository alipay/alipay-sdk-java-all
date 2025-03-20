package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车机支付授权开通
 *
 * @author auto create
 * @since 1.0, 2020-04-15 21:23:16
 */
public class AlipayPayAppCarSignModel extends AlipayObject {

	private static final long serialVersionUID = 6334349322986196758L;

	/**
	 * 当前登录的用户ID
	 */
	@ApiField("current_user_id")
	private String currentUserId;

	public String getCurrentUserId() {
		return this.currentUserId;
	}
	public void setCurrentUserId(String currentUserId) {
		this.currentUserId = currentUserId;
	}

}
