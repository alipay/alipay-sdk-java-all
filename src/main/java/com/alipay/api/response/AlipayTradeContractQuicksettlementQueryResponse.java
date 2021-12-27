package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.contract.quicksettlement.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-08-19 14:05:49
 */
public class AlipayTradeContractQuicksettlementQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8642694779611453466L;

	/** 
	 * 极速收总额度，单位元
	 */
	@ApiField("credit_quota")
	private String creditQuota;

	/** 
	 * 待还款金额，单位元
	 */
	@ApiField("left_advance_quota")
	private String leftAdvanceQuota;

	/** 
	 * 当前剩余额度，单位元
	 */
	@ApiField("left_credit_quota")
	private String leftCreditQuota;

	/** 
	 * 服务状态(true: 已开启，false: 已暂停)
	 */
	@ApiField("service_state")
	private String serviceState;

	/** 
	 * 签约状态（true: 已签约，false: 未签约）
	 */
	@ApiField("signed")
	private String signed;

	public void setCreditQuota(String creditQuota) {
		this.creditQuota = creditQuota;
	}
	public String getCreditQuota( ) {
		return this.creditQuota;
	}

	public void setLeftAdvanceQuota(String leftAdvanceQuota) {
		this.leftAdvanceQuota = leftAdvanceQuota;
	}
	public String getLeftAdvanceQuota( ) {
		return this.leftAdvanceQuota;
	}

	public void setLeftCreditQuota(String leftCreditQuota) {
		this.leftCreditQuota = leftCreditQuota;
	}
	public String getLeftCreditQuota( ) {
		return this.leftCreditQuota;
	}

	public void setServiceState(String serviceState) {
		this.serviceState = serviceState;
	}
	public String getServiceState( ) {
		return this.serviceState;
	}

	public void setSigned(String signed) {
		this.signed = signed;
	}
	public String getSigned( ) {
		return this.signed;
	}

}
