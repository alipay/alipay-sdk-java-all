package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.scene.fulfillment.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-14 11:16:02
 */
public class ZhimaCreditEpSceneFulfillmentSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7468127471218992873L;

	/** 
	 * 履约单号
	 */
	@ApiField("fulfillment_order_no")
	private String fulfillmentOrderNo;

	public void setFulfillmentOrderNo(String fulfillmentOrderNo) {
		this.fulfillmentOrderNo = fulfillmentOrderNo;
	}
	public String getFulfillmentOrderNo( ) {
		return this.fulfillmentOrderNo;
	}

}
