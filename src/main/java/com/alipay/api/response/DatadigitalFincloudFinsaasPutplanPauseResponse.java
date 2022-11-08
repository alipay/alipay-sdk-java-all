package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.putplan.pause response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-21 17:31:38
 */
public class DatadigitalFincloudFinsaasPutplanPauseResponse extends AlipayResponse {

	private static final long serialVersionUID = 2542879451782588796L;

	/** 
	 * 描述信息
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 暂停操作结果
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
