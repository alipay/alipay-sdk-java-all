package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.content.live.comment.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-22 13:57:29
 */
public class AlipayContentLiveCommentSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3565376627581986459L;

	/** 
	 * 外部在Tab3侧生成的评论id
	 */
	@ApiField("alipay_comment_id")
	private String alipayCommentId;

	public void setAlipayCommentId(String alipayCommentId) {
		this.alipayCommentId = alipayCommentId;
	}
	public String getAlipayCommentId( ) {
		return this.alipayCommentId;
	}

}
