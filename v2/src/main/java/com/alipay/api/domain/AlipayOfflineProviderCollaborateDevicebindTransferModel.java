package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 设备换绑
 *
 * @author auto create
 * @since 1.0, 2025-05-27 10:57:39
 */
public class AlipayOfflineProviderCollaborateDevicebindTransferModel extends AlipayObject {

	private static final long serialVersionUID = 4832594378121261428L;

	/**
	 * 如果换smid必须要传，smid和之前的smid必须是同一个支付宝账户下；维保换绑场景必传
	 */
	@ApiListField("device_record_files")
	@ApiField("device_record_info")
	private List<DeviceRecordInfo> deviceRecordFiles;

	/**
	 * 发起操作的设备SN
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 如果需要改动其中的内容，则需要传；维保换绑场景必传
	 */
	@ApiField("ext_params")
	private DeviceExtAttribute extParams;

	/**
	 * 需要被替换的设备，如果是换SN必须传
	 */
	@ApiField("old_device_sn")
	private String oldDeviceSn;

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

	public String getOldDeviceSn() {
		return this.oldDeviceSn;
	}
	public void setOldDeviceSn(String oldDeviceSn) {
		this.oldDeviceSn = oldDeviceSn;
	}

}
