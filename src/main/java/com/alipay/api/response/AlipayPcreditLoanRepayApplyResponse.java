package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.repay.apply response.
 * 
 * @author auto create
 * @since 1.0, 2018-11-15 14:55:00
 */
public class AlipayPcreditLoanRepayApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1281963138321229521L;

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
