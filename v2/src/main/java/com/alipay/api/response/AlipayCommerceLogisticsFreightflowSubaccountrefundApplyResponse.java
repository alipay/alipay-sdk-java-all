package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.freightflow.subaccountrefund.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-24 14:42:34
 */
public class AlipayCommerceLogisticsFreightflowSubaccountrefundApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6381377692578355478L;

	/** 
	 * 申请是否成功
	 */
	@ApiField("accepted_refund")
	private Boolean acceptedRefund;

	public void setAcceptedRefund(Boolean acceptedRefund) {
		this.acceptedRefund = acceptedRefund;
	}
	public Boolean getAcceptedRefund( ) {
		return this.acceptedRefund;
	}

}
