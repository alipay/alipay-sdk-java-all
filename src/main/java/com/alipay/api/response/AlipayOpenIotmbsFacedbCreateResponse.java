package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotmbs.facedb.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-29 10:07:48
 */
public class AlipayOpenIotmbsFacedbCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2591184537478272366L;

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
