package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-09-05 17:02:39
 */
public class HitSegmentDetail extends AlipayObject {

	private static final long serialVersionUID = 4766773715996721819L;

	/**
	 * 分片内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 分片元数据
	 */
	@ApiField("meta")
	private HitSegmentMetaDetail meta;

	/**
	 * 分片评分
	 */
	@ApiField("score")
	private HitSegmentScoreDetail score;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public HitSegmentMetaDetail getMeta() {
		return this.meta;
	}
	public void setMeta(HitSegmentMetaDetail meta) {
		this.meta = meta;
	}

	public HitSegmentScoreDetail getScore() {
		return this.score;
	}
	public void setScore(HitSegmentScoreDetail score) {
		this.score = score;
	}

}
