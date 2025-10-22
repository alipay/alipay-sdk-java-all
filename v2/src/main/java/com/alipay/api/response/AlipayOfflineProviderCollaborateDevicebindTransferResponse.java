package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DeviceRecordInfo;
import com.alipay.api.domain.DeviceExtAttribute;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.collaborate.devicebind.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-27 11:07:27
 */
public class AlipayOfflineProviderCollaborateDevicebindTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 1192417233536779836L;

	/** 
	 * 如果换smid必须有
	 */
	@ApiField("device_record_files")
	private DeviceRecordInfo deviceRecordFiles;

	/** 
	 * 需要换信息的SN
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/** 
	 * 设备相关信息
	 */
	@ApiField("ext_params")
	private DeviceExtAttribute extParams;

	/** 
	 * 旧设备序列号，如果是换设备SN必有
	 */
	@ApiField("old_device_sn")
	private String oldDeviceSn;

	public void setDeviceRecordFiles(DeviceRecordInfo deviceRecordFiles) {
		this.deviceRecordFiles = deviceRecordFiles;
	}
	public DeviceRecordInfo getDeviceRecordFiles( ) {
		return this.deviceRecordFiles;
	}

	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}
	public String getDeviceSn( ) {
		return this.deviceSn;
	}

	public void setExtParams(DeviceExtAttribute extParams) {
		this.extParams = extParams;
	}
	public DeviceExtAttribute getExtParams( ) {
		return this.extParams;
	}

	public void setOldDeviceSn(String oldDeviceSn) {
		this.oldDeviceSn = oldDeviceSn;
	}
	public String getOldDeviceSn( ) {
		return this.oldDeviceSn;
	}

}
