package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.mcomment.newsfeed.add response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 10:19:25
 */
public class AlipaySocialBaseMcommentNewsfeedAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 1583748564723265618L;

	/** 
	 * 新评论id
	 */
	@ApiField("newsfeed_id")
	private String newsfeedId;

	public void setNewsfeedId(String newsfeedId) {
		this.newsfeedId = newsfeedId;
	}
	public String getNewsfeedId( ) {
		return this.newsfeedId;
	}

}
