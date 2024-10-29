package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.mcomment.newsfeed.add response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-05 11:03:21
 */
public class AlipaySocialBaseMcommentNewsfeedAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 4869824754339867516L;

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
