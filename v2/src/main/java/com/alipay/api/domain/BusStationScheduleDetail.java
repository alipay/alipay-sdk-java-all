package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汽车票途经站点信息
 *
 * @author auto create
 * @since 1.0, 2025-01-13 14:46:19
 */
public class BusStationScheduleDetail extends AlipayObject {

	private static final long serialVersionUID = 2667163491535112511L;

	/**
	 * 途径站点
	 */
	@ApiField("station")
	private BusStation station;

	/**
	 * 上车点出发时间, 使用标准"HH:mm"格式
	 */
	@ApiField("station_time")
	private String stationTime;

	/**
	 * 途径站点
1. 上车点 2. 下车点
	 */
	@ApiField("type")
	private Long type;

	public BusStation getStation() {
		return this.station;
	}
	public void setStation(BusStation station) {
		this.station = station;
	}

	public String getStationTime() {
		return this.stationTime;
	}
	public void setStationTime(String stationTime) {
		this.stationTime = stationTime;
	}

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

}
