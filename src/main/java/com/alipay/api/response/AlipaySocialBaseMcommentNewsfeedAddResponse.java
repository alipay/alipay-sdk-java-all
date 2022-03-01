package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.mcomment.newsfeed.add response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-30 15:35:26
 */
public class AlipaySocialBaseMcommentNewsfeedAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 8276749636373817188L;

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
