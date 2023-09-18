package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.extension.sms.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-14 17:41:44
 */
public class AlipayCloudCloudbaseExtensionSmsApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5464745425684643635L;

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
