package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.creditinfo.authaward.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-26 11:17:41
 */
public class ZhimaCustomerCreditinfoAuthawardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2192326335283528781L;

	/** 
	 * 当auth=true时，才会返回奖励相关信息
	 */
	@ApiField("auth")
	private Boolean auth;

	/** 
	 * send_award=false，该值不存在
send_award=true，该值为1%~100%（进度值）
	 */
	@ApiField("award")
	private String award;

	/** 
	 * 该授权单号是否发放过授权奖励
	 */
	@ApiField("send_award")
	private Boolean sendAward;

	public void setAuth(Boolean auth) {
		this.auth = auth;
	}
	public Boolean getAuth( ) {
		return this.auth;
	}

	public void setAward(String award) {
		this.award = award;
	}
	public String getAward( ) {
		return this.award;
	}

	public void setSendAward(Boolean sendAward) {
		this.sendAward = sendAward;
	}
	public Boolean getSendAward( ) {
		return this.sendAward;
	}

}
