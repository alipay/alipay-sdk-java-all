package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.env.resourcepackage.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-10 20:01:38
 */
public class AlipayCloudCloudbaseEnvResourcepackageModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7761627449458477149L;

	/** 
	 * 升降配结果
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
