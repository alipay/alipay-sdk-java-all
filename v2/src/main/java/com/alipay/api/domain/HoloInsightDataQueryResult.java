package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 数据查询返回结果
 *
 * @author auto create
 * @since 1.0, 2023-11-02 14:30:21
 */
public class HoloInsightDataQueryResult extends AlipayObject {

	private static final long serialVersionUID = 5868246837171433118L;

	/**
	 * tagkey列表
	 */
	@ApiListField("headers")
	@ApiField("string")
	private List<String> headers;

	/**
	 * pod cpu 利用率
	 */
	@ApiField("metric")
	private String metric;

	/**
	 * tags信息
	 */
	@ApiListField("tags")
	@ApiField("string")
	private List<String> tags;

	/**
	 * 时序值[{"period": 1698725520000,"value": "5.0"}]
	 */
	@ApiListField("values")
	@ApiField("holo_insight_data_result_value")
	private List<HoloInsightDataResultValue> values;

	public List<String> getHeaders() {
		return this.headers;
	}
	public void setHeaders(List<String> headers) {
		this.headers = headers;
	}

	public String getMetric() {
		return this.metric;
	}
	public void setMetric(String metric) {
		this.metric = metric;
	}

	public List<String> getTags() {
		return this.tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public List<HoloInsightDataResultValue> getValues() {
		return this.values;
	}
	public void setValues(List<HoloInsightDataResultValue> values) {
		this.values = values;
	}

}
