package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.inboundwork.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiRetailWmsInboundworkCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7755182699412446448L;

	/** 
	 * 入库作业id
	 */
	@ApiField("inbound_work_id")
	private String inboundWorkId;

	public void setInboundWorkId(String inboundWorkId) {
		this.inboundWorkId = inboundWorkId;
	}
	public String getInboundWorkId( ) {
		return this.inboundWorkId;
	}

}
