package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.operator.logonpassword.verify response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:07
 */
public class AlipayUserAccountOperatorLogonpasswordVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2688665636447699249L;

	/** 
	 * PASSWORD_NOT_MATCH 密码不匹配
PASSWORD_LOCKED 密码暂时锁定
CIF_SYSTEM_FAILURE 系统错误
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 密码错误次数
	 */
	@ApiField("fail_times")
	private Long failTimes;

	/** 
	 * 密码校验通过返回true，否则返回false
	 */
	@ApiField("verify_success")
	private Boolean verifySuccess;

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setFailTimes(Long failTimes) {
		this.failTimes = failTimes;
	}
	public Long getFailTimes( ) {
		return this.failTimes;
	}

	public void setVerifySuccess(Boolean verifySuccess) {
		this.verifySuccess = verifySuccess;
	}
	public Boolean getVerifySuccess( ) {
		return this.verifySuccess;
	}

}
