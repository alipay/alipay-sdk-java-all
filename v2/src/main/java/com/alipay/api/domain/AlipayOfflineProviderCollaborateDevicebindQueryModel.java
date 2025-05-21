package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备信息查询
 *
 * @author auto create
 * @since 1.0, 2025-05-15 14:48:19
 */
public class AlipayOfflineProviderCollaborateDevicebindQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3893242916535642678L;

	/**
	 * 设备SN
	 */
	@ApiField("device_sn")
	private String deviceSn;

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

}
