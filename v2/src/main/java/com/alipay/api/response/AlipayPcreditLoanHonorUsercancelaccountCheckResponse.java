package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.honor.usercancelaccount.check response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-12 15:32:39
 */
public class AlipayPcreditLoanHonorUsercancelaccountCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 4236758154892462325L;

	/** 
	 * 是否可注销
	 */
	@ApiField("logoff_allowed")
	private Boolean logoffAllowed;

	/** 
	 * 不可注销原因
	 */
	@ApiField("reason")
	private String reason;

	public void setLogoffAllowed(Boolean logoffAllowed) {
		this.logoffAllowed = logoffAllowed;
	}
	public Boolean getLogoffAllowed( ) {
		return this.logoffAllowed;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getReason( ) {
		return this.reason;
	}

}
