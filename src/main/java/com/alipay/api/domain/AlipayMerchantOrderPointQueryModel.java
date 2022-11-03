package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单相关积分查询
 *
 * @author auto create
 * @since 1.0, 2022-11-01 11:34:44
 */
public class AlipayMerchantOrderPointQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8541313174211121433L;

	/**
	 * 需要查询的积分类型，如家庭积分、会员积分、返佣积分等等
	 */
	@ApiField("point_type")
	private String pointType;

	/**
	 * 用户身份
	 */
	@ApiField("user")
	private UserIdentity user;

	public String getPointType() {
		return this.pointType;
	}
	public void setPointType(String pointType) {
		this.pointType = pointType;
	}

	public UserIdentity getUser() {
		return this.user;
	}
	public void setUser(UserIdentity user) {
		this.user = user;
	}

}
