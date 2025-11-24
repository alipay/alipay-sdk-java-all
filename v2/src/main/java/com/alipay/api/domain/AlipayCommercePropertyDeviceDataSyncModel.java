package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 门禁设备数据同步
 *
 * @author auto create
 * @since 1.0, 2025-11-15 08:52:41
 */
public class AlipayCommercePropertyDeviceDataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6716625662673336557L;

	/**
	 * null
	 */
	@ApiListField("list")
	@ApiField("device_data")
	private List<DeviceData> list;

	public List<DeviceData> getList() {
		return this.list;
	}
	public void setList(List<DeviceData> list) {
		this.list = list;
	}

}
