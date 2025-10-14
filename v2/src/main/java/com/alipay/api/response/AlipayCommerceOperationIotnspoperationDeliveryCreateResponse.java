package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.iotnspoperation.delivery.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-13 16:17:24
 */
public class AlipayCommerceOperationIotnspoperationDeliveryCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5493353997518555126L;

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
