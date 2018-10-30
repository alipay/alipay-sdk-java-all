package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.scene.cooperation.consult response.
 * 
 * @author auto create
 * @since 1.0, 2018-07-17 11:10:00
 */
public class AlipayUserSceneCooperationConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 1892773644621785374L;

	/** 
	 * true表示该用户运营有价值；false表示没有价值
	 */
	@ApiField("consult_result")
	private Boolean consultResult;

	/** 
	 * 表示邀请关系建立结果。true表示邀请关系建立成功，false表示不建立邀请关系或建立失败
	 */
	@ApiField("invite_result")
	private Boolean inviteResult;

	public void setConsultResult(Boolean consultResult) {
		this.consultResult = consultResult;
	}
	public Boolean getConsultResult( ) {
		return this.consultResult;
	}

	public void setInviteResult(Boolean inviteResult) {
		this.inviteResult = inviteResult;
	}
	public Boolean getInviteResult( ) {
		return this.inviteResult;
	}

}
