package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.env.ak.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-09 11:06:39
 */
public class AlipayCloudCloudbaseEnvAkCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8239523444271841277L;

	/** 
	 * 创建ak结果
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
