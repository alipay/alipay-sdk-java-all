package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步上车点客流信息
 *
 * @author auto create
 * @since 1.0, 2025-03-07 19:54:54
 */
public class AlipayCloudCloudpromoBoardingpointInfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5111432891271138343L;

	/**
	 * 1号上车点
	 */
	@ApiField("boarding_point_name")
	private String boardingPointName;

	/**
	 * 舒适
	 */
	@ApiField("comfort_level")
	private String comfortLevel;

	/**
	 * 1楼
	 */
	@ApiField("floor")
	private String floor;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 杭州东站
	 */
	@ApiField("place_name")
	private String placeName;

	/**
	 * 位置ID，用于区分不同poi点位的唯一值
	 */
	@ApiField("poi_id")
	private String poiId;

	/**
	 * 出租车
	 */
	@ApiField("vehicle_type")
	private String vehicleType;

	/**
	 * 等候人数，单位：人，5000人
	 */
	@ApiField("wait_people_number")
	private Long waitPeopleNumber;

	/**
	 * 等待时间，整型，单位：分钟
	 */
	@ApiField("wait_time")
	private Long waitTime;

	public String getBoardingPointName() {
		return this.boardingPointName;
	}
	public void setBoardingPointName(String boardingPointName) {
		this.boardingPointName = boardingPointName;
	}

	public String getComfortLevel() {
		return this.comfortLevel;
	}
	public void setComfortLevel(String comfortLevel) {
		this.comfortLevel = comfortLevel;
	}

	public String getFloor() {
		return this.floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
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

	public String getPlaceName() {
		return this.placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getPoiId() {
		return this.poiId;
	}
	public void setPoiId(String poiId) {
		this.poiId = poiId;
	}

	public String getVehicleType() {
		return this.vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public Long getWaitPeopleNumber() {
		return this.waitPeopleNumber;
	}
	public void setWaitPeopleNumber(Long waitPeopleNumber) {
		this.waitPeopleNumber = waitPeopleNumber;
	}

	public Long getWaitTime() {
		return this.waitTime;
	}
	public void setWaitTime(Long waitTime) {
		this.waitTime = waitTime;
	}

}
