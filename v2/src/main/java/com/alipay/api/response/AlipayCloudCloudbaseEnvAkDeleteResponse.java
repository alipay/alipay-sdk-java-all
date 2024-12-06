package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.env.ak.delete response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:27
 */
public class AlipayCloudCloudbaseEnvAkDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 4146788332455233878L;

	/** 
	 * 删除ak结果
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
