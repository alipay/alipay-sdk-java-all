package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TbapiQueryAmountResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.pcreditamount.queryprocessor.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 22:16:31
 */
public class AlipayPcreditHuabeiPcreditamountQueryprocessorQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4762872762543951154L;

	/** 
	 * 报错原因
	 */
	@ApiField("error_context")
	private String errorContext;

	/** 
	 * 响应体
	 */
	@ApiField("response")
	private TbapiQueryAmountResponse response;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setErrorContext(String errorContext) {
		this.errorContext = errorContext;
	}
	public String getErrorContext( ) {
		return this.errorContext;
	}

	public void setResponse(TbapiQueryAmountResponse response) {
		this.response = response;
	}
	public TbapiQueryAmountResponse getResponse( ) {
		return this.response;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
