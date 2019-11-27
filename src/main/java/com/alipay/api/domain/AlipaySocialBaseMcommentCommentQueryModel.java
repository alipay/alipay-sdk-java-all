package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 微动态评论列表查询
 *
 * @author auto create
 * @since 1.0, 2016-11-07 14:32:41
 */
public class AlipaySocialBaseMcommentCommentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3311872995389835997L;

	/**
	 * 最后一条评论ID，用于分页
	 */
	@ApiField("last_comment_id")
	private String lastCommentId;

	/**
	 * 分页大小（<=20）
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 被评论对象的ID
	 */
	@ApiField("target_id")
	private String targetId;

	public String getLastCommentId() {
		return this.lastCommentId;
	}
	public void setLastCommentId(String lastCommentId) {
		this.lastCommentId = lastCommentId;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

}
