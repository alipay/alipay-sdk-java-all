package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 经营分析、经营概况相关接口的指标值结构体
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:49:50
 */
public class OperationValueBaseDTO extends AlipayObject {

	private static final long serialVersionUID = 2336622732758183164L;

	/**
	 * 指标的上周期的数值, 如果是转化率的类型值，则保留4位小数，如果是金额类型的值，则保留2位小数，单位：元。
	 */
	@ApiField("last_period_value")
	private String lastPeriodValue;

	/**
	 * 指标的当前值与上周期的值的环比率
	 */
	@ApiField("ratio")
	private String ratio;

	/**
	 * 指标的当前日期的数值，如果是转化率的类型值，则保留4位小数，如果是金额类型的值，则保留2位小数，单位：元。
	 */
	@ApiField("value")
	private String value;

	public String getLastPeriodValue() {
		return this.lastPeriodValue;
	}
	public void setLastPeriodValue(String lastPeriodValue) {
		this.lastPeriodValue = lastPeriodValue;
	}

	public String getRatio() {
		return this.ratio;
	}
	public void setRatio(String ratio) {
		this.ratio = ratio;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
