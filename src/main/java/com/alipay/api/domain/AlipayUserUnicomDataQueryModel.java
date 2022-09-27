package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁宝卡联通流量查询接口
 *
 * @author auto create
 * @since 1.0, 2022-09-21 18:13:18
 */
public class AlipayUserUnicomDataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4793741261915782541L;

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
