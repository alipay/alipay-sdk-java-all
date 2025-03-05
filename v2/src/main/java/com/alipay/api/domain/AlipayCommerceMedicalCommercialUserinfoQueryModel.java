package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询开通权益包用户信息
 *
 * @author auto create
 * @since 1.0, 2025-03-03 10:23:46
 */
public class AlipayCommerceMedicalCommercialUserinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7818369474854317223L;

	/**
	 * 支付宝用户的userId。
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
