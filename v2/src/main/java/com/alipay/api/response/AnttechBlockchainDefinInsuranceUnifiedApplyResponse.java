package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.insurance.unified.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 01:49:56
 */
public class AnttechBlockchainDefinInsuranceUnifiedApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2612933441356732485L;

	/** 
	 * 业务消息
	 */
	@ApiField("biz_message")
	private String bizMessage;

	/** 
	 * 保司投保单号
	 */
	@ApiField("inst_apply_no")
	private String instApplyNo;

	/** 
	 * 保司保单号
	 */
	@ApiField("inst_policy_no")
	private String instPolicyNo;

	/** 
	 * 保单状态
	 */
	@ApiField("policy_status")
	private String policyStatus;

	/** 
	 * 原币种保费
	 */
	@ApiField("premium")
	private String premium;

	/** 
	 * 请求交易流水号
	 */
	@ApiField("request_no")
	private String requestNo;

	public void setBizMessage(String bizMessage) {
		this.bizMessage = bizMessage;
	}
	public String getBizMessage( ) {
		return this.bizMessage;
	}

	public void setInstApplyNo(String instApplyNo) {
		this.instApplyNo = instApplyNo;
	}
	public String getInstApplyNo( ) {
		return this.instApplyNo;
	}

	public void setInstPolicyNo(String instPolicyNo) {
		this.instPolicyNo = instPolicyNo;
	}
	public String getInstPolicyNo( ) {
		return this.instPolicyNo;
	}

	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}
	public String getPolicyStatus( ) {
		return this.policyStatus;
	}

	public void setPremium(String premium) {
		this.premium = premium;
	}
	public String getPremium( ) {
		return this.premium;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}
	public String getRequestNo( ) {
		return this.requestNo;
	}

}
