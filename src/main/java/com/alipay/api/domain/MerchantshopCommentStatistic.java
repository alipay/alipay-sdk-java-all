package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 洗车保养评论统计信息
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:21:57
 */
public class MerchantshopCommentStatistic extends AlipayObject {

	private static final long serialVersionUID = 4637293184989861325L;

	/**
	 * 评论总数
	 */
	@ApiField("comment_count")
	private Long commentCount;

	/**
	 * 评分（平均分），两位小数
	 */
	@ApiField("score")
	private Long score;

	public Long getCommentCount() {
		return this.commentCount;
	}
	public void setCommentCount(Long commentCount) {
		this.commentCount = commentCount;
	}

	public Long getScore() {
		return this.score;
	}
	public void setScore(Long score) {
		this.score = score;
	}

}
