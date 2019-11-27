package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询小钱袋孩子信息
 *
 * @author auto create
 * @since 1.0, 2018-11-08 11:39:20
 */
public class AlipayCommerceEducateMoneyboxChildrenQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5878944241224728362L;

	/**
	 * 蚂蚁统一会员 id，为 2088 开头的支付宝用户唯一 id，开发者需通过alipay.user.userinfo.share 接口获取此值
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
