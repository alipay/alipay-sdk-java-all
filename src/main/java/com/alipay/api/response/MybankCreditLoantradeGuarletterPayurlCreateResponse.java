package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CreditPayMoneyVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.guarletter.payurl.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-13 14:37:19
 */
public class MybankCreditLoantradeGuarletterPayurlCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2272469658394561623L;

	/** 
	 * 受理状态
	 */
	@ApiField("accept_result")
	private String acceptResult;

	/** 
	 * 收费金额
	 */
	@ApiField("fee_amt")
	private CreditPayMoneyVO feeAmt;

	/** 
	 * 收费链接
	 */
	@ApiField("fee_charge_url")
	private String feeChargeUrl;

	/** 
	 * 拒绝原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	public void setAcceptResult(String acceptResult) {
		this.acceptResult = acceptResult;
	}
	public String getAcceptResult( ) {
		return this.acceptResult;
	}

	public void setFeeAmt(CreditPayMoneyVO feeAmt) {
		this.feeAmt = feeAmt;
	}
	public CreditPayMoneyVO getFeeAmt( ) {
		return this.feeAmt;
	}

	public void setFeeChargeUrl(String feeChargeUrl) {
		this.feeChargeUrl = feeChargeUrl;
	}
	public String getFeeChargeUrl( ) {
		return this.feeChargeUrl;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}
	public String getRejectReason( ) {
		return this.rejectReason;
	}

}
