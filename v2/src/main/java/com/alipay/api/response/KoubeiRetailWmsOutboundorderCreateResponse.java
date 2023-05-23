package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.outboundorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 00:41:34
 */
public class KoubeiRetailWmsOutboundorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3861192538689399989L;

	/** 
	 * 出库通知单号
	 */
	@ApiField("outbound_order_id")
	private String outboundOrderId;

	public void setOutboundOrderId(String outboundOrderId) {
		this.outboundOrderId = outboundOrderId;
	}
	public String getOutboundOrderId( ) {
		return this.outboundOrderId;
	}

}
