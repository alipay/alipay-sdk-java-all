package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotmbs.facedb.delete response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:32:40
 */
public class AlipayOpenIotmbsFacedbDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 3216344673661278313L;

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
