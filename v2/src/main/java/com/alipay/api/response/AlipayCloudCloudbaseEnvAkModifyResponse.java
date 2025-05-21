package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.env.ak.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:27
 */
public class AlipayCloudCloudbaseEnvAkModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4564541685513172911L;

	/** 
	 * 修改ak结果
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
