package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.issalary.data.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-26 11:16:49
 */
public class AlipayIserviceIssalaryDataUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 7487969752428591239L;

	/** 
	 * 操作结果描述
	 */
	@ApiField("op_msg")
	private String opMsg;

	/** 
	 * 操作结果
	 */
	@ApiField("op_result")
	private Boolean opResult;

	public void setOpMsg(String opMsg) {
		this.opMsg = opMsg;
	}
	public String getOpMsg( ) {
		return this.opMsg;
	}

	public void setOpResult(Boolean opResult) {
		this.opResult = opResult;
	}
	public Boolean getOpResult( ) {
		return this.opResult;
	}

}
