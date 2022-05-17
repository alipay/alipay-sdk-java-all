package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.instservice.signresult.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-12 17:56:47
 */
public class AlipayEbppInstserviceSignresultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4759921735858432463L;

	/** 
	 * 支付宝签约协议id
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/** 
	 * 用户签约的户号
	 */
	@ApiField("bill_key")
	private String billKey;

	/** 
	 * 签约机构编码
	 */
	@ApiField("inst_id")
	private String instId;

	/** 
	 * 登录ID
	 */
	@ApiField("login_id")
	private String loginId;

	/** 
	 * 外部协议号
	 */
	@ApiField("out_agreement_id")
	private String outAgreementId;

	/** 
	 * 签约状态：sign：已签约，unsign：已解约，not_sign：未签约，signing： 签约中
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}
	public String getAgreementId( ) {
		return this.agreementId;
	}

	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}
	public String getBillKey( ) {
		return this.billKey;
	}

	public void setInstId(String instId) {
		this.instId = instId;
	}
	public String getInstId( ) {
		return this.instId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getLoginId( ) {
		return this.loginId;
	}

	public void setOutAgreementId(String outAgreementId) {
		this.outAgreementId = outAgreementId;
	}
	public String getOutAgreementId( ) {
		return this.outAgreementId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
