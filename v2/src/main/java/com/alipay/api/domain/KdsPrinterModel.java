package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Kds打印机
 *
 * @author auto create
 * @since 1.0, 2018-12-21 10:30:54
 */
public class KdsPrinterModel extends AlipayObject {

	private static final long serialVersionUID = 3495251934925547739L;

	/**
	 * 打印机设备Id
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 打印机名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 打印机id
	 */
	@ApiField("printer_id")
	private String printerId;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPrinterId() {
		return this.printerId;
	}
	public void setPrinterId(String printerId) {
		this.printerId = printerId;
	}

}
