package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.putplan.recover response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:14:36
 */
public class DatadigitalFincloudFinsaasPutplanRecoverResponse extends AlipayResponse {

	private static final long serialVersionUID = 3423918184859238127L;

	/** 
	 * 描述信息
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 恢复结果
	 */
	@ApiField("result")
	private Boolean result;

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
