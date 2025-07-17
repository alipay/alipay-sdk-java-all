package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备解绑
 *
 * @author auto create
 * @since 1.0, 2025-07-11 14:27:48
 */
public class AlipayOfflineProviderCollaborateDeviceUnbindModel extends AlipayObject {

	private static final long serialVersionUID = 5427385578987762166L;

	/**
	 * 设备SN
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 托管一定有
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
