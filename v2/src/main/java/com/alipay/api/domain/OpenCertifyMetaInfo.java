package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸认证元数据信息
 *
 * @author auto create
 * @since 1.0, 2024-06-18 22:14:14
 */
public class OpenCertifyMetaInfo extends AlipayObject {

	private static final long serialVersionUID = 4264313223142242118L;

	/**
	 * 设备操作系统类型
	 */
	@ApiField("device_type")
	private String deviceType;

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

}
