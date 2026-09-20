package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 高速通行费率咨询接口
 *
 * @author auto create
 * @since 1.0, 2026-08-24 14:19:50
 */
public class AlipayCommerceTransportEtcTollfeeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6168323561969756623L;

	/**
	 * 调用方标识为支付宝侧定义分给调用方的，识别调用方标识
	 */
	@ApiField("caller_id")
	private String callerId;

	/**
	 * 出口收费站纬度
	 */
	@ApiField("end_latitude")
	private String endLatitude;

	/**
	 * 出口收费站经度
	 */
	@ApiField("end_longitude")
	private String endLongitude;

	/**
	 * 出口收费站名称
	 */
	@ApiField("end_station_name")
	private String endStationName;

	/**
	 * 起点收费站纬度
	 */
	@ApiField("start_latitude")
	private String startLatitude;

	/**
	 * 起点收费站经度
	 */
	@ApiField("start_longitude")
	private String startLongitude;

	/**
	 * 起点收费站名称
	 */
	@ApiField("start_station_name")
	private String startStationName;

	public String getCallerId() {
		return this.callerId;
	}
	public void setCallerId(String callerId) {
		this.callerId = callerId;
	}

	public String getEndLatitude() {
		return this.endLatitude;
	}
	public void setEndLatitude(String endLatitude) {
		this.endLatitude = endLatitude;
	}

	public String getEndLongitude() {
		return this.endLongitude;
	}
	public void setEndLongitude(String endLongitude) {
		this.endLongitude = endLongitude;
	}

	public String getEndStationName() {
		return this.endStationName;
	}
	public void setEndStationName(String endStationName) {
		this.endStationName = endStationName;
	}

	public String getStartLatitude() {
		return this.startLatitude;
	}
	public void setStartLatitude(String startLatitude) {
		this.startLatitude = startLatitude;
	}

	public String getStartLongitude() {
		return this.startLongitude;
	}
	public void setStartLongitude(String startLongitude) {
		this.startLongitude = startLongitude;
	}

	public String getStartStationName() {
		return this.startStationName;
	}
	public void setStartStationName(String startStationName) {
		this.startStationName = startStationName;
	}

}
