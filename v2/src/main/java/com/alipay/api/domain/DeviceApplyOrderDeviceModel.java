package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备申请单所关联的设备model
 *
 * @author auto create
 * @since 1.0, 2019-08-21 12:16:28
 */
public class DeviceApplyOrderDeviceModel extends AlipayObject {

	private static final long serialVersionUID = 8812523228226637399L;

	/**
	 * 设备sn编号
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * itemId
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 厂商id
	 */
	@ApiField("supplier_id")
	private String supplierId;

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

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
