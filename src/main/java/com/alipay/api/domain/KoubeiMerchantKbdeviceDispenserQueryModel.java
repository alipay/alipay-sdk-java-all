package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 取餐柜详情查询接口
 *
 * @author auto create
 * @since 1.0, 2018-12-27 14:36:17
 */
public class KoubeiMerchantKbdeviceDispenserQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8196762717426233331L;

	/**
	 * 取餐柜的唯一设备ID。通过<a href="https://opendocs.alipay.com/apis/api_3/koubei.merchant.kbdevice.devices.batchquery"> koubei.merchant.kbdevice.devices.batchquery</a>(查询门店下设备列表) 接口查询获得。
	 */
	@ApiField("device_id")
	private String deviceId;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

}
