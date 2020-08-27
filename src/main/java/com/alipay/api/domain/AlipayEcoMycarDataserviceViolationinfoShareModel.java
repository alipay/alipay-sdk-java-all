package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV获取违章车辆信息
 *
 * @author auto create
 * @since 1.0, 2019-08-29 11:20:52
 */
public class AlipayEcoMycarDataserviceViolationinfoShareModel extends AlipayObject {

	private static final long serialVersionUID = 8643439126519813555L;

	/**
	 * 支付宝app_id
	 */
	@ApiField("app_id")
	private String appId;

	/**
	 * 车辆id
	 */
	@ApiField("vehicle_id")
	private String vehicleId;

	public String getAppId() {
		return this.appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getVehicleId() {
		return this.vehicleId;
	}
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

}
