package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.arater.ratestatus.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:27:42
 */
public class AlipayOpenAppAraterRatestatusModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6395226594499774311L;

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
