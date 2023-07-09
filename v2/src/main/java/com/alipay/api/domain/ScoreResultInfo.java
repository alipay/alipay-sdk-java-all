package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店得分结果信息
 *
 * @author auto create
 * @since 1.0, 2023-07-06 08:07:26
 */
public class ScoreResultInfo extends AlipayObject {

	private static final long serialVersionUID = 5689127232186145151L;

	/**
	 * 品类卖力值，客户请求入参获取分数类型（score_type），如获取该热力值会返回，对应0-100分
	 */
	@ApiField("category_score")
	private Long categoryScore;

	/**
	 * 居住地热力值，客户请求入参获取分数类型（score_type），如获取该热力值会返回，对应0-100分
	 */
	@ApiField("crowd_home_score")
	private Long crowdHomeScore;

	/**
	 * 常驻地热力值，客户请求入参获取分数类型（score_type），如获取该热力值会返回，对应0-100分
	 */
	@ApiField("crowd_resident_score")
	private Long crowdResidentScore;

	/**
	 * 工作地热力值，客户请求入参获取分数类型（score_type），如获取该热力值会返回，对应0-100分
	 */
	@ApiField("crowd_work_score")
	private Long crowdWorkScore;

	/**
	 * 全店卖力值，客户请求入参获取分数类型（score_type），如获取该热力值会返回，对应0-100分
	 */
	@ApiField("sale_score")
	private Long saleScore;

	public Long getCategoryScore() {
		return this.categoryScore;
	}
	public void setCategoryScore(Long categoryScore) {
		this.categoryScore = categoryScore;
	}

	public Long getCrowdHomeScore() {
		return this.crowdHomeScore;
	}
	public void setCrowdHomeScore(Long crowdHomeScore) {
		this.crowdHomeScore = crowdHomeScore;
	}

	public Long getCrowdResidentScore() {
		return this.crowdResidentScore;
	}
	public void setCrowdResidentScore(Long crowdResidentScore) {
		this.crowdResidentScore = crowdResidentScore;
	}

	public Long getCrowdWorkScore() {
		return this.crowdWorkScore;
	}
	public void setCrowdWorkScore(Long crowdWorkScore) {
		this.crowdWorkScore = crowdWorkScore;
	}

	public Long getSaleScore() {
		return this.saleScore;
	}
	public void setSaleScore(Long saleScore) {
		this.saleScore = saleScore;
	}

}
