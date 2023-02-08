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
 * @since 1.0, 2023-01-11 05:26:25
 */
public class AlipayCommerceIotDapplyOrderdeviceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6864347254788883747L;

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
