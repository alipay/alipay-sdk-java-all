package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.httpaccess.domain.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-31 12:16:42
 */
public class AlipayCloudCloudbaseHttpaccessDomainCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8617852599146621789L;

	/** 
	 * 是否创建成功
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
