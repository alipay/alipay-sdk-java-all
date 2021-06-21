package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * IoT商家订单更新
 *
 * @author auto create
 * @since 1.0, 2021-01-29 11:22:37
 */
public class AlipayOpenIotbpaasMerchantorderModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8166866782361365552L;

	/**
	 * 设备订单状态列表
	 */
	@ApiListField("device_order_status_list")
	@ApiField("device_order_status")
	private List<DeviceOrderStatus> deviceOrderStatusList;

	public List<DeviceOrderStatus> getDeviceOrderStatusList() {
		return this.deviceOrderStatusList;
	}
	public void setDeviceOrderStatusList(List<DeviceOrderStatus> deviceOrderStatusList) {
		this.deviceOrderStatusList = deviceOrderStatusList;
	}

}
