package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotmbs.facecheck.send response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 13:16:40
 */
public class AlipayOpenIotmbsFacecheckSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 8364534167318537839L;

	/** 
	 * 成功true失败false
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
