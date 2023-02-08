package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.logisticsorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 04:50:06
 */
public class AntMerchantExpandLogisticsorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4178478717358474889L;

	/** 
	 * 物流单id
	 */
	@ApiField("logistics_order_id")
	private String logisticsOrderId;

	public void setLogisticsOrderId(String logisticsOrderId) {
		this.logisticsOrderId = logisticsOrderId;
	}
	public String getLogisticsOrderId( ) {
		return this.logisticsOrderId;
	}

}
