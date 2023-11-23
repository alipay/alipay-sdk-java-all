package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.env.destroy response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-08 22:46:41
 */
public class AlipayCloudCloudbaseEnvDestroyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2245376871392244578L;

	/** 
	 * 删除结果
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
