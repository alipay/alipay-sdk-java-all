package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.externalaccount.bind.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-08 18:41:41
 */
public class AlipayCloudCloudbaseExternalaccountBindDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 4247558288724715894L;

	/** 
	 * 解绑结果
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
