package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 设备绑定申请的预校验接口
 *
 * @author auto create
 * @since 1.0, 2025-05-27 10:57:46
 */
public class AlipayOfflineProviderCollaborateDevicebindCheckModel extends AlipayObject {

	private static final long serialVersionUID = 7226721152557713718L;

	/**
	 * 1. 直连绑定必传： RECORDS_TYPE_PID(直连 PID)、 RECORDS_TYPE_SHOPID(shopid); 2. 间连绑定必传： RECORDS_TYPE_SMID（二级商家 ID）。
	 */
	@ApiListField("device_record_files")
	@ApiField("device_record_info")
	private List<DeviceRecordInfo> deviceRecordFiles;

	/**
	 * 设备序列号
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 填写商家在服务商系统内身份资料
	 */
	@ApiField("ext_params")
	private DeviceExtAttribute extParams;

	/**
	 * 设备档案管理场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

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

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
