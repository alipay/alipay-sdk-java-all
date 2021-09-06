package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeviceGroup;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.group.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2020-08-19 20:11:23
 */
public class AlipayCommerceIotGroupBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6831461548374525749L;

	/** 
	 * 分组列表
	 */
	@ApiListField("groups")
	@ApiField("device_group")
	private List<DeviceGroup> groups;

	/** 
	 * 设备分组总数
	 */
	@ApiListField("total")
	@ApiField("number")
	private List<Long> total;

	public void setGroups(List<DeviceGroup> groups) {
		this.groups = groups;
	}
	public List<DeviceGroup> getGroups( ) {
		return this.groups;
	}

	public void setTotal(List<Long> total) {
		this.total = total;
	}
	public List<Long> getTotal( ) {
		return this.total;
	}

}
