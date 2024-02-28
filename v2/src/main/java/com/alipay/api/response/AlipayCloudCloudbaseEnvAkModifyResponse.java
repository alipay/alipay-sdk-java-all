package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.env.ak.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-09 10:51:39
 */
public class AlipayCloudCloudbaseEnvAkModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5731921853548444237L;

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
