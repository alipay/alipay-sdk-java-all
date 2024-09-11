package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.settleaccountused.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-03 16:52:08
 */
public class AlipayCommerceMerchantcardSettleaccountusedQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3572149867863939214L;

	/** 
	 * 结算收款的支付宝账号，登录账号，非pid
	 */
	@ApiField("settle_alipay_logon_id")
	private String settleAlipayLogonId;

	public void setSettleAlipayLogonId(String settleAlipayLogonId) {
		this.settleAlipayLogonId = settleAlipayLogonId;
	}
	public String getSettleAlipayLogonId( ) {
		return this.settleAlipayLogonId;
	}

}
