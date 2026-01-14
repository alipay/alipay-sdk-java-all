package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeviceStatusInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: robby.open.device.status.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-05 17:47:43
 */
public class RobbyOpenDeviceStatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3338785527257551673L;

	/** 
	 * null
	 */
	@ApiListField("result")
	@ApiField("device_status_info")
	private List<DeviceStatusInfo> result;

	public void setResult(List<DeviceStatusInfo> result) {
		this.result = result;
	}
	public List<DeviceStatusInfo> getResult( ) {
		return this.result;
	}

}
