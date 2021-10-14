package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权给我的包裹授权关系查询
 *
 * @author auto create
 * @since 1.0, 2021-05-11 17:09:56
 */
public class AlipayCommerceLogisticsPkgauthrelationAuthtomeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5168771367133875142L;

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
