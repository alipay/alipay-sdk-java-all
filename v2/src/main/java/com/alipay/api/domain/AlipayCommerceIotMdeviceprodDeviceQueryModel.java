package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IOT机具信息查询接口
 *
 * @author auto create
 * @since 1.0, 2021-12-21 11:27:01
 */
public class AlipayCommerceIotMdeviceprodDeviceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1759165134366516175L;

	/**
	 * 真实设备sn
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 物料id，supplier_sn/item_id二选一必填，如果在supplier_sn item_id都输入的情况下，优先匹配supplier_sn
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 供应商id，supplier_sn/item_id参数二选一必填，如果在supplier_sn item_id都输入的情况下，优先匹配supplier_sn
	 */
	@ApiField("supplier_sn")
	private String supplierSn;

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getSupplierSn() {
		return this.supplierSn;
	}
	public void setSupplierSn(String supplierSn) {
		this.supplierSn = supplierSn;
	}

}
