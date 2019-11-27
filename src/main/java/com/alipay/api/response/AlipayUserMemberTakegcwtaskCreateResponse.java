package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.member.takegcwtask.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-10-18 17:30:32
 */
public class AlipayUserMemberTakegcwtaskCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4188694623597135857L;

	/** 
	 * 任务流水id，唯一值，用于双方幂等控制
	 */
	@ApiField("flow_id")
	private String flowId;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * true领取成功，false领取失败
	 */
	@ApiField("success")
	private Boolean success;

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}
	public String getFlowId( ) {
		return this.flowId;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
