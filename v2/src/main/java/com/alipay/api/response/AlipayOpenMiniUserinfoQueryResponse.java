package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.userinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 21:19:15
 */
public class AlipayOpenMiniUserinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7534488615694559528L;

	/** 
	 * 支付宝头像
	 */
	@ApiField("avatar")
	private String avatar;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 姓名
	 */
	@ApiField("user_name")
	private String userName;

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getAvatar( ) {
		return this.avatar;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName( ) {
		return this.userName;
	}

}
