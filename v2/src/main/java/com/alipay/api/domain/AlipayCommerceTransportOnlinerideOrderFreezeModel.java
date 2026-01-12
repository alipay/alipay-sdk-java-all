package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 举手抢单
 *
 * @author auto create
 * @since 1.0, 2025-12-26 21:42:41
 */
public class AlipayCommerceTransportOnlinerideOrderFreezeModel extends AlipayObject {

	private static final long serialVersionUID = 8798331269293529555L;

	/**
	 * 0:代表不绕圈 1:代表绕圈
	 */
	@ApiField("docking_circle")
	private Long dockingCircle;

	/**
	 * 预计接驾时间,单位:分钟 
	 */
	@ApiField("estimated_pickup_time")
	private Long estimatedPickupTime;

	/**
	 * 是否存在司机
	 */
	@ApiField("exist_driver")
	private Boolean existDriver;

	/**
	 * 支付宝订单id
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 接驾路线id
	 */
	@ApiField("pick_up_route_id")
	private String pickUpRouteId;

	/**
	 * 外部商户的订单id
	 */
	@ApiField("schedule_id")
	private String scheduleId;

	/**
	 * 是否升仓
	 */
	@ApiField("upgrade_status")
	private Boolean upgradeStatus;

	/**
	 * 预估接驾距离,单位:米
	 */
	@ApiField("vehicle_distance")
	private Long vehicleDistance;

	/**
	 * 车辆信息
	 */
	@ApiField("vehicle_info")
	private VehicleLocationInfo vehicleInfo;

	public Long getDockingCircle() {
		return this.dockingCircle;
	}
	public void setDockingCircle(Long dockingCircle) {
		this.dockingCircle = dockingCircle;
	}

	public Long getEstimatedPickupTime() {
		return this.estimatedPickupTime;
	}
	public void setEstimatedPickupTime(Long estimatedPickupTime) {
		this.estimatedPickupTime = estimatedPickupTime;
	}

	public Boolean getExistDriver() {
		return this.existDriver;
	}
	public void setExistDriver(Boolean existDriver) {
		this.existDriver = existDriver;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getPickUpRouteId() {
		return this.pickUpRouteId;
	}
	public void setPickUpRouteId(String pickUpRouteId) {
		this.pickUpRouteId = pickUpRouteId;
	}

	public String getScheduleId() {
		return this.scheduleId;
	}
	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}

	public Boolean getUpgradeStatus() {
		return this.upgradeStatus;
	}
	public void setUpgradeStatus(Boolean upgradeStatus) {
		this.upgradeStatus = upgradeStatus;
	}

	public Long getVehicleDistance() {
		return this.vehicleDistance;
	}
	public void setVehicleDistance(Long vehicleDistance) {
		this.vehicleDistance = vehicleDistance;
	}

	public VehicleLocationInfo getVehicleInfo() {
		return this.vehicleInfo;
	}
	public void setVehicleInfo(VehicleLocationInfo vehicleInfo) {
		this.vehicleInfo = vehicleInfo;
	}

}
