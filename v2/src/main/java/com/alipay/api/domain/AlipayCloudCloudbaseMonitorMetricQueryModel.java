package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询监控指标
 *
 * @author auto create
 * @since 1.0, 2023-11-01 20:06:51
 */
public class AlipayCloudCloudbaseMonitorMetricQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4223284342795764365L;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 环境id
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

	/**
	 * 采集频率（示例值为1分钟），单位分钟
	 */
	@ApiField("down_sample")
	private String downSample;

	/**
	 * 查询的结束时间
	 */
	@ApiField("end")
	private String end;

	/**
	 * 数据为空填充策略（数据为空填充策略，默认补0），zero为固定值
	 */
	@ApiField("fill_policy")
	private String fillPolicy;

	/**
	 * 过滤类型
 - literal_or
 - not_literal_or
 - wildcard
 - regexp
 - not_regexp_match
 - literal
 - not_literal
	 */
	@ApiField("filter_type")
	private String filterType;

	/**
	 * 指标
 - total
 - success
 - fail
 - success_percent
 - cost
 - get_qps_count_60
 - put_qps_count_60
 - get_latency_avg_60
 - put_latency_avg_60
 - keys
 - used_memory
 - instance_input_bytes
 - instance_output_bytes
 - cmd_qps_count_60
 - cmd_latency_avg_60
 - request_package_size_sum_60
 - response_package_size_sum_60
	 */
	@ApiField("metric")
	private String metric;

	/**
	 * 查询过滤条件
	 */
	@ApiField("monitor_filter")
	private MonitorFilter monitorFilter;

	/**
	 * 产品
 - FUNCTION
 - MONGODB
 - OSS
 - REDIS
	 */
	@ApiField("product")
	private String product;

	/**
	 * 查询的开始时间
	 */
	@ApiField("start")
	private String start;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getBizEnvId() {
		return this.bizEnvId;
	}
	public void setBizEnvId(String bizEnvId) {
		this.bizEnvId = bizEnvId;
	}

	public String getDownSample() {
		return this.downSample;
	}
	public void setDownSample(String downSample) {
		this.downSample = downSample;
	}

	public String getEnd() {
		return this.end;
	}
	public void setEnd(String end) {
		this.end = end;
	}

	public String getFillPolicy() {
		return this.fillPolicy;
	}
	public void setFillPolicy(String fillPolicy) {
		this.fillPolicy = fillPolicy;
	}

	public String getFilterType() {
		return this.filterType;
	}
	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	public String getMetric() {
		return this.metric;
	}
	public void setMetric(String metric) {
		this.metric = metric;
	}

	public MonitorFilter getMonitorFilter() {
		return this.monitorFilter;
	}
	public void setMonitorFilter(MonitorFilter monitorFilter) {
		this.monitorFilter = monitorFilter;
	}

	public String getProduct() {
		return this.product;
	}
	public void setProduct(String product) {
		this.product = product;
	}

	public String getStart() {
		return this.start;
	}
	public void setStart(String start) {
		this.start = start;
	}

}
