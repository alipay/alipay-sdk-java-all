package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.logisticsorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 05:13:42
 */
public class AntMerchantExpandLogisticsorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8359576654742955737L;

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
