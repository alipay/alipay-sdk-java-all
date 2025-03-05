package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 报警触发条件集合
 *
 * @author auto create
 * @since 1.0, 2024-06-05 17:32:26
 */
public class AlarmTrigger extends AlipayObject {

	private static final long serialVersionUID = 8562615115451837389L;

	/**
	 * 数据聚合方式
 - sum
 - avg
	 */
	@ApiField("aggregator")
	private String aggregator;

	/**
	 * 数据聚合范围(分钟)
 - 1
 - 5
 - 10
 - 15
 - 30
 - 60
	 */
	@ApiField("aggregator_range")
	private String aggregatorRange;

	/**
	 * 报警比较规则
	 */
	@ApiListField("compare_rules")
	@ApiField("alarm_compare_rule")
	private List<AlarmCompareRule> compareRules;

	/**
	 * 最近 N 分钟
	 */
	@ApiField("condition_type")
	private String conditionType;

	/**
	 * 查询条件过滤
	 */
	@ApiListField("function_filters")
	@ApiField("alarm_function_filter")
	private List<AlarmFunctionFilter> functionFilters;

	/**
	 * 指标
 - total
 - success
 - fail
 - successPercent
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
	 * 产品
 - FUNCTION
 - MONGODB
 - OSS
 - REDIS
	 */
	@ApiField("product")
	private String product;

	/**
	 * 数据库/OSS操作类型
 - mongodbRead
 - mongodbWrite
 - ossUpload
 - ossDownload
 - ossDelete
	 */
	@ApiField("product_operate")
	private String productOperate;

	/**
	 * 触发类型 N 值
	 */
	@ApiField("step_num")
	private String stepNum;

	/**
	 * 数据为空是否补零(默认 true)
	 */
	@ApiField("zero_fill")
	private Boolean zeroFill;

	public String getAggregator() {
		return this.aggregator;
	}
	public void setAggregator(String aggregator) {
		this.aggregator = aggregator;
	}

	public String getAggregatorRange() {
		return this.aggregatorRange;
	}
	public void setAggregatorRange(String aggregatorRange) {
		this.aggregatorRange = aggregatorRange;
	}

	public List<AlarmCompareRule> getCompareRules() {
		return this.compareRules;
	}
	public void setCompareRules(List<AlarmCompareRule> compareRules) {
		this.compareRules = compareRules;
	}

	public String getConditionType() {
		return this.conditionType;
	}
	public void setConditionType(String conditionType) {
		this.conditionType = conditionType;
	}

	public List<AlarmFunctionFilter> getFunctionFilters() {
		return this.functionFilters;
	}
	public void setFunctionFilters(List<AlarmFunctionFilter> functionFilters) {
		this.functionFilters = functionFilters;
	}

	public String getMetric() {
		return this.metric;
	}
	public void setMetric(String metric) {
		this.metric = metric;
	}

	public String getProduct() {
		return this.product;
	}
	public void setProduct(String product) {
		this.product = product;
	}

	public String getProductOperate() {
		return this.productOperate;
	}
	public void setProductOperate(String productOperate) {
		this.productOperate = productOperate;
	}

	public String getStepNum() {
		return this.stepNum;
	}
	public void setStepNum(String stepNum) {
		this.stepNum = stepNum;
	}

	public Boolean getZeroFill() {
		return this.zeroFill;
	}
	public void setZeroFill(Boolean zeroFill) {
		this.zeroFill = zeroFill;
	}

}
