package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotmbs.facedb.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-08 14:26:42
 */
public class AlipayOpenIotmbsFacedbCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8467123471922734527L;

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
