package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.contract.quick.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-02-28 20:10:06
 */
public class ZhimaMerchantContractQuickCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8454877857988674897L;

	/** 
	 * 发约单单号
	 */
	@ApiField("offer_no")
	private String offerNo;

	public void setOfferNo(String offerNo) {
		this.offerNo = offerNo;
	}
	public String getOfferNo( ) {
		return this.offerNo;
	}

}
