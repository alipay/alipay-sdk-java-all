package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 经营分析、经营概况相关接口的指标的整数类型返回结构体
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:49:50
 */
public class OperationValueLongDTO extends AlipayObject {

	private static final long serialVersionUID = 4815759722952334125L;

	/**
	 * 指标上个周期的数值，不含包金额数值单位
	 */
	@ApiField("last_period_value")
	private Long lastPeriodValue;

	/**
	 * 指标的当前值与上期值的环比率，不含包金额数值
	 */
	@ApiField("ratio")
	private String ratio;

	/**
	 * 指标当前时间的数值，不含包金额数值单位
	 */
	@ApiField("value")
	private Long value;

	public Long getLastPeriodValue() {
		return this.lastPeriodValue;
	}
	public void setLastPeriodValue(Long lastPeriodValue) {
		this.lastPeriodValue = lastPeriodValue;
	}

	public String getRatio() {
		return this.ratio;
	}
	public void setRatio(String ratio) {
		this.ratio = ratio;
	}

	public Long getValue() {
		return this.value;
	}
	public void setValue(Long value) {
		this.value = value;
	}

}
