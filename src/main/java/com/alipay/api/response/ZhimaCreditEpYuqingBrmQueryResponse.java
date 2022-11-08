package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.NewsEntityAggregation;
import com.alipay.api.domain.NewsSource;
import com.alipay.api.domain.NewsAggregationValue;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.yuqing.brm.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-07 17:16:44
 */
public class ZhimaCreditEpYuqingBrmQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5788262667868826929L;

	/** 
	 * 实体聚合结果
	 */
	@ApiField("entity_aggregation")
	private NewsEntityAggregation entityAggregation;

	/** 
	 * 搜索结果
	 */
	@ApiListField("hits")
	@ApiField("news_source")
	private List<NewsSource> hits;

	/** 
	 * 标签聚合结果
	 */
	@ApiListField("label_aggregation")
	@ApiField("news_aggregation_value")
	private List<NewsAggregationValue> labelAggregation;

	/** 
	 * 搜索结果总数
	 */
	@ApiField("total")
	private Long total;

	public void setEntityAggregation(NewsEntityAggregation entityAggregation) {
		this.entityAggregation = entityAggregation;
	}
	public NewsEntityAggregation getEntityAggregation( ) {
		return this.entityAggregation;
	}

	public void setHits(List<NewsSource> hits) {
		this.hits = hits;
	}
	public List<NewsSource> getHits( ) {
		return this.hits;
	}

	public void setLabelAggregation(List<NewsAggregationValue> labelAggregation) {
		this.labelAggregation = labelAggregation;
	}
	public List<NewsAggregationValue> getLabelAggregation( ) {
		return this.labelAggregation;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
