package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.kids.account.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 02:06:46
 */
public class AlipayCommerceKidsAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8774124141595429841L;

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
