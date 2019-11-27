package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.khome.comment.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOfflineKhomeCommentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3898462126953477514L;

	/** 
	 * 订单评价内容
	 */
	@ApiField("comment_content")
	private String commentContent;

	/** 
	 * 订单评价图片
	 */
	@ApiListField("comment_imgs")
	@ApiField("string")
	private List<String> commentImgs;

	/** 
	 * 订单评价标签
	 */
	@ApiListField("comment_tags")
	@ApiField("string")
	private List<String> commentTags;

	/** 
	 * 订单评价时间
	 */
	@ApiField("comment_time")
	private String commentTime;

	/** 
	 * 评价分数
	 */
	@ApiField("score")
	private Long score;

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public String getCommentContent( ) {
		return this.commentContent;
	}

	public void setCommentImgs(List<String> commentImgs) {
		this.commentImgs = commentImgs;
	}
	public List<String> getCommentImgs( ) {
		return this.commentImgs;
	}

	public void setCommentTags(List<String> commentTags) {
		this.commentTags = commentTags;
	}
	public List<String> getCommentTags( ) {
		return this.commentTags;
	}

	public void setCommentTime(String commentTime) {
		this.commentTime = commentTime;
	}
	public String getCommentTime( ) {
		return this.commentTime;
	}

	public void setScore(Long score) {
		this.score = score;
	}
	public Long getScore( ) {
		return this.score;
	}

}
