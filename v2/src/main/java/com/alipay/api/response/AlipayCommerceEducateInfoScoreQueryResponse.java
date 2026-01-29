package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.info.score.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:55:36
 */
public class AlipayCommerceEducateInfoScoreQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1588816241849978449L;

	/** 
	 * 成绩评价
	 */
	@ApiField("score_evaluate")
	private String scoreEvaluate;

	/** 
	 * 成绩类型：分数：grade，等第：order，奖项等级：level，奖项级别：rank，奖牌：medal，自定义：user_defined
	 */
	@ApiField("score_type")
	private String scoreType;

	/** 
	 * 分数：浮点型，最多两位小数，等第：（S、A、B、C、D），奖项等级：一等奖、二等奖、三等奖、……），奖项级别：金奖、银奖、铜奖），奖牌：金牌、银牌、铜牌），自定义：奖项名称不能超过10个汉字
	 */
	@ApiField("score_value")
	private String scoreValue;

	public void setScoreEvaluate(String scoreEvaluate) {
		this.scoreEvaluate = scoreEvaluate;
	}
	public String getScoreEvaluate( ) {
		return this.scoreEvaluate;
	}

	public void setScoreType(String scoreType) {
		this.scoreType = scoreType;
	}
	public String getScoreType( ) {
		return this.scoreType;
	}

	public void setScoreValue(String scoreValue) {
		this.scoreValue = scoreValue;
	}
	public String getScoreValue( ) {
		return this.scoreValue;
	}

}
