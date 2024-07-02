package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.jf.export.unsign response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-27 14:47:03
 */
public class AlipayEbppJfExportUnsignResponse extends AlipayResponse {

	private static final long serialVersionUID = 8233683174893848142L;

	/** 
	 * 是否成功
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
