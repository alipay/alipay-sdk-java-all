package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.qrcode.invalid.delete response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-23 15:40:33
 */
public class MybankCreditLoanapplyQrcodeInvalidDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 8837571394894694283L;

	/** 
	 * true:失效成功 false:失效失败
	 */
	@ApiField("status")
	private Boolean status;

	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Boolean getStatus( ) {
		return this.status;
	}

}
