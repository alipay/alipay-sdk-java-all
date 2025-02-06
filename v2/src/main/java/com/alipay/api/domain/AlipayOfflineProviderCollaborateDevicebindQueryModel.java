package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备信息查询
 *
 * @author auto create
 * @since 1.0, 2025-01-27 22:48:59
 */
public class AlipayOfflineProviderCollaborateDevicebindQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5627626612771946312L;

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
