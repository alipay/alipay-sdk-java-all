package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 体格检查信息
身高、体重
 *
 * @author auto create
 * @since 1.0, 2025-11-03 15:32:13
 */
public class HDFRecordBase extends AlipayObject {

	private static final long serialVersionUID = 8422977888194519155L;

	/**
	 * 单位厘米
	 */
	@ApiField("height")
	private String height;

	/**
	 * 测量时间
	 */
	@ApiField("measure_time")
	private String measureTime;

	/**
	 * 单位 kg
	 */
	@ApiField("weight")
	private String weight;

	public String getHeight() {
		return this.height;
	}
	public void setHeight(String height) {
		this.height = height;
	}

	public String getMeasureTime() {
		return this.measureTime;
	}
	public void setMeasureTime(String measureTime) {
		this.measureTime = measureTime;
	}

	public String getWeight() {
		return this.weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}

}
