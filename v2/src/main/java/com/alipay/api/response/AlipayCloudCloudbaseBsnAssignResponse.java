package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.bsn.assign response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-27 15:12:05
 */
public class AlipayCloudCloudbaseBsnAssignResponse extends AlipayResponse {

	private static final long serialVersionUID = 6267585598469389598L;

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
