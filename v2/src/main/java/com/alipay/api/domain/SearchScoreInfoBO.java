package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 打分特征组
 *
 * @author auto create
 * @since 1.0, 2025-09-23 16:47:53
 */
public class SearchScoreInfoBO extends AlipayObject {

	private static final long serialVersionUID = 3447417185692191713L;

	/**
	 * 权威分，十分制
	 */
	@ApiField("authority_score")
	private String authorityScore;

	/**
	 * 质量分，十分制
	 */
	@ApiField("quality_score")
	private String qualityScore;

	/**
	 * 相关性分，十分制
	 */
	@ApiField("relevance_score")
	private String relevanceScore;

	/**
	 * 时效分，十分制
	 */
	@ApiField("timeliness_score")
	private String timelinessScore;

	public String getAuthorityScore() {
		return this.authorityScore;
	}
	public void setAuthorityScore(String authorityScore) {
		this.authorityScore = authorityScore;
	}

	public String getQualityScore() {
		return this.qualityScore;
	}
	public void setQualityScore(String qualityScore) {
		this.qualityScore = qualityScore;
	}

	public String getRelevanceScore() {
		return this.relevanceScore;
	}
	public void setRelevanceScore(String relevanceScore) {
		this.relevanceScore = relevanceScore;
	}

	public String getTimelinessScore() {
		return this.timelinessScore;
	}
	public void setTimelinessScore(String timelinessScore) {
		this.timelinessScore = timelinessScore;
	}

}
