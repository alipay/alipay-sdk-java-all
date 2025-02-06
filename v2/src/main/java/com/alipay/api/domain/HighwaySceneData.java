package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车主服务高速场景数据
 *
 * @author auto create
 * @since 1.0, 2023-02-24 14:06:57
 */
public class HighwaySceneData extends AlipayObject {

	private static final long serialVersionUID = 5719291552739463794L;

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
	 * 当具体交易场景为ETC_HIGHWAY、ETC_HIGHWAY_OPEN时，该字段必填，格式为省份+收费站名，比如“黑龙江瓦盆窑西站”
	 */
	@ApiField("end_station_name")
	private String endStationName;

	/**
	 * 出站口省份名称
	 */
	@ApiField("end_station_province")
	private String endStationProvince;

	/**
	 * 对应路网规范中的chargeTime字段，如果是高速通行场景，该字段为高速出口的时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 收费车道编号
	 */
	@ApiField("lane_no")
	private String laneNo;

	/**
	 * 发行方/路网原始行程Id，对账使用
	 */
	@ApiField("out_trip_id")
	private String outTripId;

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
	 * 当具体交易场景为ETC_HIGHWAY时，该字段必填，格式为省份+收费站名，比如“黑龙江瓦盆窑西站”
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

	/**
	 * 子场景：
ETC_HIGHWAY：ETC封闭式高速公路（不传默认这个值）；
ETC_HIGHWAY_OPEN：ETC开放式高速公路；
ETC_PARKING：ETC停车场；
ETC_GAS：ETC加油站；
ETC_SERVICE_AREA：ETC服务区；
ETC_MUNICIPAL_SERVICE：ETC市政服务。
	 */
	@ApiField("sub_scene")
	private String subScene;

	/**
	 * 1、当交易场景为ETC_PARKING时：省份+停车场描述 (停车场描述应填写停车场名称 或停车场具体地点，勿填停车场 所属公司名称)，如北京市首都机场停车场/北京市东城区东单体育馆南侧路停车场
2、当交易场景为ETC_GAS时：省份+加油站描述 (加油站描述应填写加油站具体 地点)，比如北京市朝阳区北四环东路中石化加油站
3、当交易场景为ETC_SERVICE_AREA时：省份+服务区描述 (服务区描述应填写所在高速公 路名称及服务区名称)，如北京市京藏高速百葛服务区
4、当交易场景为ETC_MUNICIPAL_SERVICE时：省份+市政服务 描述(市政服务描述应填写市政 服务名称)，比如山东省青岛市胶州湾海底隧道
	 */
	@ApiField("sub_scene_desc")
	private String subSceneDesc;

	/**
	 * HIGHWAY_TYPE：高速交易场景类型，对应具体交易场景[ETC_HIGHWAY,ETC_HIGHWAY_OPEN]
EXPAND_TYPE：拓展消费交易类型，对应具体交易场景 [ETC_PARKING,ETC_GAS,ETC_SERVICE_AREA,ETC_MUNICIPAL_SERVICE]
	 */
	@ApiField("sub_type")
	private String subType;

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

	public String getOutTripId() {
		return this.outTripId;
	}
	public void setOutTripId(String outTripId) {
		this.outTripId = outTripId;
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

	public String getSubScene() {
		return this.subScene;
	}
	public void setSubScene(String subScene) {
		this.subScene = subScene;
	}

	public String getSubSceneDesc() {
		return this.subSceneDesc;
	}
	public void setSubSceneDesc(String subSceneDesc) {
		this.subSceneDesc = subSceneDesc;
	}

	public String getSubType() {
		return this.subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}

}
