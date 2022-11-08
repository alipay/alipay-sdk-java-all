package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投保参数
 *
 * @author auto create
 * @since 1.0, 2022-07-22 12:50:10
 */
public class InsApplyProductCoverageDTO extends AlipayObject {

	private static final long serialVersionUID = 3195576872919372921L;

	/**
	 * 止期
	 */
	@ApiField("effective_end_time")
	private Date effectiveEndTime;

	/**
	 * 起期
	 */
	@ApiField("effective_start_time")
	private Date effectiveStartTime;

	/**
	 * 保期
1M，一个月
3M，三个月
	 */
	@ApiField("period")
	private String period;

	public Date getEffectiveEndTime() {
		return this.effectiveEndTime;
	}
	public void setEffectiveEndTime(Date effectiveEndTime) {
		this.effectiveEndTime = effectiveEndTime;
	}

	public Date getEffectiveStartTime() {
		return this.effectiveStartTime;
	}
	public void setEffectiveStartTime(Date effectiveStartTime) {
		this.effectiveStartTime = effectiveStartTime;
	}

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

}
