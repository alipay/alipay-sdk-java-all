package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.open.kaifang.kaifang.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-05 14:26:47
 */
public class ZhimaOpenKaifangKaifangQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8276747545558996446L;

	/** 
	 * 555
	 */
	@ApiField("delivery_id")
	private String deliveryId;

	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}
	public String getDeliveryId( ) {
		return this.deliveryId;
	}

}
