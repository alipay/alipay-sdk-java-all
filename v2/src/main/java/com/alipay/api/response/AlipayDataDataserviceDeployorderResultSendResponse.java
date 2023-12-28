package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.deployorder.result.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 02:41:17
 */
public class AlipayDataDataserviceDeployorderResultSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 3253768735229556883L;

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
