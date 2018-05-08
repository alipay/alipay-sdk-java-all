package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.inboundorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2018-04-26 16:33:45
 */
public class KoubeiRetailWmsInboundorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5573762882953563223L;

	/** 
	 * 入库通知单id
	 */
	@ApiField("inbound_order_id")
	private String inboundOrderId;

	public void setInboundOrderId(String inboundOrderId) {
		this.inboundOrderId = inboundOrderId;
	}
	public String getInboundOrderId( ) {
		return this.inboundOrderId;
	}

}
