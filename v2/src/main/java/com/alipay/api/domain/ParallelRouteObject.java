package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 并行公交线路
 *
 * @author auto create
 * @since 1.0, 2026-07-06 11:41:16
 */
public class ParallelRouteObject extends AlipayObject {

	private static final long serialVersionUID = 4587215718144747587L;

	/**
	 * 公交线路名称
	 */
	@ApiField("bus_route_name")
	private String busRouteName;

	/**
	 * 重复车站数量
	 */
	@ApiField("repeat_station_count")
	private Long repeatStationCount;

	/**
	 * 重复车站明细
	 */
	@ApiField("repeat_station_detail")
	private String repeatStationDetail;

	/**
	 * 站点序号
	 */
	@ApiField("station_index")
	private Long stationIndex;

	public String getBusRouteName() {
		return this.busRouteName;
	}
	public void setBusRouteName(String busRouteName) {
		this.busRouteName = busRouteName;
	}

	public Long getRepeatStationCount() {
		return this.repeatStationCount;
	}
	public void setRepeatStationCount(Long repeatStationCount) {
		this.repeatStationCount = repeatStationCount;
	}

	public String getRepeatStationDetail() {
		return this.repeatStationDetail;
	}
	public void setRepeatStationDetail(String repeatStationDetail) {
		this.repeatStationDetail = repeatStationDetail;
	}

	public Long getStationIndex() {
		return this.stationIndex;
	}
	public void setStationIndex(Long stationIndex) {
		this.stationIndex = stationIndex;
	}

}
