package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 综合能源预测信息
 *
 * @author auto create
 * @since 1.0, 2025-06-27 16:45:44
 */
public class EnergyForecastInfo extends AlipayObject {

	private static final long serialVersionUID = 1898435545246412583L;

	/**
	 * 预测服务对应的预测值
	 */
	@ApiField("prediction")
	private String prediction;

	/**
	 * 预测时间点
	 */
	@ApiField("time")
	private Date time;

	public String getPrediction() {
		return this.prediction;
	}
	public void setPrediction(String prediction) {
		this.prediction = prediction;
	}

	public Date getTime() {
		return this.time;
	}
	public void setTime(Date time) {
		this.time = time;
	}

}
