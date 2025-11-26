package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.outerorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-24 20:27:41
 */
public class AlipayCommerceMedicalOuterorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5671151556393292676L;

	/** 
	 * 履约的URL
	 */
	@ApiField("fulfillment_url")
	private String fulfillmentUrl;

	/** 
	 * 合作方订单号
	 */
	@ApiField("partner_order_id")
	private String partnerOrderId;

	public void setFulfillmentUrl(String fulfillmentUrl) {
		this.fulfillmentUrl = fulfillmentUrl;
	}
	public String getFulfillmentUrl( ) {
		return this.fulfillmentUrl;
	}

	public void setPartnerOrderId(String partnerOrderId) {
		this.partnerOrderId = partnerOrderId;
	}
	public String getPartnerOrderId( ) {
		return this.partnerOrderId;
	}

}
