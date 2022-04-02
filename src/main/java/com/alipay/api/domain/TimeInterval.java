package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 大出行智能平台-时刻表任务-自定义发车间隔
 *
 * @author auto create
 * @since 1.0, 2021-10-26 21:56:23
 */
public class TimeInterval extends AlipayObject {

	private static final long serialVersionUID = 6676165465861223916L;

	/**
	 * 时间区间结束时刻（hh24:mi:ss）
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 扩展参数，json格式，由双方约定取值
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 该时间区间内最大发车间隔，单位：分钟
	 */
	@ApiField("max_time_interval")
	private Long maxTimeInterval;

	/**
	 * 该时间区间内最小发车间隔，单位：分钟
	 */
	@ApiField("min_time_interval")
	private Long minTimeInterval;

	/**
	 * 时间区间开始时刻（hh24:mi:ss）
	 */
	@ApiField("start_time")
	private String startTime;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public Long getMaxTimeInterval() {
		return this.maxTimeInterval;
	}
	public void setMaxTimeInterval(Long maxTimeInterval) {
		this.maxTimeInterval = maxTimeInterval;
	}

	public Long getMinTimeInterval() {
		return this.minTimeInterval;
	}
	public void setMinTimeInterval(Long minTimeInterval) {
		this.minTimeInterval = minTimeInterval;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
