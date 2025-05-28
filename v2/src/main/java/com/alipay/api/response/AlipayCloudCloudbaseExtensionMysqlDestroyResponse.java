package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.extension.mysql.destroy response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:36
 */
public class AlipayCloudCloudbaseExtensionMysqlDestroyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4746325229223895617L;

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
