package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.extension.mysql.destroy response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-18 14:51:45
 */
public class AlipayCloudCloudbaseExtensionMysqlDestroyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3717477817656851868L;

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
