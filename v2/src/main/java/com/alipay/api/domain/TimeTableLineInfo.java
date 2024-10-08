package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 大出行智能平台-时刻表任务-线路信息
 *
 * @author auto create
 * @since 1.0, 2021-10-26 21:56:23
 */
public class TimeTableLineInfo extends AlipayObject {

	private static final long serialVersionUID = 2735736626953793561L;

	/**
	 * 自定义发车间隔列表，在指定时间区间内覆盖全局配置
	 */
	@ApiListField("customized_time_interval_list")
	@ApiField("time_interval")
	private List<TimeInterval> customizedTimeIntervalList;

	/**
	 * 线路方向（UP-上行，DOWN-下行）
	 */
	@ApiField("direction")
	private String direction;

	/**
	 * 期望车次总数
	 */
	@ApiField("expect_trip_count")
	private Long expectTripCount;

	/**
	 * 扩展参数，json格式，由双方约定取值
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 线路ID，同一条线路的不同方向该值不同
	 */
	@ApiField("line_id")
	private String lineId;

	/**
	 * 线路Key，同一条线路的不同方向该值相同
	 */
	@ApiField("line_key")
	private String lineKey;

	/**
	 * 全局最大发车间隔，单位：分钟
	 */
	@ApiField("max_time_interval")
	private Long maxTimeInterval;

	/**
	 * 全局最小发车间隔，单位：分钟
	 */
	@ApiField("min_time_interval")
	private Long minTimeInterval;

	/**
	 * 运营结束时间（hh24:mi:ss）
	 */
	@ApiField("service_end_time")
	private String serviceEndTime;

	/**
	 * 运营起始时间（hh24:mi:ss）
	 */
	@ApiField("service_start_time")
	private String serviceStartTime;

	/**
	 * 聚合时间粒度，单位：分钟，只支持30/60。如无需执行客流分析可不传
	 */
	@ApiField("time_span")
	private Long timeSpan;

	/**
	 * 单车容量
	 */
	@ApiField("vehicle_capacity")
	private Long vehicleCapacity;

	public List<TimeInterval> getCustomizedTimeIntervalList() {
		return this.customizedTimeIntervalList;
	}
	public void setCustomizedTimeIntervalList(List<TimeInterval> customizedTimeIntervalList) {
		this.customizedTimeIntervalList = customizedTimeIntervalList;
	}

	public String getDirection() {
		return this.direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}

	public Long getExpectTripCount() {
		return this.expectTripCount;
	}
	public void setExpectTripCount(Long expectTripCount) {
		this.expectTripCount = expectTripCount;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public String getLineId() {
		return this.lineId;
	}
	public void setLineId(String lineId) {
		this.lineId = lineId;
	}

	public String getLineKey() {
		return this.lineKey;
	}
	public void setLineKey(String lineKey) {
		this.lineKey = lineKey;
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

	public String getServiceEndTime() {
		return this.serviceEndTime;
	}
	public void setServiceEndTime(String serviceEndTime) {
		this.serviceEndTime = serviceEndTime;
	}

	public String getServiceStartTime() {
		return this.serviceStartTime;
	}
	public void setServiceStartTime(String serviceStartTime) {
		this.serviceStartTime = serviceStartTime;
	}

	public Long getTimeSpan() {
		return this.timeSpan;
	}
	public void setTimeSpan(Long timeSpan) {
		this.timeSpan = timeSpan;
	}

	public Long getVehicleCapacity() {
		return this.vehicleCapacity;
	}
	public void setVehicleCapacity(Long vehicleCapacity) {
		this.vehicleCapacity = vehicleCapacity;
	}

}
