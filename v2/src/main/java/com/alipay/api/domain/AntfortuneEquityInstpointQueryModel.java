package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 财富开放机构积分查询
 *
 * @author auto create
 * @since 1.0, 2023-01-04 13:49:52
 */
public class AntfortuneEquityInstpointQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2446477655581739439L;

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
