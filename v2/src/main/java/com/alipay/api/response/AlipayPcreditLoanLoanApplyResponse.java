package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.loan.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 00:17:08
 */
public class AlipayPcreditLoanLoanApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3235551513346843556L;

	/** 
	 * 贷款申请受理单号
	 */
	@ApiField("apply_receipt_no")
	private String applyReceiptNo;

	/** 
	 * 跳转至支付宝地址
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	public void setApplyReceiptNo(String applyReceiptNo) {
		this.applyReceiptNo = applyReceiptNo;
	}
	public String getApplyReceiptNo( ) {
		return this.applyReceiptNo;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}
	public String getRedirectUrl( ) {
		return this.redirectUrl;
	}

}
