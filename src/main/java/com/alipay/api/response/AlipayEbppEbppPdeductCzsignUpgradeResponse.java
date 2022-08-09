package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.ebpp.pdeduct.czsign.upgrade response.
 * 
 * @author auto create
 * @since 1.0, 2020-06-23 14:20:15
 */
public class AlipayEbppEbppPdeductCzsignUpgradeResponse extends AlipayResponse {

	private static final long serialVersionUID = 1286747427478796843L;

	/** 
	 * 错误信息文案
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 升级后新的协议ID
	 */
	@ApiField("new_agreement_id")
	private String newAgreementId;

	/** 
	 * 当前更新结果是否成功
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage( ) {
		return this.errorMessage;
	}

	public void setNewAgreementId(String newAgreementId) {
		this.newAgreementId = newAgreementId;
	}
	public String getNewAgreementId( ) {
		return this.newAgreementId;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
