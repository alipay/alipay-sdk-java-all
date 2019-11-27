package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 可用时段数据结构
 *
 * @author auto create
 * @since 1.0, 2016-09-29 10:12:21
 */
public class LimitPeriodInfo extends AlipayObject {

	private static final long serialVersionUID = 6695921743639822321L;

	/**
	 * 限制规则
IN：包含
EX：排除
IN_INTERVAL：指定区间
EX_INTERVAL：排除区间
	 */
	@ApiField("rule")
	private String rule;

	/**
	 * 适用周期单位:W:周
	 */
	@ApiField("unit")
	private String unit;

	/**
	 * 限制值，比如周一的1
	 */
	@ApiListField("values")
	@ApiField("string")
	private List<String> values;

	public String getRule() {
		return this.rule;
	}
	public void setRule(String rule) {
		this.rule = rule;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

	public List<String> getValues() {
		return this.values;
	}
	public void setValues(List<String> values) {
		this.values = values;
	}

}
