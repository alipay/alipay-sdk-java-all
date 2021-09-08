package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.member.completegcwtask.modify response.
 * 
 * @author auto create
 * @since 1.0, 2019-10-18 17:30:40
 */
public class AlipayUserMemberCompletegcwtaskModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1663572143971769184L;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * true推进任务成功，false推进任务失败，需要重试
	 */
	@ApiField("success")
	private Boolean success;

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
