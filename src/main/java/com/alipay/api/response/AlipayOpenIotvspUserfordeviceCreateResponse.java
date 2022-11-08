package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotvsp.userfordevice.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-07 16:21:43
 */
public class AlipayOpenIotvspUserfordeviceCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8816197381342352726L;

	/** 
	 * 操作流水号
	 */
	@ApiField("unique_id")
	private String uniqueId;

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getUniqueId( ) {
		return this.uniqueId;
	}

}
