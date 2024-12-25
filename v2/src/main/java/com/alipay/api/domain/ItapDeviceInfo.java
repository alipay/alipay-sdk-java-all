package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能终端平台设备信息
 *
 * @author auto create
 * @since 1.0, 2020-01-09 00:04:03
 */
public class ItapDeviceInfo extends AlipayObject {

	private static final long serialVersionUID = 7683452738439199498L;

	/**
	 * 固件版本
	 */
	@ApiField("fw_version")
	private String fwVersion;

	/**
	 * 硬件版本
	 */
	@ApiField("hw_version")
	private String hwVersion;

	/**
	 * 设备厂商名字
	 */
	@ApiField("manufacturer")
	private String manufacturer;

	/**
	 * 产品型号
	 */
	@ApiField("model")
	private String model;

	/**
	 * 产品名称
	 */
	@ApiField("product_name")
	private String productName;

	public String getFwVersion() {
		return this.fwVersion;
	}
	public void setFwVersion(String fwVersion) {
		this.fwVersion = fwVersion;
	}

	public String getHwVersion() {
		return this.hwVersion;
	}
	public void setHwVersion(String hwVersion) {
		this.hwVersion = hwVersion;
	}

	public String getManufacturer() {
		return this.manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return this.model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

}
