package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.zmgo.agreement.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-11 15:08:44
 */
public class ZhimaCreditPeZmgoAgreementQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3837167141298122175L;

	/** 
	 * 支付宝系统中用以唯一标识用户签约记录的编号，即花芝轻会员协议号。
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/** 
	 * 协议名称
	 */
	@ApiField("agreement_name")
	private String agreementName;

	/** 
	 * 协议状态。Y表示状态有效，N表示状态失效
	 */
	@ApiField("agreement_status")
	private String agreementStatus;

	/** 
	 * 支付宝用户userId
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}
	public String getAgreementId( ) {
		return this.agreementId;
	}

	public void setAgreementName(String agreementName) {
		this.agreementName = agreementName;
	}
	public String getAgreementName( ) {
		return this.agreementName;
	}

	public void setAgreementStatus(String agreementStatus) {
		this.agreementStatus = agreementStatus;
	}
	public String getAgreementStatus( ) {
		return this.agreementStatus;
	}

	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

}
