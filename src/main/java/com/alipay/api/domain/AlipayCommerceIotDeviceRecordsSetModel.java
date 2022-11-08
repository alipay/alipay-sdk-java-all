package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * IoT设备档案管理
 *
 * @author auto create
 * @since 1.0, 2022-06-10 13:34:28
 */
public class AlipayCommerceIotDeviceRecordsSetModel extends AlipayObject {

	private static final long serialVersionUID = 1738193938213156367L;

	/**
	 * 极简绑定、三绑定、升级三绑定、可用绑定、解绑时必填，绑定查询时选填
	 */
	@ApiListField("device_record_files")
	@ApiField("device_record_file")
	private List<DeviceRecordFile> deviceRecordFiles;

	/**
	 * 填写商户在isv系统内身份资料
	 */
	@ApiField("ext_params")
	private DeviceExtParams extParams;

	/**
	 * 设备档案管理场景
IOT_DEVICE_RECORDS_G1(极简绑定)
IOT_DEVICE_RECORDS_G3_INDIRECT(间连三绑定)
IOT_DEVICE_RECORDS_G3_DIRECT(直连三绑定)
IOT_DEVICE_RECORDS_DELETE(解绑)
IOT_DEVICE_RECORDS_QUERY（绑定查询）
IOT_DEVICE_RECORDS_G2(可用绑定)
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * CREATE（极简绑定、间连三绑定、可用绑定、直连三绑定时传）
UPDATE（极简绑定升级为间连三绑定时传）
DEFAULT（解绑、绑定查询时传）
G2TOG3_UPDATE（可用绑定升级为间联三绑定时传）
	 */
	@ApiField("scene_params")
	private String sceneParams;

	/**
	 * 设备序列号
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 设备供应商ID：supplierId，如意生态版AMX设备请填写“201901111100635561”
	 */
	@ApiField("supplier_id")
	private String supplierId;

	public List<DeviceRecordFile> getDeviceRecordFiles() {
		return this.deviceRecordFiles;
	}
	public void setDeviceRecordFiles(List<DeviceRecordFile> deviceRecordFiles) {
		this.deviceRecordFiles = deviceRecordFiles;
	}

	public DeviceExtParams getExtParams() {
		return this.extParams;
	}
	public void setExtParams(DeviceExtParams extParams) {
		this.extParams = extParams;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSceneParams() {
		return this.sceneParams;
	}
	public void setSceneParams(String sceneParams) {
		this.sceneParams = sceneParams;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
