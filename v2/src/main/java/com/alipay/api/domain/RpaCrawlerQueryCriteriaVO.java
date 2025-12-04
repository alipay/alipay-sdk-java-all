package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Rpa爬虫请求查询条件
 *
 * @author auto create
 * @since 1.0, 2021-03-08 15:16:19
 */
public class RpaCrawlerQueryCriteriaVO extends AlipayObject {

	private static final long serialVersionUID = 3746682597257714765L;

	/**
	 * 比较符
	 */
	@ApiField("comparison")
	private String comparison;

	/**
	 * 查询字段
	 */
	@ApiField("key")
	private String key;

	/**
	 * eq,gt,lt生效,查询值
	 */
	@ApiField("value")
	private String value;

	/**
	 * between类型生效,结束值
	 */
	@ApiField("value_end")
	private String valueEnd;

	/**
	 * between类型生效,起始值
	 */
	@ApiField("value_start")
	private String valueStart;

	/**
	 * 目标值
	 */
	@ApiField("values")
	private String values;

	public String getComparison() {
		return this.comparison;
	}
	public void setComparison(String comparison) {
		this.comparison = comparison;
	}

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

	public String getValueEnd() {
		return this.valueEnd;
	}
	public void setValueEnd(String valueEnd) {
		this.valueEnd = valueEnd;
	}

	public String getValueStart() {
		return this.valueStart;
	}
	public void setValueStart(String valueStart) {
		this.valueStart = valueStart;
	}

	public String getValues() {
		return this.values;
	}
	public void setValues(String values) {
		this.values = values;
	}

}
