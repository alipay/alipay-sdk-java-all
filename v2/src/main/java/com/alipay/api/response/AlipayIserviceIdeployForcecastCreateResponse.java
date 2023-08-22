package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ideploy.forcecast.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 21:12:03
 */
public class AlipayIserviceIdeployForcecastCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5412771757465938892L;

	/** 
	 * 操作结果
	 */
	@ApiField("op_result")
	private Boolean opResult;

	/** 
	 * 操作结果提示
	 */
	@ApiField("op_result_msg")
	private String opResultMsg;

	public void setOpResult(Boolean opResult) {
		this.opResult = opResult;
	}
	public Boolean getOpResult( ) {
		return this.opResult;
	}

	public void setOpResultMsg(String opResultMsg) {
		this.opResultMsg = opResultMsg;
	}
	public String getOpResultMsg( ) {
		return this.opResultMsg;
	}

}
