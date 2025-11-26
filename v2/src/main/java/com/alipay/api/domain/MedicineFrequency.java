package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用药频率
 *
 * @author auto create
 * @since 1.0, 2025-10-29 15:52:40
 */
public class MedicineFrequency extends AlipayObject {

	private static final long serialVersionUID = 3879935699428916354L;

	/**
	 * 单次剂量数值（克）
	 */
	@ApiField("dosage")
	private String dosage;

	/**
	 * 单位支持片、克、毫克、毫升、IU、杯、粒、颗、袋、支、瓶、滴、匙
	 */
	@ApiField("dosage_unit")
	private String dosageUnit;

	/**
	 * 次
	 */
	@ApiField("frequency")
	private String frequency;

	/**
	 * 时间数（次）
	 */
	@ApiField("time")
	private String time;

	/**
	 * 单位支持小时；日；周；月；年
	 */
	@ApiField("time_unit")
	private String timeUnit;

	public String getDosage() {
		return this.dosage;
	}
	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public String getDosageUnit() {
		return this.dosageUnit;
	}
	public void setDosageUnit(String dosageUnit) {
		this.dosageUnit = dosageUnit;
	}

	public String getFrequency() {
		return this.frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getTime() {
		return this.time;
	}
	public void setTime(String time) {
		this.time = time;
	}

	public String getTimeUnit() {
		return this.timeUnit;
	}
	public void setTimeUnit(String timeUnit) {
		this.timeUnit = timeUnit;
	}

}
