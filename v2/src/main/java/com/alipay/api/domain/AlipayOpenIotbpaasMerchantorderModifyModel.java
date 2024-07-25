package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * IoT商家订单更新
 *
 * @author auto create
 * @since 1.0, 2022-10-17 11:09:34
 */
public class AlipayOpenIotbpaasMerchantorderModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1795887543663346551L;

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
