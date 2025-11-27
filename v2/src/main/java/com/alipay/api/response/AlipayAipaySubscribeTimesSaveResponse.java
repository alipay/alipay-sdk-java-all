package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SubscribeCountTimeResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.aipay.subscribe.times.save response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-04 10:07:37
 */
public class AlipayAipaySubscribeTimesSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 6365433992622279835L;

	/** 
	 * 计数是否成功
	 */
	@ApiField("data")
	private SubscribeCountTimeResponse data;

	/** 
	 * 请求失败的错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 错误信息
	 */
	@ApiField("error_message")
	private String errorMessage;

	public void setData(SubscribeCountTimeResponse data) {
		this.data = data;
	}
	public SubscribeCountTimeResponse getData( ) {
		return this.data;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage( ) {
		return this.errorMessage;
	}

}
