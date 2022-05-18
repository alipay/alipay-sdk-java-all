package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 钢铁匣查询准入条件
 *
 * @author auto create
 * @since 1.0, 2021-10-12 19:00:36
 */
public class AlipayUserSafeboxConditionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5541194693524544582L;

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
