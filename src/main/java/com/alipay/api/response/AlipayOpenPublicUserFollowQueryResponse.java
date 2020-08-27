package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.user.follow.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-03-18 14:15:10
 */
public class AlipayOpenPublicUserFollowQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4436847938918993921L;

	/** 
	 * 用户是否关注，T代表已关注，F代表未关注
	 */
	@ApiField("is_follow")
	private String isFollow;

	public void setIsFollow(String isFollow) {
		this.isFollow = isFollow;
	}
	public String getIsFollow( ) {
		return this.isFollow;
	}

}
