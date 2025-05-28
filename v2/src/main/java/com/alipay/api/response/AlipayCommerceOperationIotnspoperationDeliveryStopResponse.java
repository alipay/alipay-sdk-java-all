package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.iotnspoperation.delivery.stop response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-11 14:52:22
 */
public class AlipayCommerceOperationIotnspoperationDeliveryStopResponse extends AlipayResponse {

	private static final long serialVersionUID = 4743854639448685677L;

	/** 
	 * 碰一下推广计划id
	 */
	@ApiField("n_delivery_id")
	private String nDeliveryId;

	public void setnDeliveryId(String nDeliveryId) {
		this.nDeliveryId = nDeliveryId;
	}
	public String getnDeliveryId( ) {
		return this.nDeliveryId;
	}

}
