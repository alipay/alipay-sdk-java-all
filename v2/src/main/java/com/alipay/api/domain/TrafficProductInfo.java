package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 景区小交通产品信息。
 *
 * @author auto create
 * @since 1.0, 2022-12-26 11:38:59
 */
public class TrafficProductInfo extends AlipayObject {

	private static final long serialVersionUID = 5712135267184969237L;

	/**
	 * 出发地名称，对于BUS类型该字段必填。
	 */
	@ApiField("departure")
	private String departure;

	/**
	 * 乘车点、出发口
	 */
	@ApiField("departure_gate")
	private String departureGate;

	/**
	 * 到达地，对于BUS类型必传。
	 */
	@ApiField("destination")
	private String destination;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private ScenicExtInfo extInfo;

	/**
	 * 出发地纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 出发地经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 路线名称。
	 */
	@ApiField("route_name")
	private String routeName;

	/**
	 * isv侧唯一标识该小交通路线的key。
	 */
	@ApiField("route_no")
	private String routeNo;

	/**
	 * 座位类型
	 */
	@ApiField("seat_type")
	private String seatType;

	/**
	 * 车牌号，对于BUS类型必填。
	 */
	@ApiField("traffic_no")
	private String trafficNo;

	/**
	 * 交通类型
	 */
	@ApiField("traffic_type")
	private String trafficType;

	public String getDeparture() {
		return this.departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getDepartureGate() {
		return this.departureGate;
	}
	public void setDepartureGate(String departureGate) {
		this.departureGate = departureGate;
	}

	public String getDestination() {
		return this.destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}

	public ScenicExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(ScenicExtInfo extInfo) {
		this.extInfo = extInfo;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getRouteName() {
		return this.routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

	public String getRouteNo() {
		return this.routeNo;
	}
	public void setRouteNo(String routeNo) {
		this.routeNo = routeNo;
	}

	public String getSeatType() {
		return this.seatType;
	}
	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}

	public String getTrafficNo() {
		return this.trafficNo;
	}
	public void setTrafficNo(String trafficNo) {
		this.trafficNo = trafficNo;
	}

	public String getTrafficType() {
		return this.trafficType;
	}
	public void setTrafficType(String trafficType) {
		this.trafficType = trafficType;
	}

}
