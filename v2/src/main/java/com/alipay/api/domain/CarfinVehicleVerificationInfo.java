package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车金融人车核验信息
 *
 * @author auto create
 * @since 1.0, 2026-04-10 19:29:14
 */
public class CarfinVehicleVerificationInfo extends AlipayObject {

	private static final long serialVersionUID = 8542891448757173687L;

	/**
	 * 人车一致标识
	 */
	@ApiField("vehicle_self_flag")
	private String vehicleSelfFlag;

	public String getVehicleSelfFlag() {
		return this.vehicleSelfFlag;
	}
	public void setVehicleSelfFlag(String vehicleSelfFlag) {
		this.vehicleSelfFlag = vehicleSelfFlag;
	}

}
