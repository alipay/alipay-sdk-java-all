package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 实时公交线路信息
 *
 * @author auto create
 * @since 1.0, 2020-09-23 16:30:26
 */
public class BusRealtimeInfo extends AlipayObject {

	private static final long serialVersionUID = 7721574231579339552L;

	/**
	 * 线路id，线路的唯一标志。
	 */
	@ApiField("line_id")
	private String lineId;

	/**
	 * 线路名称
	 */
	@ApiField("line_name")
	private String lineName;

	/**
	 * 剩余到站时间，单位是秒。
	 */
	@ApiField("seconds_left")
	private Long secondsLeft;

	/**
	 * 站点id，站点的唯一标志。
	 */
	@ApiField("station_id")
	private String stationId;

	/**
	 * 剩余到站站数
	 */
	@ApiField("station_left")
	private Long stationLeft;

	/**
	 * 站点名称
	 */
	@ApiField("station_name")
	private String stationName;

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

	public Long getSecondsLeft() {
		return this.secondsLeft;
	}
	public void setSecondsLeft(Long secondsLeft) {
		this.secondsLeft = secondsLeft;
	}

	public String getStationId() {
		return this.stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public Long getStationLeft() {
		return this.stationLeft;
	}
	public void setStationLeft(Long stationLeft) {
		this.stationLeft = stationLeft;
	}

	public String getStationName() {
		return this.stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

}
