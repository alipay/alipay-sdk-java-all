package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 设备绑定基本信息返回
 *
 * @author auto create
 * @since 1.0, 2025-01-27 22:48:59
 */
public class IotDeviceBindBaseInfo extends AlipayObject {

	private static final long serialVersionUID = 2483816899667528562L;

	/**
	 * [{"name":"未绑定","value":"UN_BIND"},{"name":"已绑定","value":"BIND"}]
	 */
	@ApiField("device_bind_status")
	private String deviceBindStatus;

	/**
	 * 1. 直联商家三绑定必传： RECORDS_TYPE_PID(直连 PID)、 RECORDS_TYPE_SHOPID(shopid); 2. 可用绑定必传： RECORDS_TYPE_SMID（二级商家 ID） RECORDS_TYPE_PID(PID)。
	 */
	@ApiListField("device_record_files")
	@ApiField("device_record_info")
	private List<DeviceRecordInfo> deviceRecordFiles;

	/**
	 * 设备sn
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 商家在服务商系统内身份资料
	 */
	@ApiField("ext_params")
	private DeviceExtAttribute extParams;

	public String getDeviceBindStatus() {
		return this.deviceBindStatus;
	}
	public void setDeviceBindStatus(String deviceBindStatus) {
		this.deviceBindStatus = deviceBindStatus;
	}

	public List<DeviceRecordInfo> getDeviceRecordFiles() {
		return this.deviceRecordFiles;
	}
	public void setDeviceRecordFiles(List<DeviceRecordInfo> deviceRecordFiles) {
		this.deviceRecordFiles = deviceRecordFiles;
	}

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public DeviceExtAttribute getExtParams() {
		return this.extParams;
	}
	public void setExtParams(DeviceExtAttribute extParams) {
		this.extParams = extParams;
	}

}
