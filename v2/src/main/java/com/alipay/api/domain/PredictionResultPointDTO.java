package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-14 16:52:50
 */
public class PredictionResultPointDTO extends AlipayObject {

	private static final long serialVersionUID = 4216212986635971964L;

	/**
	 * 预测时间，格式yyyy-MM-dd HH:mm
	 */
	@ApiField("forecast_time")
	private String forecastTime;

	/**
	 * 预测结果
	 */
	@ApiField("value")
	private String value;

	public String getForecastTime() {
		return this.forecastTime;
	}
	public void setForecastTime(String forecastTime) {
		this.forecastTime = forecastTime;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
