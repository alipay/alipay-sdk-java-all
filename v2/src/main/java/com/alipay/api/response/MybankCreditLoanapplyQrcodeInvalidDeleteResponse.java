package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.qrcode.invalid.delete response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 12:25:19
 */
public class MybankCreditLoanapplyQrcodeInvalidDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 2487896487938662618L;

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
