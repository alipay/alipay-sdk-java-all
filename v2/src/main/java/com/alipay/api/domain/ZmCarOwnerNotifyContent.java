package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 芝麻车主名片回调通知内容
 *
 * @author auto create
 * @since 1.0, 2025-10-17 17:36:58
 */
public class ZmCarOwnerNotifyContent extends AlipayObject {

	private static final long serialVersionUID = 5275363881349724867L;

	/**
	 * 芝麻车主名片驾驶证信息
	 */
	@ApiField("driving_license_info")
	private ZmCarOwnerDrivingLicenseInfo drivingLicenseInfo;

	/**
	 * 用户身份信息
	 */
	@ApiField("identity_info")
	private ZmCarOwnerIdentityInfo identityInfo;

	/**
	 * 是否开通成功
	 */
	@ApiField("open_status")
	private Boolean openStatus;

	/**
	 * 芝麻车主名片车辆信息列表
	 */
	@ApiListField("vehicle_info_list")
	@ApiField("zm_car_owner_vehicle_info")
	private List<ZmCarOwnerVehicleInfo> vehicleInfoList;

	public ZmCarOwnerDrivingLicenseInfo getDrivingLicenseInfo() {
		return this.drivingLicenseInfo;
	}
	public void setDrivingLicenseInfo(ZmCarOwnerDrivingLicenseInfo drivingLicenseInfo) {
		this.drivingLicenseInfo = drivingLicenseInfo;
	}

	public ZmCarOwnerIdentityInfo getIdentityInfo() {
		return this.identityInfo;
	}
	public void setIdentityInfo(ZmCarOwnerIdentityInfo identityInfo) {
		this.identityInfo = identityInfo;
	}

	public Boolean getOpenStatus() {
		return this.openStatus;
	}
	public void setOpenStatus(Boolean openStatus) {
		this.openStatus = openStatus;
	}

	public List<ZmCarOwnerVehicleInfo> getVehicleInfoList() {
		return this.vehicleInfoList;
	}
	public void setVehicleInfoList(List<ZmCarOwnerVehicleInfo> vehicleInfoList) {
		this.vehicleInfoList = vehicleInfoList;
	}

}
