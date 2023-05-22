package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FenceEvent;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.device.geofence.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 21:44:56
 */
public class AlipayCommerceIotDeviceGeofenceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6639519387559392256L;

	/** 
	 * 返回线路上绑定的设备列表
	 */
	@ApiListField("bind_device")
	@ApiField("string")
	private List<String> bindDevice;

	/** 
	 * 地图围栏事件
	 */
	@ApiListField("fence_events")
	@ApiField("fence_event")
	private List<FenceEvent> fenceEvents;

	public void setBindDevice(List<String> bindDevice) {
		this.bindDevice = bindDevice;
	}
	public List<String> getBindDevice( ) {
		return this.bindDevice;
	}

	public void setFenceEvents(List<FenceEvent> fenceEvents) {
		this.fenceEvents = fenceEvents;
	}
	public List<FenceEvent> getFenceEvents( ) {
		return this.fenceEvents;
	}

}
