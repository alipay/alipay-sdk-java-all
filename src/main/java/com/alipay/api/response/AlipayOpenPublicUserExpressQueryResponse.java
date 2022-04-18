package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.user.express.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-21 23:48:27
 */
public class AlipayOpenPublicUserExpressQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4216536776753854986L;

	/** 
	 * 是否为快捷绑卡用户
	 */
	@ApiField("express_user")
	private Boolean expressUser;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setExpressUser(Boolean expressUser) {
		this.expressUser = expressUser;
	}
	public Boolean getExpressUser( ) {
		return this.expressUser;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
