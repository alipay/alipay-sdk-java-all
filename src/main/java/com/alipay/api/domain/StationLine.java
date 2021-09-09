package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 站点线路信息。描述某个站点上某个线路模型
 *
 * @author auto create
 * @since 1.0, 2020-09-30 14:59:58
 */
public class StationLine extends AlipayObject {

	private static final long serialVersionUID = 8597857795823771343L;

	/**
	 * 实时公交到站信息
	 */
	@ApiField("buses")
	private BusRealtimeInfo buses;

	/**
	 * 终点站
	 */
	@ApiField("end_stop")
	private String endStop;

	/**
	 * 首班车时间。格式为HH:MM
	 */
	@ApiField("first_bus")
	private String firstBus;

	/**
	 * 发车间隔。单位是分钟
	 */
	@ApiField("interval")
	private Long interval;

	/**
	 * 末班车时间。格式为HH:MM
	 */
	@ApiField("last_bus")
	private String lastBus;

	/**
	 * 详情详情跳转链接。支付宝小程序内部可以跳转到这个链接对应的页面
	 */
	@ApiField("line_detail_schema")
	private String lineDetailSchema;

	/**
	 * 线路id
	 */
	@ApiField("line_id")
	private String lineId;

	/**
	 * 线路名称
	 */
	@ApiField("line_name")
	private String lineName;

	/**
	 * 是否支持实时公交到站信息。true支持，false 不支持
	 */
	@ApiField("real_time")
	private Boolean realTime;

	/**
	 * 起点站
	 */
	@ApiField("start_stop")
	private String startStop;

	/**
	 * 站点id，站点的唯一标志
	 */
	@ApiField("station_id")
	private String stationId;

	/**
	 * 站点名称
	 */
	@ApiField("station_name")
	private String stationName;

	public BusRealtimeInfo getBuses() {
		return this.buses;
	}
	public void setBuses(BusRealtimeInfo buses) {
		this.buses = buses;
	}

	public String getEndStop() {
		return this.endStop;
	}
	public void setEndStop(String endStop) {
		this.endStop = endStop;
	}

	public String getFirstBus() {
		return this.firstBus;
	}
	public void setFirstBus(String firstBus) {
		this.firstBus = firstBus;
	}

	public Long getInterval() {
		return this.interval;
	}
	public void setInterval(Long interval) {
		this.interval = interval;
	}

	public String getLastBus() {
		return this.lastBus;
	}
	public void setLastBus(String lastBus) {
		this.lastBus = lastBus;
	}

	public String getLineDetailSchema() {
		return this.lineDetailSchema;
	}
	public void setLineDetailSchema(String lineDetailSchema) {
		this.lineDetailSchema = lineDetailSchema;
	}

	public String getLineId() {
		return this.lineId;
	}
	public void setLineId(String lineId) {
		this.lineId = lineId;
	}

	public String getLineName() {
		return this.lineName;
	}
	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	public Boolean getRealTime() {
		return this.realTime;
	}
	public void setRealTime(Boolean realTime) {
		this.realTime = realTime;
	}

	public String getStartStop() {
		return this.startStop;
	}
	public void setStartStop(String startStop) {
		this.startStop = startStop;
	}

	public String getStationId() {
		return this.stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public String getStationName() {
		return this.stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

}
