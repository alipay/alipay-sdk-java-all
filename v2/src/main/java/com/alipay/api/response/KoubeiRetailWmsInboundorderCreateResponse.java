package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.inboundorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 14:15:08
 */
public class KoubeiRetailWmsInboundorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2356175123498992527L;

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
