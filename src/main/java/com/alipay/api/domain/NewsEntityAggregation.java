package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 聚合结果
 *
 * @author auto create
 * @since 1.0, 2021-12-22 17:28:08
 */
public class NewsEntityAggregation extends AlipayObject {

	private static final long serialVersionUID = 3855694554958747597L;

	/**
	 * 企业名称聚合
	 */
	@ApiListField("cows")
	@ApiField("news_aggregation_value")
	private List<NewsAggregationValue> cows;

	/**
	 * 机构名称聚合
	 */
	@ApiListField("ogws")
	@ApiField("news_aggregation_value")
	private List<NewsAggregationValue> ogws;

	/**
	 * 人物名称聚合
	 */
	@ApiListField("ppws")
	@ApiField("news_aggregation_value")
	private List<NewsAggregationValue> ppws;

	public List<NewsAggregationValue> getCows() {
		return this.cows;
	}
	public void setCows(List<NewsAggregationValue> cows) {
		this.cows = cows;
	}

	public List<NewsAggregationValue> getOgws() {
		return this.ogws;
	}
	public void setOgws(List<NewsAggregationValue> ogws) {
		this.ogws = ogws;
	}

	public List<NewsAggregationValue> getPpws() {
		return this.ppws;
	}
	public void setPpws(List<NewsAggregationValue> ppws) {
		this.ppws = ppws;
	}

}
