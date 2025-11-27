package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.bsn.assign response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-04 11:09:02
 */
public class AlipayCloudCloudbaseBsnAssignResponse extends AlipayResponse {

	private static final long serialVersionUID = 1742416494238187385L;

	/** 
	 * 授权结果
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
