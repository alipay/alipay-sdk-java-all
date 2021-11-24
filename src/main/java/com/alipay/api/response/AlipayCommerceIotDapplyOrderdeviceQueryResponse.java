package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeviceApplyOrderDeviceModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.dapply.orderdevice.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-07 14:27:15
 */
public class AlipayCommerceIotDapplyOrderdeviceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8294982728796981413L;

	/** 
	 * 设备信息列表
	 */
	@ApiListField("device_infos")
	@ApiField("device_apply_order_device_model")
	private List<DeviceApplyOrderDeviceModel> deviceInfos;

	public void setDeviceInfos(List<DeviceApplyOrderDeviceModel> deviceInfos) {
		this.deviceInfos = deviceInfos;
	}
	public List<DeviceApplyOrderDeviceModel> getDeviceInfos( ) {
		return this.deviceInfos;
	}

}
