package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CreditPayMoneyVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.guarletter.payurl.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-24 17:36:18
 */
public class MybankCreditLoantradeGuarletterPayurlCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1315965682962664859L;

	/** 
	 * 受理状态
	 */
	@ApiField("accept_result")
	private String acceptResult;

	/** 
	 * 收费账户的账户名
	 */
	@ApiField("bank_card_name")
	private String bankCardName;

	/** 
	 * 收费账户的账号
	 */
	@ApiField("bank_card_no")
	private String bankCardNo;

	/** 
	 * 收费账户对应的银行名称
	 */
	@ApiField("bank_name")
	private String bankName;

	/** 
	 * 标的编号
	 */
	@ApiField("bid_no")
	private String bidNo;

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

	public void setBankCardName(String bankCardName) {
		this.bankCardName = bankCardName;
	}
	public String getBankCardName( ) {
		return this.bankCardName;
	}

	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}
	public String getBankCardNo( ) {
		return this.bankCardNo;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankName( ) {
		return this.bankName;
	}

	public void setBidNo(String bidNo) {
		this.bidNo = bidNo;
	}
	public String getBidNo( ) {
		return this.bidNo;
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
