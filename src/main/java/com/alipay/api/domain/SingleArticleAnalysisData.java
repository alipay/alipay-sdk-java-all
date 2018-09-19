package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单篇文章分析数据
 *
 * @author auto create
 * @since 1.0, 2018-04-25 18:27:48
 */
public class SingleArticleAnalysisData extends AlipayObject {

	private static final long serialVersionUID = 2631569988197282345L;

	/**
	 * 人均阅读时长
	 */
	@ApiField("avg_read_time")
	private String avgReadTime;

	/**
	 * 文章发布日期
	 */
	@ApiField("date")
	private String date;

	/**
	 * 送达人数
	 */
	@ApiField("deliver_user_cnt")
	private Long deliverUserCnt;

	/**
	 * 曝光人数
	 */
	@ApiField("expose_user_cnt")
	private Long exposeUserCnt;

	/**
	 * 点赞数
	 */
	@ApiField("praise_user_cnt")
	private Long praiseUserCnt;

	/**
	 * 阅读人数
	 */
	@ApiField("read_user_cnt")
	private Long readUserCnt;

	/**
	 * 评论数
	 */
	@ApiField("reply_user_cnt")
	private Long replyUserCnt;

	/**
	 * 分享人数
	 */
	@ApiField("share_user_cnt")
	private Long shareUserCnt;

	/**
	 * 文章标题
	 */
	@ApiField("title")
	private String title;

	public String getAvgReadTime() {
		return this.avgReadTime;
	}
	public void setAvgReadTime(String avgReadTime) {
		this.avgReadTime = avgReadTime;
	}

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public Long getDeliverUserCnt() {
		return this.deliverUserCnt;
	}
	public void setDeliverUserCnt(Long deliverUserCnt) {
		this.deliverUserCnt = deliverUserCnt;
	}

	public Long getExposeUserCnt() {
		return this.exposeUserCnt;
	}
	public void setExposeUserCnt(Long exposeUserCnt) {
		this.exposeUserCnt = exposeUserCnt;
	}

	public Long getPraiseUserCnt() {
		return this.praiseUserCnt;
	}
	public void setPraiseUserCnt(Long praiseUserCnt) {
		this.praiseUserCnt = praiseUserCnt;
	}

	public Long getReadUserCnt() {
		return this.readUserCnt;
	}
	public void setReadUserCnt(Long readUserCnt) {
		this.readUserCnt = readUserCnt;
	}

	public Long getReplyUserCnt() {
		return this.replyUserCnt;
	}
	public void setReplyUserCnt(Long replyUserCnt) {
		this.replyUserCnt = replyUserCnt;
	}

	public Long getShareUserCnt() {
		return this.shareUserCnt;
	}
	public void setShareUserCnt(Long shareUserCnt) {
		this.shareUserCnt = shareUserCnt;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
