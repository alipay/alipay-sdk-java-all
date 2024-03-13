package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 指标数据查询
 *
 * @author auto create
 * @since 1.0, 2024-02-21 15:16:38
 */
public class AlipayCloudHoloinsightMicroappMetricQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6117826355214157638L;

	/**
	 * 聚合方式：平均值
	 */
	@ApiField("aggregator")
	private String aggregator;

	/**
	 * 返回数据为 1m 时间粒度的数据
	 */
	@ApiField("downsample")
	private String downsample;

	/**
	 * 结束时间
	 */
	@ApiField("end")
	private Long end;

	/**
	 * 补0
	 */
	@ApiField("fillpolicy")
	private String fillpolicy;

	/**
	 * 过滤条件
	 */
	@ApiListField("filters")
	@ApiField("holo_insight_data_query_filter")
	private List<HoloInsightDataQueryFilter> filters;

	/**
	 * 按照appId 进行聚合
	 */
	@ApiListField("groupby")
	@ApiField("string")
	private List<String> groupby;

	/**
	 * pod cpu 使用率
	 */
	@ApiField("metric")
	private String metric;

	/**
	 * 开始时间
	 */
	@ApiField("start")
	private Long start;

	public String getAggregator() {
		return this.aggregator;
	}
	public void setAggregator(String aggregator) {
		this.aggregator = aggregator;
	}

	public String getDownsample() {
		return this.downsample;
	}
	public void setDownsample(String downsample) {
		this.downsample = downsample;
	}

	public Long getEnd() {
		return this.end;
	}
	public void setEnd(Long end) {
		this.end = end;
	}

	public String getFillpolicy() {
		return this.fillpolicy;
	}
	public void setFillpolicy(String fillpolicy) {
		this.fillpolicy = fillpolicy;
	}

	public List<HoloInsightDataQueryFilter> getFilters() {
		return this.filters;
	}
	public void setFilters(List<HoloInsightDataQueryFilter> filters) {
		this.filters = filters;
	}

	public List<String> getGroupby() {
		return this.groupby;
	}
	public void setGroupby(List<String> groupby) {
		this.groupby = groupby;
	}

	public String getMetric() {
		return this.metric;
	}
	public void setMetric(String metric) {
		this.metric = metric;
	}

	public Long getStart() {
		return this.start;
	}
	public void setStart(Long start) {
		this.start = start;
	}

}
