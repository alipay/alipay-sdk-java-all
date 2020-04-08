package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 影响公交线路线路信息
 *
 * @author auto create
 * @since 1.0, 2019-08-22 10:28:09
 */
public class CloudbusPredictRItem extends AlipayObject {

	private static final long serialVersionUID = 6143472911376629459L;

	/**
	 * 站点轨迹
	 */
	@ApiListField("line_lon_lat")
	@ApiField("cloudbus_location")
	private List<CloudbusLocation> lineLonLat;

	/**
	 * 运营时间
	 */
	@ApiListField("operation_time")
	@ApiField("string")
	private List<String> operationTime;

	/**
	 * 线路总客流
	 */
	@ApiField("route_volume")
	private Long routeVolume;

	/**
	 * 11
	 */
	@ApiListField("stops")
	@ApiField("cloudbus_stop")
	private List<CloudbusStop> stops;

	public List<CloudbusLocation> getLineLonLat() {
		return this.lineLonLat;
	}
	public void setLineLonLat(List<CloudbusLocation> lineLonLat) {
		this.lineLonLat = lineLonLat;
	}

	public List<String> getOperationTime() {
		return this.operationTime;
	}
	public void setOperationTime(List<String> operationTime) {
		this.operationTime = operationTime;
	}

	public Long getRouteVolume() {
		return this.routeVolume;
	}
	public void setRouteVolume(Long routeVolume) {
		this.routeVolume = routeVolume;
	}

	public List<CloudbusStop> getStops() {
		return this.stops;
	}
	public void setStops(List<CloudbusStop> stops) {
		this.stops = stops;
	}

}
