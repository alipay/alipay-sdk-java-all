package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.collaborate.device.unbind response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-15 14:22:33
 */
public class AlipayOfflineProviderCollaborateDeviceUnbindResponse extends AlipayResponse {

	private static final long serialVersionUID = 2791944971651545418L;

	/** 
	 * 设备SN
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/** 
	 * 托管必传
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}
	public String getDeviceSn( ) {
		return this.deviceSn;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
