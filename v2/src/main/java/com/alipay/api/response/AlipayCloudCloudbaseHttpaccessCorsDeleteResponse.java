package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.httpaccess.cors.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-08 23:36:41
 */
public class AlipayCloudCloudbaseHttpaccessCorsDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 7858174977764627355L;

	/** 
	 * 是否删除成功
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
