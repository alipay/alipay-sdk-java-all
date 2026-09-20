package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.customer.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-02 11:27:56
 */
public class AlipayTradeCustomerCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8159392661795614687L;

	/** 
	 * 客户id
	 */
	@ApiField("customer_id")
	private String customerId;

	/** 
	 * 商家入参传入的幂等号。若未传入，支付宝将自动生成AUTO_开头的随机幂等号
	 */
	@ApiField("merchant_request_no")
	private String merchantRequestNo;

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerId( ) {
		return this.customerId;
	}

	public void setMerchantRequestNo(String merchantRequestNo) {
		this.merchantRequestNo = merchantRequestNo;
	}
	public String getMerchantRequestNo( ) {
		return this.merchantRequestNo;
	}

}
