package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.httpaccess.bind.delete response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:18
 */
public class AlipayCloudCloudbaseHttpaccessBindDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 3813158292648282362L;

	/** 
	 * 是否删除成功
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
