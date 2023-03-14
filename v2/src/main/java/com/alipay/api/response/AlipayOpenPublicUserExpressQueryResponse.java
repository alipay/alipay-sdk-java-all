package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.user.express.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 05:31:39
 */
public class AlipayOpenPublicUserExpressQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2898576917791668848L;

	/** 
	 * 是否为快捷绑卡用户
	 */
	@ApiField("express_user")
	private Boolean expressUser;

	/** 
	 * 支付宝用户唯一标识
	 */
	@ApiField("open_id")
	private String openId;

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
