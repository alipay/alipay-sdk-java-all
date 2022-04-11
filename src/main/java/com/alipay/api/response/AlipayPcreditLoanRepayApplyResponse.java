package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.repay.apply response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-21 23:53:58
 */
public class AlipayPcreditLoanRepayApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1398745751238686556L;

	/** 
	 * 跳转至支付宝地址
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	/** 
	 * 还款申请受理单号
	 */
	@ApiField("repay_receipt_no")
	private String repayReceiptNo;

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}
	public String getRedirectUrl( ) {
		return this.redirectUrl;
	}

	public void setRepayReceiptNo(String repayReceiptNo) {
		this.repayReceiptNo = repayReceiptNo;
	}
	public String getRepayReceiptNo( ) {
		return this.repayReceiptNo;
	}

}
