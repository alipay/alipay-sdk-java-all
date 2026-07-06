package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.im.info.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-05 17:57:54
 */
public class AlipayCommerceMedicalImInfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6617842484858176749L;

	/** 
	 * 结果数据
true，false
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
