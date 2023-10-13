package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.service.order.buy response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 00:16:46
 */
public class AlipayCommerceEcServiceOrderBuyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5274459179153672454L;

	/** 
	 * 订购单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 需要跳转企业码签约的订购，会返回签约地址
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
