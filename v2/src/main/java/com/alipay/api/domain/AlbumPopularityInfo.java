package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 专辑热度信息
 *
 * @author auto create
 * @since 1.0, 2024-09-03 11:41:01
 */
public class AlbumPopularityInfo extends AlipayObject {

	private static final long serialVersionUID = 4445867488394193486L;

	/**
	 * 专辑购买量
	 */
	@ApiField("buy_count")
	private Long buyCount;

	/**
	 * 专辑收藏量
	 */
	@ApiField("collect_count")
	private Long collectCount;

	/**
	 * 专辑播放量
	 */
	@ApiField("play_count")
	private Long playCount;

	/**
	 * 专辑评分，十分制
	 */
	@ApiField("score")
	private String score;

	/**
	 * 专辑分享量
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

	public Long getPlayCount() {
		return this.playCount;
	}
	public void setPlayCount(Long playCount) {
		this.playCount = playCount;
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
