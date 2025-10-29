package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PropertyDeviceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.property.device.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 10:17:37
 */
public class AlipayCommercePropertyDeviceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7823565567437789527L;

	/** 
	 * 设备信息列表
	 */
	@ApiListField("list")
	@ApiField("property_device_info")
	private List<PropertyDeviceInfo> list;

	/** 
	 * 查询到的总数量
	 */
	@ApiField("total")
	private Long total;

	public void setList(List<PropertyDeviceInfo> list) {
		this.list = list;
	}
	public List<PropertyDeviceInfo> getList( ) {
		return this.list;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
