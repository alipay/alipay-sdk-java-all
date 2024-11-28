package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.arater.ratestatus.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-28 20:29:39
 */
public class AlipayOpenAppAraterRatestatusModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8178849513843514743L;

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
