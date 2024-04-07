package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotmbs.facedb.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 21:13:02
 */
public class AlipayOpenIotmbsFacedbDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 2198461561671399238L;

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
