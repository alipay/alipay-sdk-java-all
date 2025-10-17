package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 命中的分片评分
 *
 * @author auto create
 * @since 1.0, 2025-09-05 16:57:38
 */
public class HitSegmentScoreDetail extends AlipayObject {

	private static final long serialVersionUID = 1217424574299133558L;

	/**
	 * 全文相似度评分（以小数形式表示，取值范围为0到1）
	 */
	@ApiField("full_text_score")
	private String fullTextScore;

	/**
	 * 整体评分（以小数形式表示，取值范围为0到1）
	 */
	@ApiField("score")
	private String score;

	/**
	 * 向量相似度评分（以小数形式表示，取值范围为0到1）
	 */
	@ApiField("vector_score")
	private String vectorScore;

	public String getFullTextScore() {
		return this.fullTextScore;
	}
	public void setFullTextScore(String fullTextScore) {
		this.fullTextScore = fullTextScore;
	}

	public String getScore() {
		return this.score;
	}
	public void setScore(String score) {
		this.score = score;
	}

	public String getVectorScore() {
		return this.vectorScore;
	}
	public void setVectorScore(String vectorScore) {
		this.vectorScore = vectorScore;
	}

}
