package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.following.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-11 13:36:21
 */
public class AlipayOpenPublicFollowingQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5399758191535123385L;

	/** 
	 * 用户是否关注商户的生活号
	 */
	@ApiField("followed")
	private Boolean followed;

	public void setFollowed(Boolean followed) {
		this.followed = followed;
	}
	public Boolean getFollowed( ) {
		return this.followed;
	}

}
