package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.antdataassets.cloudjobstatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 01:16:12
 */
public class AlipayDataDataserviceAntdataassetsCloudjobstatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3876967582199675224L;

	/** 
	 * 上云任务失败时给出的任务错误信息
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 上云任务状态
	 */
	@ApiField("status")
	private Long status;

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage( ) {
		return this.errorMessage;
	}

	public void setStatus(Long status) {
		this.status = status;
	}
	public Long getStatus( ) {
		return this.status;
	}

}
