package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 大出行智能平台-排班任务-班型-班型明细
 *
 * @author auto create
 * @since 1.0, 2020-08-17 21:23:57
 */
public class WorkPatternDetail extends AlipayObject {

	private static final long serialVersionUID = 7769564225493447786L;

	/**
	 * 结束时刻（hh24:mi:ss）
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 扩展参数，json格式，由双方约定取值
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 营运车次数
	 */
	@ApiField("service_trip_count")
	private Long serviceTripCount;

	/**
	 * 开始时刻（hh24:mi:ss）
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

	public Long getServiceTripCount() {
		return this.serviceTripCount;
	}
	public void setServiceTripCount(Long serviceTripCount) {
		this.serviceTripCount = serviceTripCount;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
