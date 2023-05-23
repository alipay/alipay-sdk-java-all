package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.arater.ratestatus.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 21:37:29
 */
public class AlipayOpenAppAraterRatestatusModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8428693163515672932L;

	/** 
	 * 是否更惨成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
