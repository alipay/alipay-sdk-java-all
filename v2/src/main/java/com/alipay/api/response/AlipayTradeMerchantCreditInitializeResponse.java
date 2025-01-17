package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.merchant.credit.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:11
 */
public class AlipayTradeMerchantCreditInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 2681693624745619798L;

	/** 
	 * 卖家可授信分配的额度单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("credit_quota")
	private String creditQuota;

	public void setCreditQuota(String creditQuota) {
		this.creditQuota = creditQuota;
	}
	public String getCreditQuota( ) {
		return this.creditQuota;
	}

}
