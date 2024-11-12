package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.extension.mysql.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-18 14:51:45
 */
public class AlipayCloudCloudbaseExtensionMysqlApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2119831884335896888L;

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
