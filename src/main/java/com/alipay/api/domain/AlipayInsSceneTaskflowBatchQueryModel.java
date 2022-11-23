package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询权益流水列表
 *
 * @author auto create
 * @since 1.0, 2022-11-15 19:57:50
 */
public class AlipayInsSceneTaskflowBatchQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8743273975418546925L;

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
