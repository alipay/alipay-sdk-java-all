package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车主服务高速场景数据
 *
 * @author auto create
 * @since 1.0, 2019-06-22 19:51:40
 */
public class HighwaySceneData extends AlipayObject {

	private static final long serialVersionUID = 6628311856935364974L;

	/**
	 * 车辆类：
car:客车；
truck:货车
	 */
	@ApiField("car_type")
	private String carType;

	/**
	 * 本交易出站省份，使用国家区域编码
	 */
	@ApiField("end_province_code")
	private String endProvinceCode;

	/**
	 * 出站口服务方编码
	 */
	@ApiField("end_station_code")
	private String endStationCode;

	/**
	 * 出站口ID
	 */
	@ApiField("end_station_id")
	private String endStationId;

	/**
	 * 出站口纬度
	 */
	@ApiField("end_station_latitude")
	private String endStationLatitude;

	/**
	 * 出站口经度
	 */
	@ApiField("end_station_longitude")
	private String endStationLongitude;

	/**
	 * 出站口名称
	 */
	@ApiField("end_station_name")
	private String endStationName;

	/**
	 * 出站口省份名称
	 */
	@ApiField("end_station_province")
	private String endStationProvince;

	/**
	 * 即用户出高速时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 收费车道编号
	 */
	@ApiField("lane_no")
	private String laneNo;

	/**
	 * 本交易进站省份，使用国家区域编码
	 */
	@ApiField("start_province_code")
	private String startProvinceCode;

	/**
	 * 进站口服务方编码
	 */
	@ApiField("start_station_code")
	private String startStationCode;

	/**
	 * 进站口ID
	 */
	@ApiField("start_station_id")
	private String startStationId;

	/**
	 * 进站口纬度
	 */
	@ApiField("start_station_latitude")
	private String startStationLatitude;

	/**
	 * 进站口经度
	 */
	@ApiField("start_station_longitude")
	private String startStationLongitude;

	/**
	 * 进站口名称
	 */
	@ApiField("start_station_name")
	private String startStationName;

	/**
	 * 进站口省份名称
	 */
	@ApiField("start_station_province")
	private String startStationProvince;

	/**
	 * 即用户进入高速时间
	 */
	@ApiField("start_time")
	private String startTime;

	public String getCarType() {
		return this.carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getEndProvinceCode() {
		return this.endProvinceCode;
	}
	public void setEndProvinceCode(String endProvinceCode) {
		this.endProvinceCode = endProvinceCode;
	}

	public String getEndStationCode() {
		return this.endStationCode;
	}
	public void setEndStationCode(String endStationCode) {
		this.endStationCode = endStationCode;
	}

	public String getEndStationId() {
		return this.endStationId;
	}
	public void setEndStationId(String endStationId) {
		this.endStationId = endStationId;
	}

	public String getEndStationLatitude() {
		return this.endStationLatitude;
	}
	public void setEndStationLatitude(String endStationLatitude) {
		this.endStationLatitude = endStationLatitude;
	}

	public String getEndStationLongitude() {
		return this.endStationLongitude;
	}
	public void setEndStationLongitude(String endStationLongitude) {
		this.endStationLongitude = endStationLongitude;
	}

	public String getEndStationName() {
		return this.endStationName;
	}
	public void setEndStationName(String endStationName) {
		this.endStationName = endStationName;
	}

	public String getEndStationProvince() {
		return this.endStationProvince;
	}
	public void setEndStationProvince(String endStationProvince) {
		this.endStationProvince = endStationProvince;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getLaneNo() {
		return this.laneNo;
	}
	public void setLaneNo(String laneNo) {
		this.laneNo = laneNo;
	}

	public String getStartProvinceCode() {
		return this.startProvinceCode;
	}
	public void setStartProvinceCode(String startProvinceCode) {
		this.startProvinceCode = startProvinceCode;
	}

	public String getStartStationCode() {
		return this.startStationCode;
	}
	public void setStartStationCode(String startStationCode) {
		this.startStationCode = startStationCode;
	}

	public String getStartStationId() {
		return this.startStationId;
	}
	public void setStartStationId(String startStationId) {
		this.startStationId = startStationId;
	}

	public String getStartStationLatitude() {
		return this.startStationLatitude;
	}
	public void setStartStationLatitude(String startStationLatitude) {
		this.startStationLatitude = startStationLatitude;
	}

	public String getStartStationLongitude() {
		return this.startStationLongitude;
	}
	public void setStartStationLongitude(String startStationLongitude) {
		this.startStationLongitude = startStationLongitude;
	}

	public String getStartStationName() {
		return this.startStationName;
	}
	public void setStartStationName(String startStationName) {
		this.startStationName = startStationName;
	}

	public String getStartStationProvince() {
		return this.startStationProvince;
	}
	public void setStartStationProvince(String startStationProvince) {
		this.startStationProvince = startStationProvince;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
