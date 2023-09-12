package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备类型信息
 *
 * @author auto create
 * @since 1.0, 2020-07-06 10:07:34
 */
public class AmpeDeviceTypeInfo extends AlipayObject {

	private static final long serialVersionUID = 5156594482947618423L;

	/**
	 * 设备类型
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 设备类描述
	 */
	@ApiField("device_type_desc")
	private String deviceTypeDesc;

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getDeviceTypeDesc() {
		return this.deviceTypeDesc;
	}
	public void setDeviceTypeDesc(String deviceTypeDesc) {
		this.deviceTypeDesc = deviceTypeDesc;
	}

}
