package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 打印机Model
 *
 * @author auto create
 * @since 1.0, 2018-11-21 14:21:33
 */
public class PrintModel extends AlipayObject {

	private static final long serialVersionUID = 8513477521323347319L;

	/**
	 * 设备ID
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 是否启用
	 */
	@ApiField("enable")
	private Boolean enable;

	/**
	 * 打印机名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 打印机id
	 */
	@ApiField("printer_id")
	private Long printerId;

	/**
	 * 打印机类型（FRONT_DESK_PRINTER：前台打印机；LABEL_PRINTER：标签打印机；KITCHEN_PRINTER：厨房打印机）
	 */
	@ApiField("printer_type")
	private String printerType;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public Boolean getEnable() {
		return this.enable;
	}
	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getPrinterId() {
		return this.printerId;
	}
	public void setPrinterId(Long printerId) {
		this.printerId = printerId;
	}

	public String getPrinterType() {
		return this.printerType;
	}
	public void setPrinterType(String printerType) {
		this.printerType = printerType;
	}

}
