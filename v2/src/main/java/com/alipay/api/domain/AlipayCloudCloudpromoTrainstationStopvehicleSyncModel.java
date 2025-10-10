package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步停车库车辆入场信息
 *
 * @author auto create
 * @since 1.0, 2025-03-07 19:54:22
 */
public class AlipayCloudCloudpromoTrainstationStopvehicleSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5857211242522678151L;

	/**
	 * 停车照片链接，车辆状态是已停入，需要传该参数
	 */
	@ApiField("car_image_url")
	private String carImageUrl;

	/**
	 * 车牌号
	 */
	@ApiField("car_number")
	private String carNumber;

	/**
	 * 离开停车场时间，车辆状态是已出场，需要传该参数
	 */
	@ApiField("departure_time")
	private Date departureTime;

	/**
	 * 进入停车场时间，车辆状态是已入场，需要传该参数
	 */
	@ApiField("enter_time")
	private Date enterTime;

	/**
	 * 楼层，车辆状态是已停入，需要传该参数
	 */
	@ApiField("floor")
	private String floor;

	/**
	 * 纬度，当车辆停入车位时，需要传该参数
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 离开车位时间，车辆状态是已停出，需要传该参数
	 */
	@ApiField("leave_parking_time")
	private Date leaveParkingTime;

	/**
	 * 经度，当车辆停入车位时，需要传该参数
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 杭州东1号网约车
	 */
	@ApiField("parking_lot_name")
	private String parkingLotName;

	/**
	 * 车位号，车辆状态是已停入，需要传该参数
	 */
	@ApiField("parking_number")
	private String parkingNumber;

	/**
	 * 场所名称
	 */
	@ApiField("place_name")
	private String placeName;

	/**
	 * 位置ID，用于区分不同poi点位的唯一值
	 */
	@ApiField("poi_id")
	private String poiId;

	/**
	 * 已入场：车辆进入停车场
已停入：车辆停入停车位
已停出：车辆离开停车位
已出场：车辆离开停车场（如有采集该数据则更新）
	 */
	@ApiField("status")
	private String status;

	/**
	 * 停入车位时间，车辆状态是已停入，需要传该参数
	 */
	@ApiField("stop_time")
	private Date stopTime;

	public String getCarImageUrl() {
		return this.carImageUrl;
	}
	public void setCarImageUrl(String carImageUrl) {
		this.carImageUrl = carImageUrl;
	}

	public String getCarNumber() {
		return this.carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public Date getDepartureTime() {
		return this.departureTime;
	}
	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public Date getEnterTime() {
		return this.enterTime;
	}
	public void setEnterTime(Date enterTime) {
		this.enterTime = enterTime;
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

	public Date getLeaveParkingTime() {
		return this.leaveParkingTime;
	}
	public void setLeaveParkingTime(Date leaveParkingTime) {
		this.leaveParkingTime = leaveParkingTime;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getParkingLotName() {
		return this.parkingLotName;
	}
	public void setParkingLotName(String parkingLotName) {
		this.parkingLotName = parkingLotName;
	}

	public String getParkingNumber() {
		return this.parkingNumber;
	}
	public void setParkingNumber(String parkingNumber) {
		this.parkingNumber = parkingNumber;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Date getStopTime() {
		return this.stopTime;
	}
	public void setStopTime(Date stopTime) {
		this.stopTime = stopTime;
	}

}
