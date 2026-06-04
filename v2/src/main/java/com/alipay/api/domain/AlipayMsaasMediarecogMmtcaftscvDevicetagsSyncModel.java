package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 行业同步CV设备标签信息接口
 *
 * @author auto create
 * @since 1.0, 2026-04-24 17:21:28
 */
public class AlipayMsaasMediarecogMmtcaftscvDevicetagsSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7687671176644644317L;

	/**
	 * 设备号
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备标签集合
	 */
	@ApiListField("device_label_infos")
	@ApiField("device_label_info")
	private List<DeviceLabelInfo> deviceLabelInfos;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public List<DeviceLabelInfo> getDeviceLabelInfos() {
		return this.deviceLabelInfos;
	}
	public void setDeviceLabelInfos(List<DeviceLabelInfo> deviceLabelInfos) {
		this.deviceLabelInfos = deviceLabelInfos;
	}

}
