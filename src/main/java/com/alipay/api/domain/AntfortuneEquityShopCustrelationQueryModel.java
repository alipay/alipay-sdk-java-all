package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户与店铺的关注关系
 *
 * @author auto create
 * @since 1.0, 2019-02-26 11:08:27
 */
public class AntfortuneEquityShopCustrelationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4819999171316361565L;

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
