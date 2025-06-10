package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.extension.bsn.destroy response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:44
 */
public class AlipayCloudCloudbaseExtensionBsnDestroyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7661154858385529961L;

	/** 
	 * 是否卸载成功
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
