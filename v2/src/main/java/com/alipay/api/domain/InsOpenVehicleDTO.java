package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车辆信息
 *
 * @author auto create
 * @since 1.0, 2024-07-09 14:47:50
 */
public class InsOpenVehicleDTO extends AlipayObject {

	private static final long serialVersionUID = 7442837272524712511L;

	/**
	 * 车辆品牌
	 */
	@ApiField("vehicle_brand")
	private String vehicleBrand;

	/**
	 * 车架号
	 */
	@ApiField("vehicle_frame_no")
	private String vehicleFrameNo;

	/**
	 * 车牌号
	 */
	@ApiField("vehicle_no")
	private String vehicleNo;

	/**
	 * 车辆行驶证
	 */
	@ApiField("vehicle_registration")
	private String vehicleRegistration;

	/**
	 * 车辆类型
	 */
	@ApiField("vehicle_type")
	private String vehicleType;

	public String getVehicleBrand() {
		return this.vehicleBrand;
	}
	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}

	public String getVehicleFrameNo() {
		return this.vehicleFrameNo;
	}
	public void setVehicleFrameNo(String vehicleFrameNo) {
		this.vehicleFrameNo = vehicleFrameNo;
	}

	public String getVehicleNo() {
		return this.vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getVehicleRegistration() {
		return this.vehicleRegistration;
	}
	public void setVehicleRegistration(String vehicleRegistration) {
		this.vehicleRegistration = vehicleRegistration;
	}

	public String getVehicleType() {
		return this.vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

}
