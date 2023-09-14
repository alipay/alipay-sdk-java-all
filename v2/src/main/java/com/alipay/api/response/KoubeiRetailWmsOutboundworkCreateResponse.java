package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.outboundwork.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 23:08:49
 */
public class KoubeiRetailWmsOutboundworkCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1433982938195554118L;

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
