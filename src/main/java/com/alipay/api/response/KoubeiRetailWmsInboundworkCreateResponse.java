package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.inboundwork.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 04:01:31
 */
public class KoubeiRetailWmsInboundworkCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1618299572851852622L;

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
