package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户是否已经关注生活号接口
 *
 * @author auto create
 * @since 1.0, 2019-07-11 13:36:13
 */
public class AlipayOpenPublicFollowingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2637775341977122966L;

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
