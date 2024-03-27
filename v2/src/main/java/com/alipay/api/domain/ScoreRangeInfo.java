package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店得分筛选范围
 *
 * @author auto create
 * @since 1.0, 2023-07-14 17:13:15
 */
public class ScoreRangeInfo extends AlipayObject {

	private static final long serialVersionUID = 1669979559548683151L;

	/**
	 * 最大品类卖力值范围区间，对应0-100分
	 */
	@ApiField("category_score_max")
	private Long categoryScoreMax;

	/**
	 * 最小品类卖力值范围区间，对应0-100分
	 */
	@ApiField("category_score_min")
	private Long categoryScoreMin;

	/**
	 * 最大热力值范围区间，对应0-100分
	 */
	@ApiField("crowd_score_max")
	private Long crowdScoreMax;

	/**
	 * 最小热力值范围区间，对应0-100分
	 */
	@ApiField("crowd_score_min")
	private Long crowdScoreMin;

	/**
	 * 热力值类型（多选一），用于热力值范围筛选，对应crowd_score_min和crowd_score_max范围
	 */
	@ApiField("crowd_score_type")
	private String crowdScoreType;

	/**
	 * 最大卖力值范围区间，对应0-100分
	 */
	@ApiField("sale_score_max")
	private Long saleScoreMax;

	/**
	 * 最小卖力值范围区间，对应0-100分
	 */
	@ApiField("sale_score_min")
	private Long saleScoreMin;

	public Long getCategoryScoreMax() {
		return this.categoryScoreMax;
	}
	public void setCategoryScoreMax(Long categoryScoreMax) {
		this.categoryScoreMax = categoryScoreMax;
	}

	public Long getCategoryScoreMin() {
		return this.categoryScoreMin;
	}
	public void setCategoryScoreMin(Long categoryScoreMin) {
		this.categoryScoreMin = categoryScoreMin;
	}

	public Long getCrowdScoreMax() {
		return this.crowdScoreMax;
	}
	public void setCrowdScoreMax(Long crowdScoreMax) {
		this.crowdScoreMax = crowdScoreMax;
	}

	public Long getCrowdScoreMin() {
		return this.crowdScoreMin;
	}
	public void setCrowdScoreMin(Long crowdScoreMin) {
		this.crowdScoreMin = crowdScoreMin;
	}

	public String getCrowdScoreType() {
		return this.crowdScoreType;
	}
	public void setCrowdScoreType(String crowdScoreType) {
		this.crowdScoreType = crowdScoreType;
	}

	public Long getSaleScoreMax() {
		return this.saleScoreMax;
	}
	public void setSaleScoreMax(Long saleScoreMax) {
		this.saleScoreMax = saleScoreMax;
	}

	public Long getSaleScoreMin() {
		return this.saleScoreMin;
	}
	public void setSaleScoreMin(Long saleScoreMin) {
		this.saleScoreMin = saleScoreMin;
	}

}
