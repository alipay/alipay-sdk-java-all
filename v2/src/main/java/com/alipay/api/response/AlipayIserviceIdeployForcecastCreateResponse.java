package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ideploy.forcecast.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 21:26:49
 */
public class AlipayIserviceIdeployForcecastCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8623611683715143921L;

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
