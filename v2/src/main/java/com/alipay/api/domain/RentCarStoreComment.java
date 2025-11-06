package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租车门店评价
 *
 * @author auto create
 * @since 1.0, 2025-05-06 15:26:35
 */
public class RentCarStoreComment extends AlipayObject {

	private static final long serialVersionUID = 3833846431187477814L;

	/**
	 * 评价内容，100字以内
	 */
	@ApiField("comment_content")
	private String commentContent;

	/**
	 * 评价时间
	 */
	@ApiField("comment_time")
	private Date commentTime;

	/**
	 * 门店评价类型
	 */
	@ApiField("comment_type")
	private String commentType;

	public String getCommentContent() {
		return this.commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public Date getCommentTime() {
		return this.commentTime;
	}
	public void setCommentTime(Date commentTime) {
		this.commentTime = commentTime;
	}

	public String getCommentType() {
		return this.commentType;
	}
	public void setCommentType(String commentType) {
		this.commentType = commentType;
	}

}
