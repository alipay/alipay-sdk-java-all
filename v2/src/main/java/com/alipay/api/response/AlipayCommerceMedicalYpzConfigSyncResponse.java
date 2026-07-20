package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.ypz.config.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-23 13:42:55
 */
public class AlipayCommerceMedicalYpzConfigSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2835961953583873825L;

	/** 
	 * 返回值
	 */
	@ApiField("data")
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}
