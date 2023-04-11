package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.deployorder.result.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 14:46:49
 */
public class AlipayDataDataserviceDeployorderResultSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4255364747151488649L;

	/** 
	 * 处理是否成功
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
