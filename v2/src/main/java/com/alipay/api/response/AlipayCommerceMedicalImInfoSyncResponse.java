package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.im.info.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-14 15:02:45
 */
public class AlipayCommerceMedicalImInfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4538718875229233874L;

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
