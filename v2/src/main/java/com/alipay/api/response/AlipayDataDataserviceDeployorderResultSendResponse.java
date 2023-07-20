package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.deployorder.result.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 20:34:27
 */
public class AlipayDataDataserviceDeployorderResultSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6236683914262867457L;

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
