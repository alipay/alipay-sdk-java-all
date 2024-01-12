package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能设备接入状态查询
 *
 * @author auto create
 * @since 1.0, 2021-07-27 10:28:25
 */
public class AlipayPayAppSmartwearStatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6238883439465891941L;

	/**
	 * 设备型号
	 */
	@ApiField("device_model")
	private String deviceModel;

	public String getDeviceModel() {
		return this.deviceModel;
	}
	public void setDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
	}

}
