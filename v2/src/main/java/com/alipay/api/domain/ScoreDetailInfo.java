package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子维度评价明细表
 *
 * @author auto create
 * @since 1.0, 2023-04-24 23:27:37
 */
public class ScoreDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 5255637867475761784L;

	/**
	 * 子维度分数
	 */
	@ApiField("score")
	private String score;

	/**
	 * 子维度编码
	 */
	@ApiField("score_code")
	private String scoreCode;

	/**
	 * 服务效果
	 */
	@ApiField("score_name")
	private String scoreName;

	public String getScore() {
		return this.score;
	}
	public void setScore(String score) {
		this.score = score;
	}

	public String getScoreCode() {
		return this.scoreCode;
	}
	public void setScoreCode(String scoreCode) {
		this.scoreCode = scoreCode;
	}

	public String getScoreName() {
		return this.scoreName;
	}
	public void setScoreName(String scoreName) {
		this.scoreName = scoreName;
	}

}
