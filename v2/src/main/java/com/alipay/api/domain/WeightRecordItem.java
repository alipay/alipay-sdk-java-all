package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-25 17:38:58
 */
public class WeightRecordItem extends AlipayObject {

	private static final long serialVersionUID = 2226548662255212758L;

	/**
	 * 记录日期 yyyy-MM-dd
	 */
	@ApiField("record_date")
	private String recordDate;

	/**
	 * 记录业务 ID
	 */
	@ApiField("record_id")
	private String recordId;

	/**
	 * 记录时间 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("record_time")
	private String recordTime;

	/**
	 * 单位
	 */
	@ApiField("unit")
	private String unit;

	/**
	 * 体重 kg，最多 2 位小数
	 */
	@ApiField("weight_value")
	private String weightValue;

	public String getRecordDate() {
		return this.recordDate;
	}
	public void setRecordDate(String recordDate) {
		this.recordDate = recordDate;
	}

	public String getRecordId() {
		return this.recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getRecordTime() {
		return this.recordTime;
	}
	public void setRecordTime(String recordTime) {
		this.recordTime = recordTime;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getWeightValue() {
		return this.weightValue;
	}
	public void setWeightValue(String weightValue) {
		this.weightValue = weightValue;
	}

}
