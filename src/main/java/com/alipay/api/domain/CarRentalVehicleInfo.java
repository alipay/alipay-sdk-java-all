package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租车车辆信息
 *
 * @author auto create
 * @since 1.0, 2021-05-27 18:52:49
 */
public class CarRentalVehicleInfo extends AlipayObject {

	private static final long serialVersionUID = 1698975568119353645L;

	/**
	 * 车牌号
	 */
	@ApiField("car_no")
	private String carNo;

	/**
	 * 排量
	 */
	@ApiField("vehicle_capacity")
	private String vehicleCapacity;

	/**
	 * 颜色
	 */
	@ApiField("vehicle_color")
	private String vehicleColor;

	/**
	 * 车辆型号
	 */
	@ApiField("vehicle_models")
	private String vehicleModels;

	/**
	 * 厢数
	 */
	@ApiField("vehicle_number")
	private String vehicleNumber;

	/**
	 * 操作类型 手动挡/自动挡
	 */
	@ApiField("vehicle_operation_type")
	private String vehicleOperationType;

	/**
	 * 座位数
	 */
	@ApiField("vehicle_seats")
	private String vehicleSeats;

	/**
	 * 车辆分类
经济型/舒适型/豪华型
	 */
	@ApiField("vehicle_type")
	private String vehicleType;

	public String getCarNo() {
		return this.carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getVehicleCapacity() {
		return this.vehicleCapacity;
	}
	public void setVehicleCapacity(String vehicleCapacity) {
		this.vehicleCapacity = vehicleCapacity;
	}

	public String getVehicleColor() {
		return this.vehicleColor;
	}
	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}

	public String getVehicleModels() {
		return this.vehicleModels;
	}
	public void setVehicleModels(String vehicleModels) {
		this.vehicleModels = vehicleModels;
	}

	public String getVehicleNumber() {
		return this.vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getVehicleOperationType() {
		return this.vehicleOperationType;
	}
	public void setVehicleOperationType(String vehicleOperationType) {
		this.vehicleOperationType = vehicleOperationType;
	}

	public String getVehicleSeats() {
		return this.vehicleSeats;
	}
	public void setVehicleSeats(String vehicleSeats) {
		this.vehicleSeats = vehicleSeats;
	}

	public String getVehicleType() {
		return this.vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

}
