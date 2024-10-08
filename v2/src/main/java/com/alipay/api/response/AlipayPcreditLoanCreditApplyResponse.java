package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.credit.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 17:49:45
 */
public class AlipayPcreditLoanCreditApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3215982716536587993L;

	/** 
	 * 授信申请受理单号
	 */
	@ApiField("credit_receipt_no")
	private String creditReceiptNo;

	/** 
	 * 支付宝授权成功后跳转至借呗服务的地址
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	public void setCreditReceiptNo(String creditReceiptNo) {
		this.creditReceiptNo = creditReceiptNo;
	}
	public String getCreditReceiptNo( ) {
		return this.creditReceiptNo;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}
	public String getRedirectUrl( ) {
		return this.redirectUrl;
	}

}
