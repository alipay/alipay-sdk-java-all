package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 南鲸开放链路测试
 *
 * @author auto create
 * @since 1.0, 2019-04-17 19:38:12
 */
public class AlipayCommerceLogisticsNanjingtestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4622218978771829823L;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户信息
	 */
	@ApiField("user_info")
	private UserInfoFromNJ userInfo;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public UserInfoFromNJ getUserInfo() {
		return this.userInfo;
	}
	public void setUserInfo(UserInfoFromNJ userInfo) {
		this.userInfo = userInfo;
	}

}
