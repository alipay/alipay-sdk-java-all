package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.freightflow.subaccount.delete response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-16 15:22:40
 */
public class AlipayCommerceLogisticsFreightflowSubaccountDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 2122438473617751533L;

	/** 
	 * 销户是否完成
	 */
	@ApiField("cancel_account_flag")
	private Boolean cancelAccountFlag;

	public void setCancelAccountFlag(Boolean cancelAccountFlag) {
		this.cancelAccountFlag = cancelAccountFlag;
	}
	public Boolean getCancelAccountFlag( ) {
		return this.cancelAccountFlag;
	}

}
