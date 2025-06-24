package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 设备档案数据
 *
 * @author auto create
 * @since 1.0, 2024-09-26 21:20:44
 */
public class DeviceRecords extends AlipayObject {

	private static final long serialVersionUID = 6423976319777268251L;

	/**
	 * 设备唯一标识
	 */
	@ApiField("biz_tid")
	private String bizTid;

	/**
	 * 可用绑定：G2
三绑定：G3
	 */
	@ApiField("device_grade")
	private String deviceGrade;

	/**
	 * 设备档案
	 */
	@ApiListField("device_record_files")
	@ApiField("device_record_file")
	private List<DeviceRecordFile> deviceRecordFiles;

	/**
	 * 设备档案拓展参数
	 */
	@ApiField("ext_params")
	private DeviceExtParams extParams;

	/**
	 * 设备序列号
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 设备供应商ID
	 */
	@ApiField("supplier_id")
	private String supplierId;

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

	public String getDeviceGrade() {
		return this.deviceGrade;
	}
	public void setDeviceGrade(String deviceGrade) {
		this.deviceGrade = deviceGrade;
	}

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
