package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单相关积分查询
 *
 * @author auto create
 * @since 1.0, 2022-12-14 15:32:16
 */
public class AlipayMerchantOrderPointQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4341873138856639646L;

	/**
	 * 用户(user中的identity)在应用(appid)下的唯一标识，当issuer为ALIPAY且type为USER_ID时使用
openid改造，新增open_id字段和相关错误码
	 */
	@ApiField("open_id")
	private String openId;

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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

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
