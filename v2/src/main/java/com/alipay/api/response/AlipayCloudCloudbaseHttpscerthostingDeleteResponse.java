package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.httpscerthosting.delete response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-06 16:22:02
 */
public class AlipayCloudCloudbaseHttpscerthostingDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 4661775331749754687L;

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
