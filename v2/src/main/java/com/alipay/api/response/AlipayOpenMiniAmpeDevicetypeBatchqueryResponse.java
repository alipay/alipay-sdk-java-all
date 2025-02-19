package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AmpeDeviceTypeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.ampe.devicetype.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-03 11:57:00
 */
public class AlipayOpenMiniAmpeDevicetypeBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2298767586846752612L;

	/** 
	 * 设备类型列表
	 */
	@ApiListField("device_type_list")
	@ApiField("ampe_device_type_info")
	private List<AmpeDeviceTypeInfo> deviceTypeList;

	public void setDeviceTypeList(List<AmpeDeviceTypeInfo> deviceTypeList) {
		this.deviceTypeList = deviceTypeList;
	}
	public List<AmpeDeviceTypeInfo> getDeviceTypeList( ) {
		return this.deviceTypeList;
	}

}
