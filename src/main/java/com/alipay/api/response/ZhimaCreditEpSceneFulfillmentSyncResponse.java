package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.scene.fulfillment.sync response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-27 17:13:06
 */
public class ZhimaCreditEpSceneFulfillmentSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1539322884172699361L;

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
