package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.outboundwork.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 04:08:45
 */
public class KoubeiRetailWmsOutboundworkCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2898276581358978549L;

	/** 
	 * 出库作业id
	 */
	@ApiField("outbound_work_id")
	private String outboundWorkId;

	public void setOutboundWorkId(String outboundWorkId) {
		this.outboundWorkId = outboundWorkId;
	}
	public String getOutboundWorkId( ) {
		return this.outboundWorkId;
	}

}
