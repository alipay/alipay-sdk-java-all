package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.service.order.bind response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:55:09
 */
public class AlipayCommerceEcServiceOrderBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 4129355372989112251L;

	/** 
	 * 订购单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 签约地址
	 */
	@ApiField("sign_contract_url")
	private String signContractUrl;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setSignContractUrl(String signContractUrl) {
		this.signContractUrl = signContractUrl;
	}
	public String getSignContractUrl( ) {
		return this.signContractUrl;
	}

}
