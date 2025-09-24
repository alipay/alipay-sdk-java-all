package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.kids.account.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:42
 */
public class AlipayCommerceKidsAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3896187368494584637L;

	/** 
	 * 登陆名
	 */
	@ApiField("login_name")
	private String loginName;

	/** 
	 * 会员openid
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 会员id
	 */
	@ApiField("user_id")
	private String userId;

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginName( ) {
		return this.loginName;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
