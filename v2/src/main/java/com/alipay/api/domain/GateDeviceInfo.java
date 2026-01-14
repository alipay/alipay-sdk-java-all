package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门禁设备信息模型
 *
 * @author auto create
 * @since 1.0, 2025-04-23 17:17:22
 */
public class GateDeviceInfo extends AlipayObject {

	private static final long serialVersionUID = 6362511476375168421L;

	/**
	 * 开卡平台支持的门禁厂商，平台会根据小区和门禁厂商，决策对应的开卡设备
	 */
	@ApiField("gate_supplier_code")
	private String gateSupplierCode;

	/**
	 * 门禁厂商管理系统中的真实设备SN
	 */
	@ApiField("sys_device_id")
	private String sysDeviceId;

	public String getGateSupplierCode() {
		return this.gateSupplierCode;
	}
	public void setGateSupplierCode(String gateSupplierCode) {
		this.gateSupplierCode = gateSupplierCode;
	}

	public String getSysDeviceId() {
		return this.sysDeviceId;
	}
	public void setSysDeviceId(String sysDeviceId) {
		this.sysDeviceId = sysDeviceId;
	}

}
