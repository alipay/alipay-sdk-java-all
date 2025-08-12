package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.extension.bsn.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:44
 */
public class AlipayCloudCloudbaseExtensionBsnApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8247258325383577421L;

	/** 
	 * 是否已成功开始安装
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
