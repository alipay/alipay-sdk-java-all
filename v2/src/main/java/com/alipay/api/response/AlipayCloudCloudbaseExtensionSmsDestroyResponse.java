package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.extension.sms.destroy response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:42
 */
public class AlipayCloudCloudbaseExtensionSmsDestroyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2865852691785651236L;

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
