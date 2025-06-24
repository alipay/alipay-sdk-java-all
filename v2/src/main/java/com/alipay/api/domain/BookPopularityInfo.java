package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 热度信息，为了达到更好效果，建议合作方能够给到
 *
 * @author auto create
 * @since 1.0, 2023-07-07 11:42:31
 */
public class BookPopularityInfo extends AlipayObject {

	private static final long serialVersionUID = 5445294311777564611L;

	/**
	 * 书籍购买量
	 */
	@ApiField("buy_count")
	private Long buyCount;

	/**
	 * 书籍收藏量
	 */
	@ApiField("collect_count")
	private Long collectCount;

	/**
	 * 书籍阅读量
	 */
	@ApiField("read_count")
	private Long readCount;

	/**
	 * 书籍评分（10分制，保留一位小数）
	 */
	@ApiField("score")
	private String score;

	/**
	 * 书籍分享量
	 */
	@ApiField("share_count")
	private Long shareCount;

	public Long getBuyCount() {
		return this.buyCount;
	}
	public void setBuyCount(Long buyCount) {
		this.buyCount = buyCount;
	}

	public Long getCollectCount() {
		return this.collectCount;
	}
	public void setCollectCount(Long collectCount) {
		this.collectCount = collectCount;
	}

	public Long getReadCount() {
		return this.readCount;
	}
	public void setReadCount(Long readCount) {
		this.readCount = readCount;
	}

	public String getScore() {
		return this.score;
	}
	public void setScore(String score) {
		this.score = score;
	}

	public Long getShareCount() {
		return this.shareCount;
	}
	public void setShareCount(Long shareCount) {
		this.shareCount = shareCount;
	}

}
