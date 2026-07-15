package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 设备关联信息创建
 *
 * @author auto create
 * @since 1.0, 2026-06-10 11:05:04
 */
public class AlipayOfflineProviderDeviceRelationBatchcreateModel extends AlipayObject {

	private static final long serialVersionUID = 6628875879295479313L;

	/**
	 * 设备关联信息列表
	 */
	@ApiListField("device_relation_list")
	@ApiField("device_relation_detail")
	private List<DeviceRelationDetail> deviceRelationList;

	public List<DeviceRelationDetail> getDeviceRelationList() {
		return this.deviceRelationList;
	}
	public void setDeviceRelationList(List<DeviceRelationDetail> deviceRelationList) {
		this.deviceRelationList = deviceRelationList;
	}

}
