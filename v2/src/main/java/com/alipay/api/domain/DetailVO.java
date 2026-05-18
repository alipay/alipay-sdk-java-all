package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-06 10:14:39
 */
public class DetailVO extends AlipayObject {

	private static final long serialVersionUID = 8638776862192686864L;

	/**
	 * 指标是否有异常值
	 */
	@ApiField("abnormal")
	private Boolean abnormal;

	/**
	 * 明细指标数据开始时间（毫秒时间戳）
	 */
	@ApiField("end_time")
	private Long endTime;

	/**
	 * 指标编码
	 */
	@ApiField("indicator")
	private String indicator;

	/**
	 * 明细指标数据开始时间（毫秒时间戳）
	 */
	@ApiField("start_time")
	private Long startTime;

	/**
	 * 指标字段
	 */
	@ApiField("sub_indicator")
	private String subIndicator;

	/**
	 * 指标值，单位根据指标字段而定
	 */
	@ApiField("value")
	private String value;

	public Boolean getAbnormal() {
		return this.abnormal;
	}
	public void setAbnormal(Boolean abnormal) {
		this.abnormal = abnormal;
	}

	public Long getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public String getIndicator() {
		return this.indicator;
	}
	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}

	public Long getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public String getSubIndicator() {
		return this.subIndicator;
	}
	public void setSubIndicator(String subIndicator) {
		this.subIndicator = subIndicator;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
