package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.logisticsorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:26:14
 */
public class AntMerchantExpandLogisticsorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4595379997648488467L;

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
