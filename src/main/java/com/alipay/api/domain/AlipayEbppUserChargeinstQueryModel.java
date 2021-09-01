package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户常缴机构与城市接口
 *
 * @author auto create
 * @since 1.0, 2018-04-26 13:54:26
 */
public class AlipayEbppUserChargeinstQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4143921432813222846L;

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
