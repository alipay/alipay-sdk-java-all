package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店得分筛选范围
 *
 * @author auto create
 * @since 1.0, 2024-04-12 17:39:03
 */
public class ScoreRangeInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8527269376938452253L;

	/**
	 * 最大品类卖力值，填写规则：0～100之间的整数或小数，小数位最多6位
	 */
	@ApiField("category_score_max")
	private String categoryScoreMax;

	/**
	 * 最小品类卖力值，填写规则：0～100之间的整数或小数，小数位最多6位
	 */
	@ApiField("category_score_min")
	private String categoryScoreMin;

	/**
	 * 最大热力值，填写规则：0～100之间的整数或小数，小数位最多6位
	 */
	@ApiField("crowd_score_max")
	private String crowdScoreMax;

	/**
	 * 最小热力值，填写规则：0～100之间的整数或小数，小数位最多6位
	 */
	@ApiField("crowd_score_min")
	private String crowdScoreMin;

	/**
	 * 热力值类型（多选一），用于热力值范围筛选，对应crowd_score_min和crowd_score_max范围
	 */
	@ApiField("crowd_score_type")
	private String crowdScoreType;

	/**
	 * 最大卖力值，填写规则：0～100之间的整数或小数，小数位最多6位
	 */
	@ApiField("sale_score_max")
	private String saleScoreMax;

	/**
	 * 最小卖力值，填写规则：0～100之间的整数或小数，小数位最多6位
	 */
	@ApiField("sale_score_min")
	private String saleScoreMin;

	public String getCategoryScoreMax() {
		return this.categoryScoreMax;
	}
	public void setCategoryScoreMax(String categoryScoreMax) {
		this.categoryScoreMax = categoryScoreMax;
	}

	public String getCategoryScoreMin() {
		return this.categoryScoreMin;
	}
	public void setCategoryScoreMin(String categoryScoreMin) {
		this.categoryScoreMin = categoryScoreMin;
	}

	public String getCrowdScoreMax() {
		return this.crowdScoreMax;
	}
	public void setCrowdScoreMax(String crowdScoreMax) {
		this.crowdScoreMax = crowdScoreMax;
	}

	public String getCrowdScoreMin() {
		return this.crowdScoreMin;
	}
	public void setCrowdScoreMin(String crowdScoreMin) {
		this.crowdScoreMin = crowdScoreMin;
	}

	public String getCrowdScoreType() {
		return this.crowdScoreType;
	}
	public void setCrowdScoreType(String crowdScoreType) {
		this.crowdScoreType = crowdScoreType;
	}

	public String getSaleScoreMax() {
		return this.saleScoreMax;
	}
	public void setSaleScoreMax(String saleScoreMax) {
		this.saleScoreMax = saleScoreMax;
	}

	public String getSaleScoreMin() {
		return this.saleScoreMin;
	}
	public void setSaleScoreMin(String saleScoreMin) {
		this.saleScoreMin = saleScoreMin;
	}

}
