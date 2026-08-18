package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 地铁站点时刻信息
 *
 * @author auto create
 * @since 1.0, 2026-07-31 21:12:13
 */
public class ScheduleStationVO extends AlipayObject {

	private static final long serialVersionUID = 4891926858569838752L;

	/**
	 * 列车预计到达该站的时间，单位：秒。当前站点为 0 表示列车已到站/即将到站。
	 */
	@ApiField("est_time_in_sec")
	private Long estTimeInSec;

	/**
	 * 站点中文名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 站点在线路上的序号（字符串形式）。
	 */
	@ApiField("order")
	private String order;

	/**
	 * 站点编码
	 */
	@ApiField("station_code")
	private String stationCode;

	/**
	 * 列车在该站的停靠时刻，格式为 hh:mm
	 */
	@ApiField("train_stop_time")
	private String trainStopTime;

	public Long getEstTimeInSec() {
		return this.estTimeInSec;
	}
	public void setEstTimeInSec(Long estTimeInSec) {
		this.estTimeInSec = estTimeInSec;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOrder() {
		return this.order;
	}
	public void setOrder(String order) {
		this.order = order;
	}

	public String getStationCode() {
		return this.stationCode;
	}
	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}

	public String getTrainStopTime() {
		return this.trainStopTime;
	}
	public void setTrainStopTime(String trainStopTime) {
		this.trainStopTime = trainStopTime;
	}

}
