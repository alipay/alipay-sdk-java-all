package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.issalary.settledata.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 19:30:16
 */
public class AlipayIserviceIssalarySettledataCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7762961168883539979L;

	/** 
	 * 操作结果信息
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
