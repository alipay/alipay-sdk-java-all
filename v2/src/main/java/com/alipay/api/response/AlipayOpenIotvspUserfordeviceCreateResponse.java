package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotvsp.userfordevice.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-18 14:10:21
 */
public class AlipayOpenIotvspUserfordeviceCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2525635551334555381L;

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
