package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 更新设备版本
 *
 * @author auto create
 * @since 1.0, 2025-09-05 19:43:19
 */
public class AlipayOfflineProviderCollaborateDevicebindUpdatecontextModel extends AlipayObject {

	private static final long serialVersionUID = 6611475615475112539L;

	/**
	 * 发起操作的设备SN
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 更新设备版本入参额外信息
	 */
	@ApiField("ext_params")
	private UpdateContentExtAttribute extParams;

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public UpdateContentExtAttribute getExtParams() {
		return this.extParams;
	}
	public void setExtParams(UpdateContentExtAttribute extParams) {
		this.extParams = extParams;
	}

}
