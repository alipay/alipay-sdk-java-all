package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权给我的包裹授权关系查询
 *
 * @author auto create
 * @since 1.0, 2020-07-02 10:03:46
 */
public class AlipayCommerceLogisticsPkgauthrelationAuthtomeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5132427246971196728L;

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
