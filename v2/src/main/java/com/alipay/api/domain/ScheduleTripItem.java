package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结果
 *
 * @author auto create
 * @since 1.0, 2020-03-02 17:16:53
 */
public class ScheduleTripItem extends AlipayObject {

	private static final long serialVersionUID = 2432638764112749799L;

	/**
	 * 方向，参考方向枚举
	 */
	@ApiField("direction")
	private String direction;

	/**
	 * 线路id
	 */
	@ApiField("line_id")
	private String lineId;

	/**
	 * 单程行驶时间(单位min)
	 */
	@ApiField("run_time")
	private Long runTime;

	/**
	 * 若time_span为10，则06:00表示06:00-06:10的时段；
若time_span为30，则06:00表示06:00-06:30的时段
	 */
	@ApiField("time_period")
	private String timePeriod;

	public String getDirection() {
		return this.direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getLineId() {
		return this.lineId;
	}
	public void setLineId(String lineId) {
		this.lineId = lineId;
	}

	public Long getRunTime() {
		return this.runTime;
	}
	public void setRunTime(Long runTime) {
		this.runTime = runTime;
	}

	public String getTimePeriod() {
		return this.timePeriod;
	}
	public void setTimePeriod(String timePeriod) {
		this.timePeriod = timePeriod;
	}

}
