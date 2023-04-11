package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备信息模型
 *
 * @author auto create
 * @since 1.0, 2018-12-27 14:36:08
 */
public class DeviceInfo extends AlipayObject {

	private static final long serialVersionUID = 2684886275274447611L;

	/**
	 * 设备ID
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备类型
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 设备sn编号
	 */
	@ApiField("dv_sn")
	private String dvSn;

	/**
	 * 生产厂商
	 */
	@ApiField("manufacturer")
	private String manufacturer;

	/**
	 * 产品型号
	 */
	@ApiField("product_model")
	private String productModel;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getDvSn() {
		return this.dvSn;
	}
	public void setDvSn(String dvSn) {
		this.dvSn = dvSn;
	}

	public String getManufacturer() {
		return this.manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getProductModel() {
		return this.productModel;
	}
	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}

}
