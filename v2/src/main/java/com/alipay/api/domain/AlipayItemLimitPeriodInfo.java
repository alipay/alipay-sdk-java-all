package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品适用信息
 *
 * @author auto create
 * @since 1.0, 2017-04-20 15:17:55
 */
public class AlipayItemLimitPeriodInfo extends AlipayObject {

	private static final long serialVersionUID = 6445731676415531621L;

	/**
	 * 区间范围枚举，分为：
INCLUDE（包含）
EXCLUDE（排除）
	 */
	@ApiField("rule")
	private String rule;

	/**
	 * 单位描述，分为：
MINUTE（分钟）
HOUR（小时）
WEEK_DAY（星期几）
DAY（日）
WEEK（周）
MONTH（月）
ALL（整个销售周期）
	 */
	@ApiField("unit")
	private String unit;

	/**
	 * 区间范围值，参数类型为Number
	 */
	@ApiListField("value")
	@ApiField("number")
	private List<Long> value;

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

	public List<Long> getValue() {
		return this.value;
	}
	public void setValue(List<Long> value) {
		this.value = value;
	}

}
