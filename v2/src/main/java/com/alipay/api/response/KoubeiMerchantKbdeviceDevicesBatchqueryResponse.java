package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeviceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.kbdevice.devices.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 03:20:38
 */
public class KoubeiMerchantKbdeviceDevicesBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3183146592517273366L;

	/** 
	 * 门店下设备列表
	 */
	@ApiListField("device_info_list")
	@ApiField("device_info")
	private List<DeviceInfo> deviceInfoList;

	public void setDeviceInfoList(List<DeviceInfo> deviceInfoList) {
		this.deviceInfoList = deviceInfoList;
	}
	public List<DeviceInfo> getDeviceInfoList( ) {
		return this.deviceInfoList;
	}

}
