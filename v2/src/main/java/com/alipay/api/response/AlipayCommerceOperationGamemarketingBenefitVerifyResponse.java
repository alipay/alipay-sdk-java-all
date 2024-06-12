package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.gamemarketing.benefit.verify response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 20:55:12
 */
public class AlipayCommerceOperationGamemarketingBenefitVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5584134723585424567L;

	/** 
	 * 卡券核销状态
	 */
	@ApiField("voucher_verify_status")
	private Boolean voucherVerifyStatus;

	public void setVoucherVerifyStatus(Boolean voucherVerifyStatus) {
		this.voucherVerifyStatus = voucherVerifyStatus;
	}
	public Boolean getVoucherVerifyStatus( ) {
		return this.voucherVerifyStatus;
	}

}
