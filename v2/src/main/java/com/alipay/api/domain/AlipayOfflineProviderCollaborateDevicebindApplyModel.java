package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 设备绑定申请
 *
 * @author auto create
 * @since 1.0, 2025-01-27 22:47:46
 */
public class AlipayOfflineProviderCollaborateDevicebindApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6177466451268683132L;

	/**
	 * 1. 直联商家三绑定必传：
RECORDS_TYPE_PID(直连 PID)、
RECORDS_TYPE_SHOPID(shopid);
2. 可用绑定必传：
RECORDS_TYPE_SMID（二级商家 ID）。
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
	 * 外部唯一单据号，用来做幂等，标志着唯一的一次设备绑定申请
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 设备绑定场景
IOT_DEVICE_RECORDS_G3_DIRECT(直连三绑定)
IOT_DEVICE_RECORDS_G2(可用绑定)
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

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
