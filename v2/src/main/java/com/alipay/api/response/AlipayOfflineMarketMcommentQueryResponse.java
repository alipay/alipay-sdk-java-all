package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.mcomment.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 06:23:44
 */
public class AlipayOfflineMarketMcommentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6614451163372661261L;

	/** 
	 * 本次交易号对应的评价在支付宝的唯一标识.评价id
【注意】当仅评论信息状态为：已评论【comment_status='HASCOMMENT'】，才会返回该值
	 */
	@ApiField("comment_id")
	private String commentId;

	/** 
	 * 注意：该字段描述评论状态。目前该字段区分2种类型状态
当comment_status='NOCOMMENT' 标识该笔交易未发生过评论。
当comment_status='HASCOMMENT' 标识该笔交易已经评论。评论状态正常
当comment_status='DELETED'标识该笔交易曾经评论过，当前时间点，该评论已经删除
	 */
	@ApiField("comment_status")
	private String commentStatus;

	/** 
	 * 评价时间
【注意】当仅评论信息状态为：已评论【comment_status='HASCOMMENT'】，才会返回该值
	 */
	@ApiField("comment_time")
	private Date commentTime;

	/** 
	 * 评价星级
【注意】当仅评论信息状态为：已评论【comment_status='HASCOMMENT'】，才会返回该值
	 */
	@ApiField("score")
	private Long score;

	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}
	public String getCommentId( ) {
		return this.commentId;
	}

	public void setCommentStatus(String commentStatus) {
		this.commentStatus = commentStatus;
	}
	public String getCommentStatus( ) {
		return this.commentStatus;
	}

	public void setCommentTime(Date commentTime) {
		this.commentTime = commentTime;
	}
	public Date getCommentTime( ) {
		return this.commentTime;
	}

	public void setScore(Long score) {
		this.score = score;
	}
	public Long getScore( ) {
		return this.score;
	}

}
