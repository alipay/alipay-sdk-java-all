package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 大出行智能平台-单程时间-查询结果
 *
 * @author auto create
 * @since 1.0, 2020-09-04 15:20:09
 */
public class SingleTripDurationQueryOpenapiResult extends AlipayObject {

	private static final long serialVersionUID = 1119413122248385852L;

	/**
	 * 线路方向（UP-上行，DOWN-下行）
	 */
	@ApiField("direction")
	private String direction;

	/**
	 * 结束时刻（hh24:mi:ss）
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 扩展信息，json格式，由双方约定取值
	 */
	@ApiField("ext_info")
	private String extInfo;

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
	 * 单程行驶时间，单位：分钟
	 */
	@ApiField("single_trip_duration")
	private Long singleTripDuration;

	/**
	 * 开始时刻（hh24:mi:ss）
	 */
	@ApiField("start_time")
	private String startTime;

	public String getDirection() {
		return this.direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
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

	public Long getSingleTripDuration() {
		return this.singleTripDuration;
	}
	public void setSingleTripDuration(Long singleTripDuration) {
		this.singleTripDuration = singleTripDuration;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
