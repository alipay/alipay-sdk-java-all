package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 排班调度时刻表详细
 *
 * @author auto create
 * @since 1.0, 2020-03-02 15:54:57
 */
public class ScheduleTimeItem extends AlipayObject {

	private static final long serialVersionUID = 6844492748414923871L;

	/**
	 * 起点站发车时刻列表，如07:00:00,07:30:00,…,21:30:00,22:00:00
	 */
	@ApiField("departure_time_list")
	private String departureTimeList;

	/**
	 * 线路方向，0：上行；1：下行
	 */
	@ApiField("direction")
	private String direction;

	/**
	 * 线路id
	 */
	@ApiField("line_id")
	private String lineId;

	/**
	 * 车辆上座率分布（Json格式，包含均值、方差、分位点等信息），如{‘min’:0.13, ‘max’:1.0, ‘mean’:0.35, ‘median’:0.40, ’pert_90’:0.78}
	 */
	@ApiField("occu_rate_sts")
	private String occuRateSts;

	/**
	 * 车次总数
	 */
	@ApiField("trip_cnt")
	private String tripCnt;

	/**
	 * 乘客等待车次数分布（日均，Json格式），如{‘1’:9999, ‘2’:10, ‘3’:2}
	 */
	@ApiField("wait_bus_sts")
	private String waitBusSts;

	/**
	 * 乘客等车时间分布（日均，Json格式，包含均值、方差、分位点等信息），如{‘min’:0, ‘max’:10, ‘mean’:5, ‘median’:5, ’pert_90’:9}
	 */
	@ApiField("wait_time_sts")
	private String waitTimeSts;

	public String getDepartureTimeList() {
		return this.departureTimeList;
	}
	public void setDepartureTimeList(String departureTimeList) {
		this.departureTimeList = departureTimeList;
	}

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

	public String getOccuRateSts() {
		return this.occuRateSts;
	}
	public void setOccuRateSts(String occuRateSts) {
		this.occuRateSts = occuRateSts;
	}

	public String getTripCnt() {
		return this.tripCnt;
	}
	public void setTripCnt(String tripCnt) {
		this.tripCnt = tripCnt;
	}

	public String getWaitBusSts() {
		return this.waitBusSts;
	}
	public void setWaitBusSts(String waitBusSts) {
		this.waitBusSts = waitBusSts;
	}

	public String getWaitTimeSts() {
		return this.waitTimeSts;
	}
	public void setWaitTimeSts(String waitTimeSts) {
		this.waitTimeSts = waitTimeSts;
	}

}
