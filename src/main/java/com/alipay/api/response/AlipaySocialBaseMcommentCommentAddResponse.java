package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.mcomment.comment.add response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySocialBaseMcommentCommentAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 2468913431178447382L;

	/** 
	 * 发表成功后生成的评论ID
	 */
	@ApiField("comment_id")
	private String commentId;

	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}
	public String getCommentId( ) {
		return this.commentId;
	}

}
