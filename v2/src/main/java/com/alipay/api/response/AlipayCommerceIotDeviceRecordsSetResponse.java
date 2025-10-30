package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DeviceRecords;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.device.records.set response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-11 16:02:27
 */
public class AlipayCommerceIotDeviceRecordsSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7224587379352541715L;

	/** 
	 * 设备档案
	 */
	@ApiField("device_records")
	private DeviceRecords deviceRecords;

	/** 
	 * 对设备绑定请求进行处理后的一些提示信息
	 */
	@ApiField("device_remark")
	private String deviceRemark;

	public void setDeviceRecords(DeviceRecords deviceRecords) {
		this.deviceRecords = deviceRecords;
	}
	public DeviceRecords getDeviceRecords( ) {
		return this.deviceRecords;
	}

	public void setDeviceRemark(String deviceRemark) {
		this.deviceRemark = deviceRemark;
	}
	public String getDeviceRemark( ) {
		return this.deviceRemark;
	}

}
