package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.repay.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 02:37:06
 */
public class AlipayPcreditLoanRepayApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6113756918874285274L;

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
